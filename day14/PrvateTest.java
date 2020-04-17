package com.day14;

import com.day13.CCC;

public class PrvateTest {

	public static void main(String[] args) {
		AAA obj = new AAA();
		obj.name = "ȫ�浿"; // default�� ���� ��Ű���̹Ƿ� ���� ����
		//obj.age = 20; // error, private�� age�� �ٸ� Ŭ�����̹Ƿ� ���� �Ұ�
		// => the field AAA.age is not visible
		
		obj.showInfo(); // public �޼���� ��𼭵� ȣ�� ����

		BBB b = new BBB();
		
		//b.num1 = 10; // private error
		b.num2 = 20; // default
		b.num3 = 30; // protected
		b.num4 = 40; // public
		
		b.showInfo();
		
		CCC c = new CCC();
		// c.val1 = 40; // error private
		// c.val2 = 40; // error default
		// c.val3 = 40; // error protected
		c.val4 = 400;
		
		c.showInfo();
		
		// DDD d = new DDD(); // default class
		
	}

}//main class

/*
 ���� ������ - Ŭ������ ����� ���Ǿ� �ܺηκ����� ������ �����ϴ� ����
 public > protected > default(������) > private

[1] private - ���� Ŭ���������� ���� ����
[2] default - ���� ��Ű���ȿ����� ���� ����
[3] protected - ���� ��Ű���� ���� �ٸ� ��Ű������ ��Ӱ��迡���� ���� ����
[4] public - ��𼭳� ���� ����

Ŭ����, ������ - public, default
�޼���, ������� - public, default, protected, private
�������� - ��� �Ұ�
 */
class AAA{ // default Ŭ����
	private int age; //���� Ŭ���������� ���� ����
	String name; // ���� ��Ű�������� ���� ���� (default, ����)
	
	public void showInfo() {
		System.out.println("���� : " + age);
		System.out.println("�̸�  : " + name);
		
	}
	
}// AAA class
