package com.day14;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�, ����, ��ȭ��ȣ �Է�!");
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String tel = sc.nextLine();
		
		Person p = new Person(name, tel, age);
		p.showInfo();
		
		// getter/ setter ����
		
		p.setName("ȫ�浿");
		p.setAge(25);
		p.setPhone("010-100-3000");
		
		System.out.println("\n����� �̸� : " + p.getName());
		System.out.println("���� : " + p.getAge());
		System.out.println("��ȭ��ȣ : " + p.getPhone());
		

		sc.close();
	}

}
