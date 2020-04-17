package com.day21;

import java.util.Scanner;

public class BaseballExam {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Pitcher p = new Pitcher();
		Umpire u = new Umpire();
		p.inputAnswel();
		
		for(int i = 0; i < 10; i++) {
			u.setBall(0);
			u.setStrike(0);
			System.out.println("다른 세 수를 입력하세요(0~9)");
			int a1 = sc.nextInt();
			int a2 = sc.nextInt();
			int a3 = sc.nextInt();
			sc.nextLine();
			Hitter h = new Hitter(a1, a2, a3);
			
			u.result(h.getUser(), p.getAnswel());
			
			if(u.getStrike() == 3) {
				System.out.println("You Win in " + (i+1));
				p.showAnswel();
				System.out.println("\n계속하시겠습니까?(Y/N)");
				String str = sc.nextLine();
				
				if(str.equalsIgnoreCase("Y")) {
					i = -1;
					u.setBall(0);
					u.setStrike(0);
					p.inputAnswel();
					continue;
				}else if(str.equalsIgnoreCase("N")) {
					System.out.println("종료되었습니다.");
					return;
				}else {
					System.out.println("잘못입력! 프로그램을 종료합니다");
					return;
				}
				
			}
			System.out.println("반복회수:" + (i+1) + ", " + u.getStrike() + " Strike!! "
								+ u.getBall() + " Ball!!");
		}
		System.out.println("You Lose, Pitcher is");
		p.showAnswel();
		
	}

}

class Pitcher{
	private int[] answel = new int[3];
	
	public int[] getAnswel() {
		return answel;
	}
	
	public void inputAnswel(){
		for (int i = 0; i < answel.length; i++) {
			answel[i] = (int)(Math.random()*10);
			for (int j = i-1; j >= 0; j--) {
				if(answel[i] == answel[j]) {
					i--;
					break;
				}
			}
		}
	}
	
	public void showAnswel() {
		for(int n : answel) {
			System.out.print(n + "\t");
		}
	}
}

class Hitter{
	private int[] user = new int[3];
	
	public int[] getUser() {
		return user;
	}

	public Hitter(int a1, int a2, int a3) {
		user[0] = a1;
		user[1] = a2;
		user[2] = a3;
	}
}

class Umpire{
	private int strike, ball;
	
	public void setStrike(int strike) {
		this.strike = strike;
	}

	public void setBall(int ball) {
		this.ball = ball;
	}

	public int getStrike() {
		return strike;
	}
	
	public int getBall() {
		return ball;
	}
	
	public void result(int[] user, int[] answel) {
		for (int i = 0; i < user.length; i++) {
			for (int j = 0; j < answel.length; j++) {
				if(i == j) {
					if(user[i] == answel[j]) strike++;
				}else {
					if(user[i] == answel[j]) ball++;
				}
			}
		}
	}
	
}