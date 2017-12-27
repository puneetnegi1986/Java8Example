package com.java8;

public class ExceptionHandling {
	
	public static void main(String arr[]){
		
		ExceptionHandling exp=new ExceptionHandling();	
	 System.out.println(exp.div(3,0));
	}

	public int Sum(int a,int b) throws MyException{
		
		int c=a+b;
		if(a==0){
			throw new MyException();
		}		
		return c;
	}
	
	public int div(int a,int b){
		
		int c=0;
		if(b==0){
			throw new MyNewException("devider is zero..");
		}else{
			c=a/b;
		}		
		return c;
	}
	
	public int display(){
		
		int c=0;
		try {
			System.out.println("Try block");
		}catch(Exception e) {
			System.out.println("Catch Block");
		}finally {
			System.out.println("Finally Blcok");
		}
		return c;
		
		
	}
}


class MyException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private String message=null;
	
	MyException(){
		super();
	}
	
	MyException(String message){
		super(message);
		this.message=message;
	}
	
	MyException(Throwable clause){
		super(clause);
		
	}
	
	@Override
	public String getMessage(){
		return message;
	}
	
	@Override
	public String toString(){
		return message;
	}
}

class MyNewException extends RuntimeException{
	

	private static final long serialVersionUID = 1L;
	private String message=null;
	MyNewException(){
		super();
	}
	
	MyNewException(String message){
		super(message);
		this.message=message;
	}
	
	MyNewException(Throwable clause){
		super(clause);	
	}
	
	@Override
	public String getMessage(){
		return message;
	}
	
	@Override
	public String toString(){
		return message;
	}
	
	
}