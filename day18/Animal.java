package com.day18;

public class Animal {
	public void bark() {
		System.out.println("���");
	}
	public void parent() {
		System.out.println("�� �θ�-����");
	}
}

class Cat extends Animal{

	public void bark() {
		System.out.println("�߿�");
	}

	public void child() {
		System.out.println("�� �ڽ�-�����");
	}
	
}

class Cow extends Animal{
	public void bark() {
		System.out.println("��������");
	}

}

class Dog extends Animal{
	public void bark() {
		System.out.println("�۸�");
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
			System.out.println("�߸��Է�!");
		}
		return b;
	}
}