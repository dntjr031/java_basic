package com.day22;

import java.util.Scanner;

//����� ���� ���� Ŭ���� �����
//Exception�� ��ӹް�, Exception(String message) �����ڿ� �Ű������� �־��ָ� ��
class AgeException2 extends Exception{

	private static final long serialVersionUID = 1L;

	public AgeException2() {
		super("���̴� ����� �����մϴ�"); //public Exception(String message)�� message�� �ѱ�� ��
	}
	
}
public class UserExceptionTest2 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		try {
			System.out.println("���� �Է�");
			int age = sc.nextInt();
			if(age<0) {
				throw new AgeException2();
			}
			
			System.out.println("���� : " + age);
		}catch(AgeException2 e) {
			System.out.println("���ܹ߻� : " + e.getMessage());
		}
		
		System.out.println("\n====next====");
	}

}
