package com.day19;

import java.util.Scanner;

public class EmployeeTest {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		
		EmployeeManager emm = new EmployeeManager();
		
		Employee em = null;
		while(true) {
			System.out.println("������� - �����(P), �ӽ���(T), �Ǹ���(S)�� �����ϼ���<����� Q>");
			String str = sc.nextLine();
			
			System.out.println();
			
			if(str.equalsIgnoreCase("p")) {
				em = emm.inputPermanent();
			}else if(str.equalsIgnoreCase("t")) {
				em = emm.inputTemporary();
			}else if(str.equalsIgnoreCase("s")) {
				em = emm.inputSalesPerson();
			}else if(str.equalsIgnoreCase("q")){
				System.out.println("�����մϴ�.");
				break;
			}else {
				System.out.println("�߸��Է�!");
				continue;
			}
			
			em.showInfo();
		}
		
	}

}
