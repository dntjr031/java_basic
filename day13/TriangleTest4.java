package com.day13;

import java.util.Scanner;

public class TriangleTest4 {

	public static void main(String[] args) {
		// 4. 별도의 클래스에서 삼각형 면적 구하는 메서드 만들어서 처리
		//(멤버변수가 있는 클래스)
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 밑변, 높이를 입력");
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		// 객체 생성후 참조변수.메서드() 호출
		Triangle2 tri = new Triangle2(w, h);
		
		int area = tri.area();
		System.out.println("넓이 : " + area);
		
		//멤버변수의 값 변경
		tri.h = 100;
		tri.w = 200;
		
		area = tri.area();
		System.out.println("변경된 면적 : " + area);
		
		sc.close();

	}

}
