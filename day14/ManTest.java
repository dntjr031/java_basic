package com.day14;

public class ManTest {

	public static void main(String[] args) {

		Man m = new Man();
		// m.age = 10; // private
		m.setAge(20);
		m.height = 180;
		
		System.out.println("���� : " + m.getAge()); //getter �� �̿��� ��������� ���� �о�´�.
		System.out.println("Ű : " + m.height);
		
		System.out.println("=================");
		
		Man2 m2 = new Man2();
		m2.setAge(20);
		
		System.out.println("���̴� : " + m2.getAge());
		
		m2.setAge(-5);
		System.out.println("���̴� : " + m2.getAge());
	}

}
