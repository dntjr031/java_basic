package com.day22;

class MenuChoiceException extends Exception{

	private static final long serialVersionUID = 1L;

	public MenuChoiceException(int n) {
		super(n + "에 해당하는 선택은 존재하지 않습니다.\n메뉴 선택을 처음부터 다시 진행합니다.\n");
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
						System.out.println("종료합니다.");
						break loop1;
					default:
						System.out.println("잘못 입력하였습니다.\n");
						
				}
		}

	}

}
