package com.java8;

public class MainMethod {
	
  public static String str="puneet";
  
	    static void fun() {
	        str="ashish";
	    }

	    public static void main(String args[]) {
	    	str="puneet";
	    	fun();
	          System.out.println("My name is "+str);
	    }

	}