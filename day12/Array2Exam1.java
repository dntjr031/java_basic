package com.day12;

import java.util.Scanner;

public class Array2Exam1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] store = new int[8];
		
		while(true) {
			System.out.println("복권판매점 번호<1~8>와 복권 판매량을 입력하세요.<끝낼때는 Q>");
			String str1 = sc.nextLine();
			if(str1.equalsIgnoreCase("q")) break;
			String str2 = sc.nextLine();
			
			int num = Integer.parseInt(str1);
			int each = Integer.parseInt(str2);
			
			store[num-1] += each;
			
			System.out.println("그룹번호 : " + num + ", 판매량 : " + store[num-1]);
		}
		
		System.out.println("종료되었습니다.");
		
		sc.close();

	}

}
