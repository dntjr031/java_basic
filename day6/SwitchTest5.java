package com.day6;

import java.util.Scanner;

public class SwitchTest5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ���");
		int day = sc.nextInt();
		
		String result = "";
		
		switch(day) {
		
			case 1:
			case 2:
			case 3:
				result = "1��б�";
				break;
			case 4:
			case 5:
			case 6:
				result = "2��б�";
				break;
			case 7:
			case 8:
			case 9:
				result = "3��б�";
				break;
			case 10:
			case 11:
			case 12:
				result = "4��б�";
				break;
			default:
				result = "�߸� �����߾��";
		}
		
		System.out.println(day + "���� " + result + "�Դϴ�.");
		
		
		sc.close();

	}

}
