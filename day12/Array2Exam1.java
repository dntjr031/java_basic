package com.day12;

import java.util.Scanner;

public class Array2Exam1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] store = new int[8];
		
		while(true) {
			System.out.println("�����Ǹ��� ��ȣ<1~8>�� ���� �Ǹŷ��� �Է��ϼ���.<�������� Q>");
			String str1 = sc.nextLine();
			if(str1.equalsIgnoreCase("q")) break;
			String str2 = sc.nextLine();
			
			int num = Integer.parseInt(str1);
			int each = Integer.parseInt(str2);
			
			store[num-1] += each;
			
			System.out.println("�׷��ȣ : " + num + ", �Ǹŷ� : " + store[num-1]);
		}
		
		System.out.println("����Ǿ����ϴ�.");
		
		sc.close();

	}

}
