package com.day6;

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {

		//사용자로부터 반복 횟수를 입력받아서 그 횟수만큼 hi java출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반복하고 싶은 횟수를 입력하세요");
		int count = sc.nextInt();
		
		for(int i = 0; i < count; i++) {
			System.out.println(i + " : Hi java");
		}
		sc.close();
	}

}
