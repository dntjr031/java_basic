package com.day14;

import java.util.Scanner;

public class TriangleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 밑변, 높이 입력!");
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		Triangle tr = new Triangle(w, h);
		int area = tr.area();
		
		System.out.println("삼각형 면적 : " + area);
		
		//getter, setter로 멤버변수의 값 변경
		tr.setHight(30);
		tr.setWidth(40);
		
		area = tr.area();
		
		System.out.println("\n변경된 밑변 : " + tr.getWidth());
		System.out.println("높이 : " + tr.getHight());
		System.out.println("면적 : " + area);
		
		sc.close();

	}

}
