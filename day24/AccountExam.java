package com.day24;

public class AccountExam {

	public static void main(String[] args) {
		AccountManager am = new AccountManager();
		
		while(true) {
			int choice = am.input();
			
			switch(choice) {
				case 1:
					am.accountInput();
					break;
				case 2:
					am.arrIn();
					break;
					
				case 3:
					am.arrout();
					break;
					
				case 4:
					am.totalInfo();
					break;
					
				case 5:
					System.out.println("프로그램을 종료합니다.");
					return;
					
				default:
					System.out.println("잘못입력\n");
					continue;
			}
		}
	}

}
