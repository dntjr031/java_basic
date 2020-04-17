package com.day22;

import java.util.Scanner;

public class IdNumExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("주민번호를 입력하세요");
			String id = sc.nextLine();
			if(id.length() != 13) {
				throw new Exception("주민번호를 잘못 입력했습니다. 13자리를 입력하세요.");
			}
			System.out.println("\n주민번호 : " + id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}finally {
			sc.close();
		}
		System.out.println("\n프로그램이 정상적으로 종료되었습니다!!");
		
	}

}
