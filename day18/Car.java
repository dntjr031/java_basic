package com.day18;

public class Car {
	public void engine() {
		System.out.println("엔진");
	}
	public void carKinds() {
		System.out.println("차종");
	}
}

class Equus extends Car{
	public void engine() {
		System.out.println("에쿠스 엔진");
	}
	public void carKinds() {
		System.out.println("에쿠스");
	}
}

class Benz extends Car{
	public void engine() {
		System.out.println("벤츠 엔진");
	}
	public void carKinds() {
		System.out.println("벤츠");
	}
}
