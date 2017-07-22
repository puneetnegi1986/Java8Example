package com.java8;

public class MainClass extends AbstractClass {

	public MainClass(int x, int y) {
		super(x, y);	
	}

	public  void sum(short x,short y){
		
		System.out.println("int get called..");
	}
	
   @SuppressWarnings("finally")
public int  sum(int x,int y){
	   
	   try{		
		System.out.println("try  block get called..");
		return 2;
	   	}catch(Exception e){
			System.out.println("catch Block");
			return 3;
		}finally{
			System.out.println("Finally Block");
			return 4;
		}
	}
	
	public static void main(String arr[]){
		
		MainClass mainclass=new MainClass(2,3);		
				mainclass.sum(3,5);		
	}
}
