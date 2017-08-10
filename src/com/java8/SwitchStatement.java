package com.java8;

public class SwitchStatement {

	public static void main(String arr[]) {
		int i = 5;
		int j = 1;

		switch (i) {
		case 0:System.out.println("Case0 "+j);
			break;
		case 1:
			System.out.println("Case1 "+j);j++;
		case 2:
			System.out.println("Case2 "+j);j++;
		case 3:
			System.out.println("Case3 "+j);j++;
		case 4:
			System.out.println("Case4 "+j);j++;
		case 5:
			System.out.println("Case5 "+j);j++;;
		default:
			System.out.println("Case6 "+j);j++;
		}
		System.out.println(j);
	}

}
