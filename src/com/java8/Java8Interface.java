package com.java8;

public class Java8Interface {
	public static void main(String arr[]) {
		Example example =new Example();
		example.run();
	}

}

/**
 * We Need to override the run method
 * @author puneet.negi
 *
 */
class Example implements flyable,fly{

	@Override
	public void run() {
    System.out.println(" run method is overriden");
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}	
}

class Example1 implements flyable,fly{

	@Override
	public void run() {
		fly.super.run();
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

	

	
}

@FunctionalInterface
interface flyable{
	default void fly(){
		System.out.println("Object is flying..");
	}
	
	default void run(){
		System.out.println("Object is running..");
	}
	
   public static void sing(){
	   System.out.println("Object is singing");
   }
   
   public void execute();
	 
}

interface fly{

	default void run(){
		System.out.println("Object is running..");
	}
	
	interface Abc{
		public void ask();
	}
	
}