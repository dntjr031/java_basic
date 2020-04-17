package com.day26;

public class InnerTest5 {
	
	class InstanceInner{}
	static class StaticInner{}
	
	InstanceInner iv = new InstanceInner();
	static StaticInner cv = new StaticInner(); // ���� ���� ������ ����
	
	static void staticMethod() {
		//InstanceInner obj1 = new InstanceInner(); static ����� �ν��Ͻ������ ���� ������ �� ����.
		StaticInner obj2 = new StaticInner();
		obj2.toString();
		//���� �����Ϸ��� ��ü�� �����ؾ� �Ѵ�.
		InnerTest5 it = new InnerTest5();
		InstanceInner obj1 = it.new InstanceInner();
		obj1.toString();
	}
	
	void instanceMethod() {
		//�ν��Ͻ� �޼��忡���� ��� ���� ����
		InstanceInner obj1 = new InstanceInner();
		obj1.toString();
		StaticInner obj2 = new StaticInner();
		obj2.toString();
		
		//LocalInner lv = new LocalInner(); // �޼��� ���� ���������� ����� ���� Ŭ������ �ܺο��� ���� �Ұ�
	}
	
	void myMethod() {
		class LocalInner{}
		
		LocalInner lv = new LocalInner();
		lv.toString();
	}
	
	public static void main(String[] args) {
		
	}

}
