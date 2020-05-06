package com.day13;

import java.util.Scanner;

public class TriangleTest2 {

	public static int area(int w, int h) {
		return w * h / 2;
		
	}
	
	public static void main(String[] args) {
		// 2. 메인클래스에서 삼각형 면적 구하는 메서드 만들어서 처리
		
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 밑변, 높이를 입력");
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int area = area(w, h);
		System.out.println("넓이 : " + area);
		
		sc.close();

	}

}
