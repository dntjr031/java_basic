package com.day22;

import java.util.Scanner;

public class IdNumExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("�ֹι�ȣ�� �Է��ϼ���");
			String id = sc.nextLine();
			if(id.length() != 13) {
				throw new Exception("�ֹι�ȣ�� �߸� �Է��߽��ϴ�. 13�ڸ��� �Է��ϼ���.");
			}
			System.out.println("\n�ֹι�ȣ : " + id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}finally {
			sc.close();
		}
		System.out.println("\n���α׷��� ���������� ����Ǿ����ϴ�!!");
		
	}

}
