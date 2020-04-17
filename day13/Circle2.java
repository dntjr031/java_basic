package com.day13;

public class Circle2 {
	
	//1. 멤버변수 (속성, 상태정보, 데이터)
	int radius; //반지름
	
	//2. 생성자
	Circle2(int p_radius){
		radius = p_radius;
	}
	
	
	//3. 메서드 (기능, 행동)
	//원의 면적 구하는 기능
	public double findArea() {
		double area = radius*radius*3.14;
		return area;
	}
	//원의 둘레 구하는 기능
	public double findGirth() {
		double girth = 3.14*2*radius;
		return girth;
	}

}
