package com.day19;

public class AbstractTest {

	public static void main(String[] args) {

		Animal a;
		//a = new Animal(); => error, Unresolved compilation problem
		a= new Dog(); // 자식이 추상 메서드를 오버라이딩하면 
					  //자식은 완전한 클래스가 되어 객체 생성 가능
		a.sound();
		
		a = new Cow();
		a.sound();
		
		a = new Cat();
		a.sound();
		
		//Mammal m = new Mammal(); => 자식도 추상클래스이므로 객체생성 불가
		Mammal c = new Cat();
		c.breed(3);
		c.sound();
	}

}
