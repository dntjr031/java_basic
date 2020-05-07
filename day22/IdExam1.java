package com.day22;

import java.util.Scanner;

public class IdExam1 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("주민번호를 입력하세요(\"-\" 포함 14자리)");
				String id = sc.nextLine();
				if(id.length() != 14) {
					throw new IdNumException();
				}
				
				System.out.println("\n주민번호 : " + id);
				
			} catch (IdNumException e) {
				System.out.println(e.getMessage());
				
			}finally {
				sc.close();
			}
			System.out.println("\n프로그램이 정상적으로 종료되었습니다!!");

	}

}

class IdNumException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	public IdNumException() {
		super("주민번호를 잘못 입력했습니다.");
	}

}
