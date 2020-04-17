package com.day15;


public class PersonTest {

	public static void main(String[] args) {
		
		System.out.println("count = " + Person.count + "\n");
		
		Person p = new Person("È«±æµ¿", 20);
		p.display();
		
		Person p2 = new Person("±è±æµ¿", 25);
		p2.display();

	}

}
