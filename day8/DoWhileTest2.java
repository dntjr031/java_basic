package com.day8;

import java.util.Scanner;

public class DoWhileTest2 {

	public static void main(String[] args) {

		// ����ڷκ��� �Է¹��� ���ڵ��� ���� ���� ���
		// ����ڰ� 0�� �Է��� ������ �ݺ�
		
		//1. ��ĳ�� �Է�
		Scanner sc = new Scanner(System.in);
		
		//2. �Է¹��� ������ ������ ���� ����
		int num;
		int sum = 0;
		do{
			
			//3. do~while�� ����ڷκ��� ���� �Է¹���
			System.out.println("���ڸ� �Է��ϼ���");
			num = sc.nextInt();
			
			//4. �Է¹��� ������ ����	
			sum += num;
			
		//5. Ż������ �Է�
		}while(num != 0);
		
		//6. ������ ������ ���� �Է�
		System.out.println("\n�Էµ� ������ �� : "+ sum);
		
		//7. ��ĳ�� ����
		sc.close();

	}

}
