package com.day20;

/*
 AA�� BB Ŭ������ �������� ����
 
 Ŭ���� A�� Ŭ���� B�� ���� ȣ������ �ʰ� �������̽��� �Ű�ü�� �ϴ� ���
  - Ŭ���� A�� �������̽� I �ϰ�  �������� ���谡 �ֱ⶧����
   	Ŭ���� B�� ���濡 ������ ���� ����
 */
class AA{
	public void methodA(II i) {
		i.method();
	}
}

class BB implements II{
	public void method() {
		System.out.println("BB's Method");
	}
}

class CC implements II{
	public void method() {
		System.out.println("CC's Method");
	}
}

interface II{
	void method();
}
public class InterfaceTest3 {
	
	public static void main(String[] args) {
		AA a = new AA();
		a.methodA(new BB());
		a.methodA(new CC());
	}
}
