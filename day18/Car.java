package com.day18;

public class Car {
	public void engine() {
		System.out.println("����");
	}
	public void carKinds() {
		System.out.println("����");
	}
}

class Equus extends Car{
	public void engine() {
		System.out.println("���� ����");
	}
	public void carKinds() {
		System.out.println("����");
	}
}

class Benz extends Car{
	public void engine() {
		System.out.println("���� ����");
	}
	public void carKinds() {
		System.out.println("����");
	}
}