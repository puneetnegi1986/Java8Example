package com.java8;

import java.util.ArrayList;
import java.util.List;

public class JavaCollection {

	public static void main(String arr[]) {

		DataMap<Integer, Integer> dataMap = new DataMap<>();
		dataMap.putData(1, 64276);
		System.out.println(dataMap.getData(1));

		Exp exp = new Exp();
		exp.putData("Abc", "xyz");
		JavaCollection javaCollection = new JavaCollection();
		List<Animals> list = javaCollection.getAnimalsCollection();
		list.forEach(a -> System.out.println(a.getName()));
	}

	public List<Animals> getAnimalsCollection() {

		List<Animals> list = new ArrayList<>();
		list.add(new Dogs());
		list.add(new Cat());
		list.add(new Animals("animal"));
		return list;
	}

}

class DataMap<K, V> {
	V v = null;
	K k = null;

	public V getData(K k) {
		return v;
	}

	public void putData(K k, V v) {
		this.k = k;
		this.v = v;
	}

}

class Exp extends DataMap<String, String> {

}

class Animals {
	private String name;

	Animals(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Cat extends Animals {

	Cat() {
		super("cat");
	}

}

class Dogs extends Animals {

	Dogs() {
		super("dog");
	}
}