package com.day18;

public class Car {
	public void engine() {
		System.out.println("¿£Áø");
	}
	public void carKinds() {
		System.out.println("Â÷Á¾");
	}
}

class Equus extends Car{
	public void engine() {
		System.out.println("¿¡Äí½º ¿£Áø");
	}
	public void carKinds() {
		System.out.println("¿¡Äí½º");
	}
}

class Benz extends Car{
	public void engine() {
		System.out.println("º¥Ã÷ ¿£Áø");
	}
	public void carKinds() {
		System.out.println("º¥Ã÷");
	}
}