package com.day7;

import java.util.Scanner;

public class WhileTest1 {

	public static void main(String[] args) {

		//�ݺ��� - while
		/*
		 *	while(���ǽ�){
		 * 		�ݺ��� ����;
		 * 	}
		 * => ���ǽ��� ���� ���� �ݺ��� ������ �ݺ�
		 */
		
		Scanner sc = new Scanner("\n\n������ �ϳ� ��\n\n��\n\n");
		String str = "";
		
		//public boolean hasNext()
		
		while(sc.hasNext()) {
			str = sc.nextLine();
			System.out.println("��� : " + str);
		}//while
		
		str = sc.nextLine();
		System.out.println("while Ż�� ��1 : " + str);
		
		str = sc.nextLine(); //���࿡�� - No line found 
		System.out.println("while Ż�� ��2 : " + str);
		
		sc.close();
		
	}

}
