package com.day16;

import java.util.Scanner;

public class HumanTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Teacher t = new Teacher();
		Programmer p = new Programmer();
		System.out.println("�̸�, ����, ���� �Է�");
		t.setName(sc.nextLine());
		t.setAge(sc.nextInt());
		sc.nextLine();
		t.setSubject(sc.nextLine());
		System.out.println("�̸�: " + t.getName());
		System.out.println("����: " + t.getAge());
		System.out.println("����: " + t.getSubject());
		t.work();
		
		System.out.println("===================");
		
		System.out.println("�̸�, ����, ���߰���� �Է�");
		p.setName(sc.nextLine());
		p.setAge(sc.nextInt());
		sc.nextLine();
		p.setCareer(sc.nextLine());
		System.out.println("�̸�: " + p.getName());
		System.out.println("����: " + p.getAge());
		System.out.println("���߰��: " + p.getCareer());
		p.work();
		
		sc.close();

	}

}
