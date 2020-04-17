package com.day19;

public abstract class Animal { // 추상 클래스
	public abstract void sound(); // 추상 메서드
	/*
	  추상메서드 
	  - 메서드의 구현부가 없는 것, {}블럭이 없고 선언부만 존재
	  - 자식 클래스에서 알맞게 구현해야 함(오버라이딩 해야함)
	  - public abstract 반환타입 메소드명(매개변수);
	  - 오버라이딩의 관계를 형성하기 위해 정의된 메서드, 
	  	비어있는 메서드는 추상 메서드로 만든다.
	  
	  추상 클래스
	  - 미완성 클래스
	  - 추상메서드를 포함하고 있으면 추상 클래스가 됨
	  - 추상 메서드가 없더라도 abstract를 붙이면 추상클래스가 됨
	  - 추상 클래스는 미완성 클래스이므로 객체 생성할 수 없다.
	  - 상속의 관계를 형성하기 위한 상위 클래스로 인스턴스화시키기 위해서 
	  	정의한 클래스가 아닌 경우 추상 클래스로 만든다.
	  - abstract class 클래스명{
	  		추상 메서드();
	  	}
	  	abstract class 클래스명{
	  		일반 메서드();
	  	}
	 */
}

class Dog extends Animal{
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cow extends Animal{
	@Override
	public void sound() {
		System.out.println("음메");
	}
}

class Cat extends Mammal{
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}

abstract class Mammal extends Animal{ 
	//추상 클래스를 상속받은 자식 클래스에서 추상 메서드를 모두 구현해야
	//일반 클래스가 됨 그렇지 않으면 자식 클래스도 추상 클래스가 되어야 함
	public void breed(int n) {
		System.out.println(n + "마리 새끼를 낳는다");
	}
}
