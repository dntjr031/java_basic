package com.day14;

import java.util.Scanner;

public class Exam_94Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		
		while(true)	{
			phone.showMenu();
			choice=sc.nextInt();
			sc.nextLine();	
			
			switch(choice){
				case 1:
					phone.inputData();
					break;
				case 2:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못 선택하였습니다. 다시 선택하세요\n");
					continue;
			}
			sc.close();
		}//while
		
		
	}

}
