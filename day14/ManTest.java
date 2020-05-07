package com.day14;

public class ManTest {

	public static void main(String[] args) {

		Man m = new Man();
		// m.age = 10; // private
		m.setAge(20);
		m.height = 180;
		
		System.out.println("나이 : " + m.getAge()); //getter 를 이용해 멤버변수의 값을 읽어온다.
		System.out.println("키 : " + m.height);
		
		System.out.println("=================");
		
		Man2 m2 = new Man2();
		m2.setAge(20);
		
		System.out.println("나이는 : " + m2.getAge());
		
		m2.setAge(-5);
		System.out.println("나이는 : " + m2.getAge());
	}

}
