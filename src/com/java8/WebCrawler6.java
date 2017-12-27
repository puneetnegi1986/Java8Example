package com.java8;


import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.htmlparser.Parser;
import org.htmlparser.filters.NodeClassFilter;
import org.htmlparser.tags.LinkTag;
import org.htmlparser.util.NodeList;


public class WebCrawler6 implements LinkHandler {

    private final Collection<String> visitedLinks = Collections.synchronizedSet(new HashSet<String>());
    private String url;
    private ExecutorService execService;

    public WebCrawler6(String startingURL, int maxThreads) {
        this.url = startingURL;
        execService = Executors.newFixedThreadPool(maxThreads);
    }

    @Override
    public void queueLink(String link) throws Exception {
        startNewThread(link);
    }

    @Override
    public int size() {
        return visitedLinks.size();
    }

    @Override
    public void addVisited(String s) {
        visitedLinks.add(s);
    }

    @Override
    public boolean visited(String s) {
    	System.out.println("Visited: "+s);
        return visitedLinks.contains(s);
    }

    private void startNewThread(String link) throws Exception {
        execService.execute(new LinkFinder(link, this));
    }

    private void startCrawling() throws Exception {
        startNewThread(this.url);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        new WebCrawler6("http://www.birlasoft.com", 16).startCrawling();
    }
}

 interface LinkHandler {

    /**
     * Places the link in the queue
     * @param link
     * @throws Exception
     */
    void queueLink(String link) throws Exception;

    /**
     * Returns the number of visited links
     * @return
     */
    int size();

    /**
     * Checks if the link was already visited
     * @param link
     * @return
     */
    boolean visited(String link);

    /**
     * Marks this link as visited
     * @param link
     */
    void addVisited(String link);
}
 
 class LinkFinder implements Runnable {

	    private String url;
	    private LinkHandler linkHandler;
	    /**
	     * Used fot statistics
	     */
	    private static final long t0 = System.nanoTime();

	    public LinkFinder(String url, LinkHandler handler) {
	        this.url = url;
	        this.linkHandler = handler;
	    }

	    @Override
	    public void run() {
	        getSimpleLinks(url);
	    }

	    private void getSimpleLinks(String url) {
	        //if not already visited
	        if (!linkHandler.visited(url)) {
	            try {
	                URL uriLink = new URL(url);
	                Parser parser = new Parser(uriLink.openConnection());
	                NodeList list = parser.extractAllNodesThatMatch(new NodeClassFilter(LinkTag.class));
	                List<String> urls = new ArrayList<String>();

	                 for (int i = 0; i < list.size(); i++) {
	                    LinkTag extracted = (LinkTag) list.elementAt(i);

	                    if (!extracted.getLink().isEmpty()
	                            && !linkHandler.visited(extracted.getLink())) {

	                        urls.add(extracted.getLink());
	                    }

	                }
	                //we visited this url
	                linkHandler.addVisited(url);

	                if (linkHandler.size() == 1500) {
	                    System.out.println("Time to visit 1500 distinct links = " + (System.nanoTime() - t0));                   
	                }

	                for (String l : urls) {
	                    linkHandler.queueLink(l);
	                }

	             } catch (Exception e) {
	                //ignore all errors for now
	            }
	        }
	    }
	}