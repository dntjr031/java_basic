package com.day16;

class Shape{
	public void draw() {
		System.out.println("������ �׸���");
	}
}

class Triangle extends Shape{
	/*
	 �������̵� �޼����� ����
	  - �θ��� ����ο� ������ ��ġ�ؾ� ��
	  	(�޼����̸�, �Ű�����, ��ȯŸ��)
	  
	  - ���� �����ڴ� ���ų� �� �о����� ��
	  	��) �θ� Ŭ������ �޼��尡 default���
	  	�ڽ��� �������̵� �޼���� default, protected, public �̿�����
	  
	  - ���ܴ� ���ų� �� ���� �����ؾ���
	 */
	public void draw() {
		System.out.println("�ﰢ���� �׸���");
	}
}

public class OverridingTest2 {

	public static void main(String[] args) {
		
		Shape s = new Shape();
		s.draw();
		Triangle t = new Triangle();
		t.draw();

	}

}
