package com.day19;

public class PolymoTest {

	public static void main(String[] args) {
		
		Child ch = new Child();
		ch.method();
		System.out.println("ch.x=" + ch.x); // 200
		
		Parent p = new Child(); // ������
		p.method(); // �ڽ��� �������̵� �޼���
		System.out.println("p.x=" + p.x); //�θ� ���������δ� �θ��� ����� ���� ���� => 100
		

	}

}

class Parent{
	protected int x = 100;
	
	public void method() {
		System.out.println("Parent�� �޼���");
	}
}

class Child extends Parent{
	int x = 200;
	
	public void method() {
		System.out.println("Child�� �޼���");
	}
}