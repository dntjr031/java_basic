package com.day19;

public class CastingTest {

	public static void main(String[] args) {
		//�⺻��ó�� ������ ���������� ����ȯ�� ������
		//=> ��, ��Ӱ����� Ŭ���� ���̿����� ����
		
		//[1] ������ ������ �ڵ� ����ȯ = > ������
		//�θ�Ÿ�� <- �ڽ�
		//Up-casting
		Car c = new FireEngine(); //�ڵ� ����ȯ
		c.drive();
		//c.water(); => error, �ڽĸ��� �޼��� ȣ�� �Ұ�
		
		//[2] ������ ������ ����� ����ȯ
		//�ڽ�Ÿ�� <- �θ�
		//=> Down-casting
		FireEngine f = (FireEngine)c; // ����� ����ȯ, �θ� ���������� �ڽ� Ÿ�Կ� ����
		f.drive();
		f.water(); //�ٿ� ĳ�������� �ڽĸ��� �޼��嵵 ȣ�� ��������
		
		((FireEngine)c).water();
		
		//FireEngine f = (FireEngine)new Car(); => �������� ������ ��Ÿ�� ����( ClassCastException )
		
		c= new Ambulance();
		Ambulance am = (Ambulance)c;
		am.drive();
		am.siren();
		
		/*
		 instanceof ������
		 - ���������� �����ϰ� �ִ� �ν��Ͻ��� ���� Ÿ���� �˾ƺ��� ���� ���
		 
		 �������� instanceof Ÿ��(Ŭ����)
		 => ���������� �ش�Ÿ���� �ν��Ͻ��� true, �ƴϸ� false�� ����
		 => ���ǹ����� ���
		 ��) c instanceof FireEngine
		 => �������� c�� FireEngine�� �ν��Ͻ����� üũ
		 */
		boolean bool = c instanceof FireEngine;
		System.out.println("�������� c�� ���� �ν��Ͻ��� FireEngine�ΰ�? " + bool);
		System.out.println("�������� c�� ���� �ν��Ͻ��� Ambulance�ΰ�? " + (c instanceof Ambulance));
		
		if(c instanceof FireEngine) {
			FireEngine f2 = (FireEngine)c;
			f2.water();
		}else if(c instanceof Ambulance) {
			Ambulance a2 = (Ambulance)c;
			a2.siren();
		}
		/*
		 �ڽ� instanceof �θ�Ŭ����
		 => true
		 �ڽ��� �θ��� �ν��Ͻ��̱⵵ �ϴ�
		 */
		FireEngine f3 = new FireEngine();
		if(f3 instanceof Object) {
			System.out.println("f3�� Objaect�� �ν��Ͻ��̱⵵ �ϴ�");
		}
		if(f3 instanceof Car) {
			System.out.println("f3�� Car�� �ν��Ͻ��̱⵵ �ϴ�");
		}
		if(f3 instanceof FireEngine) {
			System.out.println("f3�� FireEngine�� �ν��Ͻ��̴�");
		}
	}

}

class Car{
	
	void drive() {
		System.out.println("���� �����ϴ� �޼���");
	}
	void stop() {
		System.out.println("���� ����ϴ�");
	}
	
}

class FireEngine extends Car{
	void drive() {
		System.out.println("�ҹ����� �����մϴ�");
	}
	void water() {
		System.out.println("water!");
	}
}

class Ambulance extends Car{
	void drive() {
		System.out.println("���深���� �����մϴ�");
	}
	void siren() {
		System.out.println("siren!");
	}
}