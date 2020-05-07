package com.day18;

public class Animal {
	public void bark() {
		System.out.println("울다");
	}
	public void parent() {
		System.out.println("난 부모-동물");
	}
}

class Cat extends Animal{

	public void bark() {
		System.out.println("야옹");
	}

	public void child() {
		System.out.println("난 자식-고양이");
	}
	
}

class Cow extends Animal{
	public void bark() {
		System.out.println("음메음메");
	}

}

class Dog extends Animal{
	public void bark() {
		System.out.println("멍멍");
	}

}

class AnimalModule{
	public static Animal findAnimal(int num) {
		Animal b = null;
		if(num == 1) {
			b = new Cat();
		}else if(num == 2) {
			b = new Cow();
		}else if(num == 3) {
			b = new Dog();
		}else {
			System.out.println("잘못입력!");
		}
		return b;
	}
}
