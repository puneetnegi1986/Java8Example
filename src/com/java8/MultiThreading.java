package com.java8;

public class MultiThreading {

	public static void main(String arr[]) {
		Thread t1 = new Thread(new ThreadDemo());
		Thread t2 = new Thread(new ThreadDemo());
		t1.start();		
		try {
			// Thread T1 will execute first , after that thread T2 will get executed.
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}  
		t2.start();
		
	}
}

class ThreadDemo implements Runnable {

	@Override
	public void run() {

		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+"   value.. "+i);
		}
		
	}

}