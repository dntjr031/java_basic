package com.day7;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("4자리 이상의 숫자를 입력하세요");
		String num = sc.nextLine();
		
		int sum = 0;
		for(int i = 0; i < num.length(); i++ ) {
			char ch = num.charAt(i);
			//String str = String.valueOf(ch);
			//int n = Integer.parseInt(str);
			int n = ch - '0';
			
			sum += n;
		}
		System.out.println(sum);
		
		System.out.println("\n==============\n");
		
		System.out.println("4자리 이상의 숫자를 입력하세요");
		int num1 = sc.nextInt();
		
		sum = 0;
		
		while(true) {
			if(num1 <= 0) break;
			sum += num1 % 10;
			
			num1 /= 10;
			
		}
		System.out.println(sum);
		
		sc.close();
				
		
	}

}
