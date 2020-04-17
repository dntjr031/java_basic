package com.day26;

public class InnerTest {
	
	// �ν��Ͻ� Ŭ����
	class InstanceInner{
		int iv = 100;
		//static int cv = 100; //error, static������ ������ �� ����
		final static int CONST = 100; // ����̹Ƿ� ���
	}
	
	//static Ŭ����
	static class StaticInner{
		int iv = 200;
		static int cv = 200; // staticŬ������ static����� ������ �� �ִ�.
		final static int CONST = 100;
	}
	
	void myMethod() {
		//���� Ŭ����
		/*class LocalInner{
			int iv = 300;
			//static int cv = 300; // error, static������ ������ �� ����
			final static int CONST = 300; // ����̹Ƿ� ���
		}*/
	}
	
	public static void main(String[] args) {
		System.out.println(InnerTest.StaticInner.cv);
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.CONST);
	}

}
