package com.day18;

import java.util.Scanner;

public class AnimalTest {

	public static void main(String[] args) {

		Animal a = new Cat();
		a.bark();
		
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("\n1. 고양이, 2. 송아지, 3. 강아지 중 택1");
		int num = sc.nextInt();
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
		
		if(b != null) {
			b.bark();
		}
		
		//모듈화
		System.out.println("\n1. 고양이, 2. 송아지, 3. 강아지 중 택1");
		num = sc.nextInt();
		b = AnimalModule.findAnimal(num);
		if(b != null) {
			b.bark();
		}
		
		sc.close();
	}

}
