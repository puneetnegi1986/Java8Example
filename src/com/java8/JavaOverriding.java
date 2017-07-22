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
	
	public static void main(String arr[]){
		JavaOverriding javaOverriding=new JavaOverriding();
		int a=18;
		int b=17;
		System.out.println(javaOverriding.sum(3l,6,8,9,100,a,b));
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

	public String bark(){
		
		return "no no";
	}
}	
	class Dog extends Animal{
	
	}
	