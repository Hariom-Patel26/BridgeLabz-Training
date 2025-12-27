package com.constructors.level1;

public class Person {
	String name;
	int age ;
	
	Person(String name , int age) {
		this.name = name;
		this.age = age ;
	}
	
	Person (Person one) {
		this.name =one.name;
		this.age = one.age;
	}

	public static void main(String[] args) {
		Person one = new Person("naman" , 24);
		Person two = new Person (one);
		// TODO Auto-generated method stub

	}

}
