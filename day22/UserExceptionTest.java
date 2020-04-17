package com.day22;

import java.util.Scanner;

//����� ���� ���� Ŭ���� �����
//Exception�� ��ӹް�, Exception(String message) �����ڿ� �Ű������� �־��ָ� ��
class AgeException extends Exception{

	private static final long serialVersionUID = 1L;

	public AgeException(String message) {
		super(message); //public Exception(String message)�� message�� �ѱ�� ��
	}
	
}
public class UserExceptionTest {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		try {
			System.out.println("���� �Է�");
			int age = sc.nextInt();
			if(age<0) {
				throw new AgeException("���̴� ����� �����մϴ�.");
			}
			
			System.out.println("���� : " + age);
		}catch(AgeException e) {
			System.out.println("���ܹ߻� : " + e.getMessage());
		}
		
		System.out.println("\n====next====");
	}

}
