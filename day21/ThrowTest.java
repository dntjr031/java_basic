package com.day21;

import java.util.Scanner;

public class ThrowTest {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//throw�� - ������ ���� �߻���ų �� ���
		//�ڹ� ����ӽſ� ���� �νĵ� �� �ִ� ���� ��Ȳ�� �ƴ�����,
		//���α׷��� ���ݿ� ���� �����ڰ� ������ ���ܻ�Ȳ�� ���
		//(�� : ���� �Է½� 0���� ���� ���� �ԷµǾ���)
		// throw new Exception("�����޼���");
		
		try {
			System.out.println("���� �Է�");
			int age = sc.nextInt();
			
			if(age<0) {
				throw new Exception("���̴� ����� �����մϴ�.");
				//=> Exception(String message) �� �����ڸ� ����� ��
			}
			System.out.println("���� : " + age);
		}catch(Exception e) {
			System.out.println("���ܹ߻� : " + e.getMessage());
		}
		
		System.out.println("\n====next====");
	}

}
