package com.day16;
/*
	상속 - 부모클래스의 멤버를 그대로 물려받아 자식 클래스에서 재사용 하는 것
 		자식 클래스들의 공통적인 부분은 무모 클래스에서 관리하고, 
 		자식 클래스는 자신에 정의된 멤버들만 관리

	extends 키워드 사용
	
	class 자식 extends 부모{
	
	}
	
 */
class Parent{
	protected String name;
	protected int age;
	protected int money = 1000;
}

class Child extends Parent{
	Child(){
		name="자식";
		age=35;
	}
	
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("물려받은 유산: " + money + "\n");
	}
}

class Doughter extends Parent{
	Doughter(){
		name = "딸";
		age = 30;
	}
	
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("물려받은 유산: " + money + "\n");
	}
}

class GrandChild extends Child{
	public GrandChild() {
		name = "손자";
		age = 2;
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.showInfo();

		Doughter d = new Doughter();
		d.showInfo();
		
		GrandChild g = new GrandChild();
		g.showInfo();
	}

}
