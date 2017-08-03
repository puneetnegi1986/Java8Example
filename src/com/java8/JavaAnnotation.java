package com.java8;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class JavaAnnotation {
	
 public static void main(String arr[]){
	 
	 Class<ApplyAnnotation> applyAnnotation = ApplyAnnotation.class;
	 for(Method method:applyAnnotation.getMethods()){
		 for(Annotation annotation:method.getAnnotations()){
			 if(annotation instanceof MyAnnotation){
				 MyAnnotation annotation1= (MyAnnotation)annotation ;				 
				 System.out.println(annotation1.path()+ "   "+annotation1.value());
			 }
		 }
	 }
	 System.out.println();
 }
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
	
	String path();
	String value();
	
}

class ApplyAnnotation{
	
	@MyAnnotation(path="d://",value="abc")
	public void get(){
		System.out.println("Annotation is get proceessed..");
	}
}