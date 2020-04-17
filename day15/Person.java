package com.day15;

public class Person {
	private String name;
	private int age;
	static int count;
	//=> static ����(class����)
	/*
	  - Ŭ���� �������� �� �ϳ��� �����Ǿ� ��� ��ü�� �����Ѵ�.
      - �ش� Ŭ������ �޸𸮿� �ε�� �� ������
      
	 �� static ������ static�޼���
	  - Ŭ������ ���繰�� instance�� �������� �ʰ� Ŭ���� �������� �ٷ� ȣ���� ����
	  - Ŭ������ ���� �ν��Ͻ��� �������� �ʾƵ� �ش� Ŭ������ �޼��带 ȣ���ؼ� ����� �� ����
	  - Ŭ������ �̸����� ����
	 */
	
	/*
	 ������� - Ŭ���� �������� ����� ����
	 [1] instance���� - static�� ���� ���� �������
	 [2] static����(class ����) - static�� ���� �������
	 */
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(++count + "��° ��ü ����!");
	}
	
	public void display() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age + "\n");
	}
}
