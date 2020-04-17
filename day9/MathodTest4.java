package com.day9;

public class MathodTest4 {

	
	// 1. 매개변수(입력값)도 없고, 반환값도 없는 메서드인 경우
	public static void func1() {
		System.out.println("*********");
	}
		
	// 2. 매개변수는 있고, 반환값은 없는 메서드인 경우
	public static void func2(int count) {
		for(int i = 0; i < count; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
		
	// 3. 매개변수는 없고, 반환값은 있는 메서드인 경우
	public static float func3() {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		float avg = sum/10f;
		
		return avg;
	}
		
	// 4. 매개변수도 있고, 반환값도 있는 메서드인 경우
	public static int func4(int a, int b) {
		int c = a + b;
		
		return c;
	}
	
	public static void main(String[] args) {
		// 1. 매개변수(입력값)도 없고, 반환값도 없는 메서드인 경우
		func1(); //그냥 불러오기만 하면 됨
		
		// 2. 매개변수는 있고, 반환값은 없는 메서드인 경우
		func2(5); // 형식에 맞게 매개변수값을 전달
		
		int cnt = 10; // 변수처리 한고 전달도 가능
		func2(cnt);
		
		// 3. 매개변수는 없고, 반환값은 있는 메서드인 경우
		float average = func3();
		
		System.out.println("\n1~10까지 합계의 평균 : " + average);
			
		// 4. 매개변수도 있고, 반환값도 있는 메서드인 경우
		int n1 = 5, n2 = 7;
		int sum = func4(n1, n2);
		
		System.out.println(n1 + " + " + n2 + " = " + sum);
	}

}
