package com.day22;

import java.util.Scanner;

public class FinallyTest {

	public static void main(String[] args) {
		/*
		 try{
		 	
		 }catch(Exception e){
		 
		 }finally{
		 	���� �߻����ο� ������� �ݵ�� ����Ǿ�� �ϴ� ������ �ִ´�
		 	�ַ� �ڿ� ������ ���
		 }
		 */
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("0�̳� 2 �Է�!");
			int num = sc.nextInt();
			
			int result = 100/num;
			System.out.println("100/" + num + "=" + result);
		}catch(Exception e) {
			System.out.println("���ܹ߻� : " + e.getMessage());
			
		}finally {
			//���ܰ� �߻��Ǿ �����ϰ�, �߻����� �ʾƵ� ������
			System.out.println("�ݵ�� ����Ǿ�� ��");
		}
		System.out.println("\n=====next=====");
		sc.close();
	}

}
