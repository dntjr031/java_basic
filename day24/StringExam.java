package com.day24;

import java.util.Scanner;

public class StringExam {

	public static void main(String[] args) {
		
		
		String s1 = "test.txt";
		String sub1 = s1.substring(0, s1.lastIndexOf('.'));
		String sub2 = s1.substring(s1.lastIndexOf('.'));
		System.out.println("���ϸ�:" + sub1 + "Ȯ����:" + sub2);
		
		System.out.println();
		String s2 = "�ȳ��ϼ���\n\n ���� ȫ�浿�Դϴ�.";
		String reS = s2.replace("\n\n", "<br>");
		System.out.println(reS);
		
		System.out.println();
		String s3 = "c:\\shop\\upload\\test.txt";
		String sub3 = s3.substring(s3.lastIndexOf("\\") + 1, s3.lastIndexOf("."));
		String sub4 = s3.substring(s3.lastIndexOf(".") + 1);
		String sub5 = s3.substring(0,s3.lastIndexOf("\\"));
		System.out.println("����:" + sub5);
		System.out.println("���ϸ�:" + sub3);
		System.out.println("Ȯ����:" + sub4);
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("URL�ּҸ� �Է��ϼ���");
		String add = sc.nextLine();
		if(add.indexOf("http://www.mall.com") != -1) {
			System.out.println("�ش� url �ּ�:" + add);
		}else{
			System.out.println("url �ּҰ� �������� �ʽ��ϴ�.");
		}
		
		System.out.println();
		System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���(������ ����)");
		String id = sc.nextLine();
		String gender = "";
		
		if(id.substring(6,7) == "1" || id.substring(6,7) == "3") {
			gender = "��";
		}else if(id.substring(6,7) == "2" || id.substring(6,7) == "4"){
			gender = "��";
		}
		
		String year;
		if(id.substring(6,7) == "3" || id.substring(6,7) == "4") { // equals��뵵 ����
			year = "20" + id.substring(0,2);
		}else if(id.substring(6,7) == "1" || id.substring(6,7) == "2"){
			year = "19" + id.substring(0,2);
		}else {
			year = "�߸��Է�";
		}
		
		String month = id.substring(2, 4);
		String day = id.substring(4,6);
		System.out.println(year + "�� " + month + "�� " + day + "�� " + ", " + gender);
		
		sc.close();
	}

}
