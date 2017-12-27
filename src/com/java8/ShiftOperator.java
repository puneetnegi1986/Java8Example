package com.java8;

public class ShiftOperator {
	public static void main(String arr[]) {
		System.out.println("Value of a :"+test());
	}
	 private static int test(){
		  int a = 10;
		  try {
		   return a;
		  } catch (Exception e) {
		   a = 20;
		   System.out.println("a in catch : "+a);
		  }finally{
		   a = 30;
		   System.out.println("a in finally : "+a);
		  }
		  a = 40;
		  System.out.println("a outside try-catch : "+a);
		  return a;
		 }
	 
	 private static void test1(){
		  try {
			  int i=10;
			  System.out.println("abs");
		  } catch (Exception e) {}     
		 }
}
