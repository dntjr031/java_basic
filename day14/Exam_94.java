package com.day14;

import java.util.Scanner;

public class Exam_94 {

	//[1�ܰ�]
	private String name, tel, birth;
	
	public Exam_94(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public Exam_94(String name, String tel, String birth) {
		this.name = name;
		this.tel = tel;
		this.birth = birth;
	}

	public void printInfo() {
		System.out.println("name : " + name);
		System.out.println("phone : " + tel);
		if(birth!=null && !birth.isEmpty())
			System.out.println("birth: "+birth);
		System.out.println();
	}
}

class phone{
	
	public static void showMenu(){
		System.out.println("�����ϼ���...");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ���α׷� ����");
		System.out.print("����: ");
	}
	
	public static void inputData(){
		Scanner sc=new Scanner(System.in);

		System.out.print("�̸�: ");
		String name=sc.nextLine();
		System.out.print("��ȭ��ȣ: ");
		String phone=sc.nextLine();
		System.out.print("�������: ");
		String birth=sc.nextLine();
		
		Exam_94 info=new Exam_94(name, phone, birth);

		System.out.println("\n=======�Էµ� ���� ���========");
		info.printInfo();
		sc.close();
	}
	
}
