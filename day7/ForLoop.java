package com.day7;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		/*
		 * 무한루프 - 무한히 반복되는 무한 루프
		 * 
		 * 	for(;;){
		 * 		반복할 명령;
		 * 		if(조건식) break;	
		 * 	}
		 * 
		 * => 무한 루프안에서는 break를 사용해서 반복문을 빠져나오게 해야 함
		 */

		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.println("게임 중!!!!");
			System.out.println("계속 하시겠습니까?(Y/N)");
			String gameYn = sc.nextLine();
			
			if(gameYn.equalsIgnoreCase("y")) break;
		} //for
		System.out.println("종료되었습니다.");
		sc.close();

	}

}
