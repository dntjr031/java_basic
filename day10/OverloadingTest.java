package com.day10;

public class OverloadingTest {
	/*
	 * 오버로딩 메서드
	 * - 하나의 클래스에서 동일한 이름을 가진 여러 개의 메서드를 오버로딩 메서드라고 함
	 * 단, 매개변수의 개수나 자료형이 달라야 함
	 */
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static float add(float a, float b) {
		return a + b;
	}
	
	public static float add(float a, float b, float c) {
		return a + b + c;
	}
	
	/*
	public static double add(int a, int b) {
		return a + b;
	}
	=> 반환타입이 다른것은 오버로딩 메서드가 아님
	매개변수가 같으므로 에러!
	*/
	
	public static String add(String a, String b) {
		return a + b;
	}

	public static void main(String[] args) {

		int i = add(3, 5);
		float f = add(3f, 5f);
		float f2 = add(3f, 5f, 7f);
		String str = add("Hello", "Java");
		System.out.println("int 합 : " + i + ", float 합 : " + f + ", float 3개 합 : " + f2);
		System.out.println("Strint 합 : " + str);

	}

}
