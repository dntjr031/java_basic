package com.day17;

public class FinalTest1 {

	public static void main(String[] args) {
		

	}

}
/*
 final - 마지막의, 변경할 수 없는
 
 1) final 클래스 - 부모 클래스가 될 수 없다
 2) final 메서드 - 오버라이딩할 수 없다
 3) final 멤버변수 - 값을 변경할 수 없다
 	final 지역변수 - 값을 변경할 수 없다
 */
final class Parent3{
	public void func() {
		System.out.println("Parent");
	}
}

//class Child extends Parent3{} // error => Parent가 final class, 부모클래스가 될 수 없다.
	
