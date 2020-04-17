package com.day20;

import java.util.Scanner;

public class InterfaceTest {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		IAnimal[] iarr = new IAnimal[3];
		//iarr[0] = new IAnimal(); => error, �������̽��� ��ü ���� �Ұ�
		iarr[0] = new Dog(); // ������ �̿� ����
		iarr[1] = new Cow();
		iarr[2] = new Cat();
		//iarr[2] = new Mammal(); => error, �߻�Ŭ���� ��ü ���� �Ұ�
		
		iarr[0].sound();
		iarr[0].display();
		iarr[1].sound();
		iarr[1].display();
		iarr[2].sound();
		iarr[2].display();
		
		//����� �Է� �޾Ƽ� ó��
		System.out.println("1. ������, 2. �����, 3.�� ����!");
		int type = sc.nextInt();
		
		IAnimal iAni = null; 
		if(type == 1) {
			iAni = new Dog();
		}else if(type == 2) {
			iAni = new Cat();
		}else if(type == 3) {
			iAni = new Cow();
		}else {
			System.out.println("�߸� �Է�!");
			return;
		}
		iAni.display();
		iAni.sound();
		
	}

}
/*
 �������̽�
 - ������ �߻� Ŭ����
 - �߻� �޼���� ������� ����� ���� �� �ִ�.
 - �޼��� ��ϸ� ������ ��
 - �ر׸��� �׷��� �ִ� �⺻ ���赵
 - ǥ���� �����ϴ� �뵵�� ���
 - ������ ���, �ּ����� ������ ���
 
 interface �������̽���{
 	(public static final)(��������) ���;
 	(public abstract)(��������) �߻�޼���;
 }
 	
 �ڽ� Ŭ�������� ������ �� implements Ű���� ���
 class �ڽ� Ŭ���� implements �������̽�{
 
 }
 
 */

interface IAnimal{
	public abstract void sound(); 
	void display(); //public abstract �������� 
}

class Dog implements IAnimal{
	public void sound() {
		System.out.println("�۸�");
	}
	public void display() {
		System.out.println("Dog's Method");
	}
}

abstract class Mammal implements IAnimal{
	public void display() {
		System.out.println("�������� �޼���");
	}
	// sound()�� ���� �Ұ�
	//=> �߻� �޼��尡 ���������Ƿ� �߻� Ŭ������ ��
}

class Cow extends Mammal{
	public void sound() {
		System.out.println("����~"); // Mammal���� ���� ���� sound()�� �����ϹǷν� ������ Ŭ������ ��
	}
}

class Cat implements IAnimal{
	/*
	void sound() {
		System.out.println("�߿�"); // interface�� �޼���� public �׷��Ƿ� default�� �Ǹ� �ȵȴ�.
	}
	*/
	public void sound() {
		System.out.println("�߿�");
	}

	public void display() {
		System.out.println("Cat's Method");
	}
	
}
