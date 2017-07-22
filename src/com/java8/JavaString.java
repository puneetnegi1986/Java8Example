package com.java8;

import java.util.ArrayList;
import java.util.List;

public class JavaString {
	
	public static void main(String arr[]){
		
		System.out.println("hh"+4+5);
		String str2="puneet";
		String str1= new String("puneet");
		String str3=str1.intern();
		
		System.out.println();
		List <String>list=new ArrayList<String>();
		list.add("puneet");
		list.add("is");
		list.add("not");
		list.add("going");
		list.add("to");
		list.add("office");
		System.out.println(String.join(" ", list));
		if(str2==str3){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
	}
}
