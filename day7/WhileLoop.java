package com.day7;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// while�� �̿��� ���ѷ���
		/*
		 * 	while(true_{
		 * 		�ݺ��� ���;
		 * 		Ư�������� ��� break;
		 * }
		 */
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("������ �Է��ϼ���. �������� 0�Է�");
			int n = sc.nextInt();
			
			String result = "";
			if(n == 0) {
				break;
			}else if(n > 0) {
				result = "����Դϴ�.";
			}else {
				result = "�����Դϴ�.";
			}
			System.out.println(result + "\n");
			
		}//while
		
		System.out.println("����Ǿ����ϴ�.");
		sc.close();

	}

}
