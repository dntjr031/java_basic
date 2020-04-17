package com.day25;

public class FinalizeTest {

	public static void main(String[] args) {
		MyName obj1 = new MyName("�ν��Ͻ�1");
		MyName obj2 = new MyName("�ν��Ͻ�2");
		
		System.out.println(obj1);
		System.out.println(obj2);
		//obj1 = null;
		//obj2 = null;
		
		obj1 = obj2; // �ν��Ͻ�1 �Ҹ� ���
		obj2 = null; // �Ҹ� x
		obj1 = null; // �ν��Ͻ� 2 �Ҹ� ���
		System.out.println("���α׷��� �����մϴ�.");
		
		System.gc();
		System.runFinalization();
	}

}
class MyName{
	String name;

	public MyName(String name) {
		this.name = name;
	}

	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println(name + "�� �Ҹ�Ǿ����ϴ�.");
	}

	public String toString() {
		return "MyName [name=" + name + "]";
	}

}