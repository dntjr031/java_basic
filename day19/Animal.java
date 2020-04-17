package com.day19;

public abstract class Animal { // �߻� Ŭ����
	public abstract void sound(); // �߻� �޼���
	/*
	  �߻�޼��� 
	  - �޼����� �����ΰ� ���� ��, {}���� ���� ����θ� ����
	  - �ڽ� Ŭ�������� �˸°� �����ؾ� ��(�������̵� �ؾ���)
	  - public abstract ��ȯŸ�� �޼ҵ��(�Ű�����);
	  - �������̵��� ���踦 �����ϱ� ���� ���ǵ� �޼���, 
	  	����ִ� �޼���� �߻� �޼���� �����.
	  
	  �߻� Ŭ����
	  - �̿ϼ� Ŭ����
	  - �߻�޼��带 �����ϰ� ������ �߻� Ŭ������ ��
	  - �߻� �޼��尡 ������ abstract�� ���̸� �߻�Ŭ������ ��
	  - �߻� Ŭ������ �̿ϼ� Ŭ�����̹Ƿ� ��ü ������ �� ����.
	  - ����� ���踦 �����ϱ� ���� ���� Ŭ������ �ν��Ͻ�ȭ��Ű�� ���ؼ� 
	  	������ Ŭ������ �ƴ� ��� �߻� Ŭ������ �����.
	  - abstract class Ŭ������{
	  		�߻� �޼���();
	  	}
	  	abstract class Ŭ������{
	  		�Ϲ� �޼���();
	  	}
	 */
}

class Dog extends Animal{
	@Override
	public void sound() {
		System.out.println("�۸�");
	}
}

class Cow extends Animal{
	@Override
	public void sound() {
		System.out.println("����");
	}
}

class Cat extends Mammal{
	@Override
	public void sound() {
		System.out.println("�߿�");
	}
}

abstract class Mammal extends Animal{ 
	//�߻� Ŭ������ ��ӹ��� �ڽ� Ŭ�������� �߻� �޼��带 ��� �����ؾ�
	//�Ϲ� Ŭ������ �� �׷��� ������ �ڽ� Ŭ������ �߻� Ŭ������ �Ǿ�� ��
	public void breed(int n) {
		System.out.println(n + "���� ������ ���´�");
	}
}
