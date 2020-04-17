package com.day14;

import java.util.Scanner;

public class Exam_94 {

	//[1단계]
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
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 프로그램 종료");
		System.out.print("선택: ");
	}
	
	public static void inputData(){
		Scanner sc=new Scanner(System.in);

		System.out.print("이름: ");
		String name=sc.nextLine();
		System.out.print("전화번호: ");
		String phone=sc.nextLine();
		System.out.print("생년월일: ");
		String birth=sc.nextLine();
		
		Exam_94 info=new Exam_94(name, phone, birth);

		System.out.println("\n=======입력된 정보 출력========");
		info.printInfo();
		sc.close();
	}
	
}
