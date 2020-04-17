package com.day11;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		
		//로또 만들기
		//1. 6개 정수를 갖는 배열 만들기

		int[] lotto = new int[6];

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//2. for문에서 1~45 사이의 임의의 정수를 배열 요소에 넣는다
			//for문에서 초기화
			for(int i = 0; i < 6; i++) {
				
				lotto[i] = (int)(Math.random()*45+1);
				
				//중복제거
				for(int n = 0; n < i; n++) {
					if(lotto[i] == lotto[n]){
						i--; 
						break;
					}
				}
			}
			//3. 배열 요소 정렬
			Arrays.sort(lotto);
			//4. 배열 요소 출력
			for(int n : lotto) {
				System.out.print(n + " ");
			}
			System.out.println("\n\n계속 하시겠습니까? (y/n)");
			
			String str = sc.nextLine();
			if(str.equalsIgnoreCase("n")) break;
		}
		
		sc.close();

	}

}
