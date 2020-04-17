package com.day25;

class Person{
	public void display() {
		System.out.println("this = " + this);
	}
}

public class ObjectTest {

	public static void main(String[] args) {
		Person p = new Person();
		Person p2 = new Person();
		
		System.out.println("p�� p2�� �ּҰ� ������?" + p.equals(p2));
		System.out.println("p.getClass() : "+p.getClass());
		System.out.println("p�� �ؽ��ڵ� �� : "+p.hashCode());
		System.out.println("p.toString(); : "+p.toString());
		System.out.println("p = "+p);
		System.out.println("p Ŭ������ �̸� = "+p.getClass().getName());
		System.out.println(Integer.toHexString(p.hashCode()));
		
		p.display();
		
		p = p2;
		if(p.equals(p2)) {
			System.out.println("p�� p2�� �ּҰ� ����");
		}else {
			System.out.println("p�� p2�� �ּҰ� ����");
		}
		
		/*
		 toString() �޼����� ��� : Ŭ������@16���� �ؽ��ڵ�
		 getClass().getName() + '@' + Integer.toHexString(hashCode())
		 */
	}

}
