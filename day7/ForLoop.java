package com.day7;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		/*
		 * ���ѷ��� - ������ �ݺ��Ǵ� ���� ����
		 * 
		 * 	for(;;){
		 * 		�ݺ��� ���;
		 * 		if(���ǽ�) break;	
		 * 	}
		 * 
		 * => ���� �����ȿ����� break�� ����ؼ� �ݺ����� ���������� �ؾ� ��
		 */

		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.println("���� ��!!!!");
			System.out.println("��� �Ͻðڽ��ϱ�?(Y/N)");
			String gameYn = sc.nextLine();
			
			if(gameYn.equalsIgnoreCase("y")) break;
		} //for
		System.out.println("����Ǿ����ϴ�.");
		sc.close();

	}

}
