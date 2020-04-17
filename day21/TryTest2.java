package com.day21;

import java.util.Scanner;

public class TryTest2 {

	public static void main(String[] args) {
		/*
		 ����(Exception) 
		 - ���α׷� ���൵�� �߻��ϴ� ����
		 	���ܰ� �߻��ϸ� ���α׷��� ������ �����
		 	
		 ������ ����
		 [1] ������ ����(Compile Error)
		 [2] ���� ����(Runtime Error)
		 	1) ����(Error) - �޸� ������ ���� ������ �� ���� �ɰ��� ����
		 	2) ����(Exception) - �߻��ϴ��� ������ �� �ִ� �� �ɰ��� ����
		 	
		 ���� ó�� - ���ܹ߻��� ����� �ڵ带 �ۼ��ϴ� ��
		 		���α׷� ���൵�� �߻��� ������ ó���Ͽ�, ���α׷��� ������ ����Ǵ� ���� ���°�
		 		
		 try{
		 	���ܰ� �߻��� ���� �ڵ带 �ִ´�
		 }catch(Exception e){
		 	���� �߻��� ó���� �ڵ�
		 }
		 */
		System.out.println("====���� ó���� �� ���====");
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("�� ���� �Է�!");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int result = n1/n2; 
			System.out.println("������ ��� : " + result);
			
		}catch(Exception e) {
			
			System.out.println("�������� �� �� �����ϴ�.");
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("\n======���� ����!!=====");
		
		sc.close();
		
	}

}
