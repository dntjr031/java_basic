package com.day22.collection;

public class ObjectTest2 {

	public static void main(String[] args) {

		Person p = new Person("ȫ�浿", 25);
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
		System.out.println("�̸�:" + name);
		System.out.println("����:" + age);
	}
	
}