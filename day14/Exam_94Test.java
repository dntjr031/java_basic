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
					System.out.println("���α׷��� �����մϴ�.");
					return;
				default:
					System.out.println("�߸� �����Ͽ����ϴ�. �ٽ� �����ϼ���\n");
					continue;
			}
			sc.close();
		}//while
		
		
	}

}
