package com.day22.collection;

public class ObjectTest2 {

	public static void main(String[] args) {

		Person p = new Person("홍길동", 25);
		System.out.println("p : " + p);
		System.out.println("p.toString() : "+ p.toString());
	}

}

class Person{
	private String name;
	private int age;
	
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
	}
	
}