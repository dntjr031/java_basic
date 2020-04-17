package com.day22;

import java.util.Scanner;

public class IdExam1 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("�ֹι�ȣ�� �Է��ϼ���(\"-\" ���� 14�ڸ�)");
				String id = sc.nextLine();
				if(id.length() != 14) {
					throw new IdNumException();
				}
				
				System.out.println("\n�ֹι�ȣ : " + id);
				
			} catch (IdNumException e) {
				System.out.println(e.getMessage());
				
			}finally {
				sc.close();
			}
			System.out.println("\n���α׷��� ���������� ����Ǿ����ϴ�!!");

	}

}

class IdNumException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	public IdNumException() {
		super("�ֹι�ȣ�� �߸� �Է��߽��ϴ�.");
	}

}