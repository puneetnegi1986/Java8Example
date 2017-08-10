package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArrays {

	public static void main(String arr[]) {

		String a = new String("a");
		String[] str = new String[] { new String("a"), "b", "c" };
		String[] str1 = new String[] { a, "b", "c" };
		
		System.out.println(" Array Equals  " + Arrays.equals(str, str1));
		String[] str5 = new String[9];
		Arrays.fill(str5, "puneet");		
		System.out.println(Arrays.toString(str5));
		
		String[][] str2 = new String[2][2];
		String[][] str3 = new String[2][2];
		str2[0] = str;
		str2[1] = str;
		str3[0] = str1;
		str3[1] = str1;
		
		System.out.println(" Array Deep Equals  " + Arrays.deepEquals(str2, str3));
		System.out.println(" Array Deep ToString  " + Arrays.deepToString(str2));
		
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		List<String> list1 = new ArrayList<>();
		list1.add(a);
		list1.add("b");
		list1.add("c");
		
		System.out.println(" List Equals " + list1.equals(list));
	}

}
