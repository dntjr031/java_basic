package com.day19;

public class AbstractTest {

	public static void main(String[] args) {

		Animal a;
		//a = new Animal(); => error, Unresolved compilation problem
		a= new Dog(); // �ڽ��� �߻� �޼��带 �������̵��ϸ� 
					  //�ڽ��� ������ Ŭ������ �Ǿ� ��ü ���� ����
		a.sound();
		
		a = new Cow();
		a.sound();
		
		a = new Cat();
		a.sound();
		
		//Mammal m = new Mammal(); => �ڽĵ� �߻�Ŭ�����̹Ƿ� ��ü���� �Ұ�
		Mammal c = new Cat();
		c.breed(3);
		c.sound();
	}

}
