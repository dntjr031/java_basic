package com.day6;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		//���, ����, 0
		//=> if
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�!");
		int n = sc.nextInt();
		
		String result = "";
		
		if(n > 0) {
			result = "���";
		}else if(n < 0) {
			
			result = "����";
		}else {
			result = "0";
		}
		System.out.println("��� : " + result);
		
		
		//=> ���׿�����
		result = (n > 0) ? "���" : (n < 0)? "����" : "0";
		System.out.println("���׿����� �̿� : " + result);
		
		sc.close();

	}

}
