package com.day9;

import java.util.Scanner;

public class CompareNumber {
	
	public static int findAnswer() {
		int random = (int)(Math.random()*100+1);
		return random;
	}
	
	public static int findAnswer2(int a, int b) {
		int random = (int)(Math.random()*(b - a + 1) + a);
		return random;
	}

	public static void main(String[] args) {
		
		//public static double random()
		/*=> 0.0~1.0 사이의 임의의 실수를 리턴(0.0 <= ㅌ < 1.0)
		 * 
		 * 1) 발생시키려는 수의 개수를 각 변에 곱한다
		 * 2)시작값을 더한다
		 * 3) int로 형변환 한다.
		 * 
		 * 예1) 1~100 사이의 임의의 정수
		 * 0.0 <= Math.random() * 100 < 100.0
		 * 1.0 <= Math.random() * 100 + 1 < 101.0
		 * 1 <= (int)(Math.random() * 100 + 1) < 101
		 * 
		 * 예2) 0~100 사이의 임의의 정수
		 * 0.0 <= Math.random() * 101 < 101.0
		 * 0 <= (int)(Math.random() * 101) < 101
		 * 
		 * 예3) A ~ Z 사이의 임의의 대문자
		 * A(65) <= Math.random() * 26 + 65('A') < 91.0
		 * 65 <= (int)(Math.random() * 26 + 65) < 91
		 * 
		 * 예4) d~g 사이의 임의의 소문자
		 * 100 <= Math.random() * 4 + 'd' < 104
		 * 100 <= (int)(Math.random() * 4 + 'd') < 104
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정답을 맞출 시작과 끝을 입력하세요");
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		int answer = findAnswer2(start, end);
		
		String result = "";
		for(int i = 0; i < 4 ; i++) {
			System.out.println("번호를 입력하세요");
			int num = sc.nextInt();
			
			if(answer == num) {
				System.out.println("정답입니다!!");
				
				break;
			} 
			
			if(i == 3) {
				result = "실패! 다음기회에 정답 : " + answer;
			}else {
				
				if(answer > num) {
					result = "좀 더 큰 수를 입력하세요";
				
				}else {
					result = "좀 더 작은 수를 입력하세요";
				}
				
			}
			System.out.println(result);
		}
		
		sc.close();
		
	}

}
