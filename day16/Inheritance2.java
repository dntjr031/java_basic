package com.day16;

class GrandFather{
	GrandFather() {
		System.out.println("GrandFather ������!");
	}
	
	public void showGrandFather() {
		System.out.println("GrandFather Ŭ������ �޼��� ȣ��!");
	}
}

class Father extends GrandFather{
	Father() {
		System.out.println("Father ������!");
	}
	
	public void showFather() {
		System.out.println("Father Ŭ������ �޼��� ȣ��!");
	}
}

class Child2 extends Father{
	Child2() {
		System.out.println("Child2 ������!");
	}
	
	public void showChild2() {
		System.out.println("Child2 Ŭ������ �޼��� ȣ��!");
	}
}

public class Inheritance2 {
	
	public static void main(String[] args) {
		Child2 ch = new Child2();
		/*
		 �θ� �����ں��� ���������� �����
		 GrandFather() => Father() => Child2()
		 */
		System.out.println("\n\n");
		ch.showChild2();
		ch.showFather();
		ch.showGrandFather();
	}
}
