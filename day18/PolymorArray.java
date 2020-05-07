package com.day18;

public class PolymorArray {

	public static void main(String[] args) {
		Shape[] s = new Shape[4];
		// shape 배열에는 자식 객체를 넣는다
		//=> 다형성 이용
		s[0] = new Circle();
		s[1] = new Triangle();
		s[2] = new Triangle();
		s[3] = new Circle();
		
		for (int i = 0; i < s.length; i++) {
			s[i].draw(); //자식의 오버라이딩 메서드 호출
			s[i].delete();
		}

		System.out.println("\nAnimal");
		Animal[] a = new Animal[3];
		a[0] = new Cat();
		a[1] = new Dog();
		a[2] = new Cow();
		
		for (int i = 0; i < a.length; i++) {
			a[i].bark();
		}
	}

}
