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
					System.out.println("���α׷��� �����մϴ�.");
					return;
					
				default:
					System.out.println("�߸��Է�\n");
					continue;
			}
		}
	}

}
