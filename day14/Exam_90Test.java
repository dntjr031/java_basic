package com.day14;

import java.util.Scanner;

public class Exam_90Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// [1]
		
		while(true) {
			System.out.println("����<0>, ����<1>, ��<2>, Q<Quit>�� �Է����ּ���");
			String user = sc.nextLine();
			
			if(user.equalsIgnoreCase("q")) break;
			
			if(!(Integer.parseInt(user) >=0 && Integer.parseInt(user) < 3)) {
				System.out.println("�߸��Է�!");
				break;
			}
			
			Exam_90 ex = new Exam_90();
			
			int com = (int)Math.random()*3;
			
			
			ex.setUser1(Integer.parseInt(user));
			ex.setCom1(com);
			ex.game1();
			
			System.out.println("����� = " + ex.change(Integer.parseInt(user)));
			System.out.println("��ǻ�� = " + ex.change(com));
			System.out.println("���= ����ڰ� " + ex.getResult1());
			
		}
		
		
		Exam_90 ex = new Exam_90();
		while(true) {
			System.out.println("����<0>, ����<1>, ��<2>, Q<Quit>�� �Է����ּ���");
			String user = sc.nextLine();
			
			if(user.equalsIgnoreCase("q")) break;
			
			if(!(Integer.parseInt(user) >=0 && Integer.parseInt(user) < 3)) {
				System.out.println("�߸��Է�!");
				break;
			}
			
			int com = (int)Math.random()*3;
			ex.game(Integer.parseInt(user), com);
			ex.setUser(Integer.parseInt(user));
			ex.setCom(com);
			
			System.out.println("����� = " + ex.getUser());
			System.out.println("��ǻ�� = " + ex.getCom());
			System.out.println("���= ����ڰ� " + ex.getResult());
			
		}
		
		System.out.println("����Ǿ����ϴ�.");
		
		sc.close();
		
	}

}
