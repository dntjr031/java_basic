package com.day22;

class MenuChoiceException extends Exception{

	private static final long serialVersionUID = 1L;

	public MenuChoiceException(int n) {
		super(n + "�� �ش��ϴ� ������ �������� �ʽ��ϴ�.\n�޴� ������ ó������ �ٽ� �����մϴ�.\n");
	}
	
}

public class PhoneExam2 {
	
	public static void main(String[] args) {
		
		PhoneManager pm = new PhoneManager();
		
		loop1: while(true) {
				int n;
				try {
					n = pm.showMenu();
				} catch (MenuChoiceException e) {
					System.out.println(e.getMessage());
					continue;
				}
				switch(n){
					case 1:
						try {
							pm.InputData();
						} catch (MenuChoiceException e) {
							System.out.println(e.getMessage());
						}
						continue;
					case 2:
						pm.totalPrint();
						continue;
					case 3:
						pm.search();
						continue;
					case 4:
						pm.delete();
						continue;
					case 5:
						System.out.println("�����մϴ�.");
						break loop1;
					default:
						System.out.println("�߸� �Է��Ͽ����ϴ�.\n");
						
				}
		}

	}

}
