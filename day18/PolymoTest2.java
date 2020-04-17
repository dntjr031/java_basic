package com.day18;

import java.util.Scanner;

public class PolymoTest2 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// �⺻���� ���
		Circle c = new Circle();
		c.draw();
		c.delete();
		c.sayCircle();
		c.display();
		
		System.out.println("-----Upcasting-----");
		//������ �̿�
		Shape s = new Circle();
		s.draw(); // �ڽ��� �������̵� �޼��� ȣ��
		s.delete();
		s.display(); //�θ� �޼���
		//s.sayCircle(); => error, �ڽĸ��� �޼��� ��� �Ұ�
		
		Shape s2 = new Triangle();
		s2.draw();
		s2.delete();
		s2.display();
		
		
		System.out.println("\n\n1. ��, 2. �ﰢ�� ����");
		int choice = sc.nextInt();
		//�������
		if(choice == 1) {
			Circle sh = new Circle();
			sh.draw();
			sh.delete();
		}else if(choice == 2) {
			Triangle sh = new Triangle();
			sh.draw();
			sh.delete();
		}else {
			System.out.println("�߸��Է�(1, 2 �Է�)");
			return;
		}
		
		//������
		System.out.println("\n������ �̿�");
		Shape sh = Shape.find(choice);
		if(sh != null) {
			sh.draw();
			sh.delete();
		}
	}

}

class Shape{
	protected void draw() {
		System.out.println("����� �׸��ϴ�");
	}
	protected void delete() {
		System.out.println("����� ����ϴ�");
	}
	protected void display() {
		System.out.println("�θ� - Shape");
	}
	
	public static Shape find(int choice) {
		Shape sh = null;
		if(choice == 1) {
			sh = new Circle();
		}else if(choice == 2) {
			sh = new Triangle();
		}
		return sh;
	}
}

class Circle extends Shape{

	protected void draw() {
		System.out.println("���� �׸��ϴ�");
	}

	protected void delete() {
		System.out.println("���� ����ϴ�");
	}
	
	public void sayCircle() {
		System.out.println("�ȳ��ϼ��� ���Դϴ�");
	}
}

class Triangle extends Shape{

	protected void draw() {
		System.out.println("�ﰢ���� �׸��ϴ�");
	}

	protected void delete() {
		System.out.println("�ﰢ���� ����ϴ�");
	}
	
	public void sayTriangle() {
		System.out.println("�ȳ��ϼ��� �ﰢ���Դϴ�.");
	}
}