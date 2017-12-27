package com.java8;

public class JavaOverriding {

	public Animal getAnimal(Animal animal){
		
		return animal;
	}
	
	public long sum(long... a){
		System.out.println(" Long data");
		long sum=0;
		for(long i: a){
			sum=sum+i;
		}
		return sum;
	}
	
	public int sum(int... a){
		System.out.println(" Int Data");
		int sum=0;
		for(int i: a){
			sum=sum+i;
		}
		return sum;
	}
	
	public int sum(int a,int b){
		System.out.println(" Int with 2 param");
		int sum=0;
			sum=a+b;
		return sum;
	}
	
	public long sum(long a,long b){
		System.out.println("  long with 2 param");
		long sum=0;
			sum=a+b;
		return sum;
	}
	
	public static void main(String arr[]){
		JavaOverriding javaOverriding=new JavaOverriding();
		int a=18;
		 int b=17;
		System.out.println(javaOverriding.sum(35,5,5,3,5,a,b));
		System.out.println(javaOverriding.sum( a,b));
	}
}

class NewClass extends JavaOverriding{
	
	public Dog getAnimal(Dog dog){
		
		return new Dog();	
	}
	
	
	public Animal getAnimal(Animal animal){
		
		return animal;
	}
}

class Animal{

	public String bark()throws Exception{
		
		return "no no";
	}
}	
	class Dog extends Animal{
		
		@Override
		public String bark() {
			
			return "bhoo bhoo";
		}
	}
	