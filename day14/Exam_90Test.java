package com.day14;

import java.util.Scanner;

public class Exam_90Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// [1]
		
		while(true) {
			System.out.println("가위<0>, 바위<1>, 보<2>, Q<Quit>를 입력해주세요");
			String user = sc.nextLine();
			
			if(user.equalsIgnoreCase("q")) break;
			
			if(!(Integer.parseInt(user) >=0 && Integer.parseInt(user) < 3)) {
				System.out.println("잘못입력!");
				break;
			}
			
			Exam_90 ex = new Exam_90();
			
			int com = (int)Math.random()*3;
			
			
			ex.setUser1(Integer.parseInt(user));
			ex.setCom1(com);
			ex.game1();
			
			System.out.println("사용자 = " + ex.change(Integer.parseInt(user)));
			System.out.println("컴퓨터 = " + ex.change(com));
			System.out.println("결과= 사용자가 " + ex.getResult1());
			
		}
		
		
		Exam_90 ex = new Exam_90();
		while(true) {
			System.out.println("가위<0>, 바위<1>, 보<2>, Q<Quit>를 입력해주세요");
			String user = sc.nextLine();
			
			if(user.equalsIgnoreCase("q")) break;
			
			if(!(Integer.parseInt(user) >=0 && Integer.parseInt(user) < 3)) {
				System.out.println("잘못입력!");
				break;
			}
			
			int com = (int)Math.random()*3;
			ex.game(Integer.parseInt(user), com);
			ex.setUser(Integer.parseInt(user));
			ex.setCom(com);
			
			System.out.println("사용자 = " + ex.getUser());
			System.out.println("컴퓨터 = " + ex.getCom());
			System.out.println("결과= 사용자가 " + ex.getResult());
			
		}
		
		System.out.println("종료되었습니다.");
		
		sc.close();
		
	}

}
