package com.day19;

import java.util.Scanner;

public class EmployeeTest {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		
		EmployeeManager emm = new EmployeeManager();
		
		Employee em = null;
		while(true) {
			System.out.println("고용형태 - 고용직(P), 임시직(T), 판매직(S)을 선택하세요<종료시 Q>");
			String str = sc.nextLine();
			
			System.out.println();
			
			if(str.equalsIgnoreCase("p")) {
				em = emm.inputPermanent();
			}else if(str.equalsIgnoreCase("t")) {
				em = emm.inputTemporary();
			}else if(str.equalsIgnoreCase("s")) {
				em = emm.inputSalesPerson();
			}else if(str.equalsIgnoreCase("q")){
				System.out.println("종료합니다.");
				break;
			}else {
				System.out.println("잘못입력!");
				continue;
			}
			
			em.showInfo();
		}
		
	}

}
