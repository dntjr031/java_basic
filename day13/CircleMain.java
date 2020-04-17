package com.day13;

import java.util.Scanner;

public class CircleMain {

	public static void main(String[] args) {
		//원의 면적을 구하시오 
		// - findArea()메서드 사용
		// - static 메서드가 아니므로 객체 생성 후 참조변수.메서드() 로 호출
		
		//1. 객체 생성
		Circle cc = new Circle();
		
		//2. 메서드 호출(사용)
		//먼저 멤버변수에 값 할당
		cc.radius = 5;
		//메서드 호출
		double area = cc.findArea();
		
		
		System.out.println("원의 면적 : " + area);

		//멤버변수의 값 변경
		cc.radius = 10;
		area = cc.findArea();
		System.out.println("변경된 원의 면적 : " + area);
		
		//사용자로부터 반지름을 입력받아서 처리
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름 입력");
		int r = sc.nextInt();
		cc.radius = r;
		
		area = cc.findArea();
		System.out.println("반지름이 " + r + "인 원의 면적 : " + area);
		
		//원의 둘레 구하기
		double girth = cc.findGirth();	
		System.out.println("원의 둘레 : " + girth);
		sc.close();
	}

}
