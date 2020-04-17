package com.day18;

import java.util.Scanner;

public class AnimalTest {

	public static void main(String[] args) {

		Animal a = new Cat();
		a.bark();
		
		// ����� �Է�
		Scanner sc = new Scanner(System.in);
		System.out.println("\n1. �����, 2. �۾���, 3. ������ �� ��1");
		int num = sc.nextInt();
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
		
		if(b != null) {
			b.bark();
		}
		
		//���ȭ
		System.out.println("\n1. �����, 2. �۾���, 3. ������ �� ��1");
		num = sc.nextInt();
		b = AnimalModule.findAnimal(num);
		if(b != null) {
			b.bark();
		}
		
		sc.close();
	}

}
