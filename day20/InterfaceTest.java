package com.day20;

import java.util.Scanner;

public class InterfaceTest {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		IAnimal[] iarr = new IAnimal[3];
		//iarr[0] = new IAnimal(); => error, 인터페이스는 객체 생성 불가
		iarr[0] = new Dog(); // 다형성 이용 가능
		iarr[1] = new Cow();
		iarr[2] = new Cat();
		//iarr[2] = new Mammal(); => error, 추상클래스 객체 생성 불가
		
		iarr[0].sound();
		iarr[0].display();
		iarr[1].sound();
		iarr[1].display();
		iarr[2].sound();
		iarr[2].display();
		
		//사용자 입력 받아서 처리
		System.out.println("1. 강아지, 2. 고양이, 3.소 선택!");
		int type = sc.nextInt();
		
		IAnimal iAni = null; 
		if(type == 1) {
			iAni = new Dog();
		}else if(type == 2) {
			iAni = new Cat();
		}else if(type == 3) {
			iAni = new Cow();
		}else {
			System.out.println("잘못 입력!");
			return;
		}
		iAni.display();
		iAni.sound();
		
	}

}
/*
 인터페이스
 - 일종의 추상 클래스
 - 추상 메서드와 상수만을 멤버로 가질 수 있다.
 - 메서드 목록만 나열한 것
 - 밑그림만 그려져 있는 기본 설계도
 - 표준을 제시하는 용도로 사용
 - 일종의 약속, 최소한의 계약사항 명시
 
 interface 인터페이스명{
 	(public static final)(생략가능) 상수;
 	(public abstract)(생략가능) 추상메서드;
 }
 	
 자식 클래스에서 구현할 때 implements 키워드 사용
 class 자식 클래스 implements 인터페이스{
 
 }
 
 */

interface IAnimal{
	public abstract void sound(); 
	void display(); //public abstract 생략가능 
}

class Dog implements IAnimal{
	public void sound() {
		System.out.println("멍멍");
	}
	public void display() {
		System.out.println("Dog's Method");
	}
}

abstract class Mammal implements IAnimal{
	public void display() {
		System.out.println("포유류의 메서드");
	}
	// sound()는 구현 불가
	//=> 추상 메서드가 남아있으므로 추상 클래스가 됨
}

class Cow extends Mammal{
	public void sound() {
		System.out.println("음메~"); // Mammal에서 구현 못한 sound()를 구현하므로써 완전한 클래스가 됨
	}
}

class Cat implements IAnimal{
	/*
	void sound() {
		System.out.println("야옹"); // interface의 메서드는 public 그러므로 default가 되면 안된다.
	}
	*/
	public void sound() {
		System.out.println("야옹");
	}

	public void display() {
		System.out.println("Cat's Method");
	}
	
}
