package com.day15;


public class PersonTest {

	public static void main(String[] args) {
		
		System.out.println("count = " + Person.count + "\n");
		
		Person p = new Person("ȫ�浿", 20);
		p.display();
		
		Person p2 = new Person("��浿", 25);
		p2.display();

	}

}
