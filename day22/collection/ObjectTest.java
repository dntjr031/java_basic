package com.day22.collection;

public class ObjectTest {

	public static void main(String[] args) {
		AAA obj = new AAA();
		
		System.out.println("dbj ��ü�� ǥ���ϴ� �⺻ ���ڿ� : " + obj.toString());
		System.out.println("dbj ��ü�� ǥ���ϴ� �⺻ ���ڿ� ��� : " + obj);
		System.out.println(obj);
		obj.display();

		//toString()�޼����� ��� : Ŭ������@16���� �ؽ��ڵ�
	}

}

class AAA{
	public void display() {
		System.out.println("this= " + this);
	}
}