package com.day16;
/*
	��� - �θ�Ŭ������ ����� �״�� �����޾� �ڽ� Ŭ�������� ���� �ϴ� ��
 		�ڽ� Ŭ�������� �������� �κ��� ���� Ŭ�������� �����ϰ�, 
 		�ڽ� Ŭ������ �ڽſ� ���ǵ� ����鸸 ����

	extends Ű���� ���
	
	class �ڽ� extends �θ�{
	
	}
	
 */
class Parent{
	protected String name;
	protected int age;
	protected int money = 1000;
}

class Child extends Parent{
	Child(){
		name="�ڽ�";
		age=35;
	}
	
	public void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("�������� ����: " + money + "\n");
	}
}

class Doughter extends Parent{
	Doughter(){
		name = "��";
		age = 30;
	}
	
	public void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("�������� ����: " + money + "\n");
	}
}

class GrandChild extends Child{
	public GrandChild() {
		name = "����";
		age = 2;
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.showInfo();

		Doughter d = new Doughter();
		d.showInfo();
		
		GrandChild g = new GrandChild();
		g.showInfo();
	}

}
