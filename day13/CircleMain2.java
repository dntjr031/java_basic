package com.day13;


public class CircleMain2 {

	public static void main(String[] args) {
		//객체 생성 후 참조변수.메서드()로 메서드 호출
		Circle2 cc = new Circle2(10); // 객체 생성시 생성자 호출부분에서 매개변수를 반드시 넘겨야 함
		//new 오른쪽 부분이 생성자를 호출하는 부분
		double area = cc.findArea();
		
		
		System.out.println("원의 면적 : " + area);

		
		double girth = cc.findGirth();	
		System.out.println("원의 둘레 : " + girth);
		
	}

}
