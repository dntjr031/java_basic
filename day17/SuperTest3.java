package com.day17;

public class SuperTest3 {
	public static void main(String[] args) {
		Son s = new Son("ȫ�浿");
		s.showInfo();
	}
}

class Father{
	private String name;

	public Father(String name) {
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("�̸� : " + name);
	}

}

class Son extends Father{
	//�θ� �����ڿ� �Ű������� �����Ƿ� �ڽ� Ŭ�������� �ݵ�� �����ڰ� �־�� ��
	public Son(String name) {
		super(name); // �θ� �����ڿ� �Ű������� �־���� �ϹǷ�
	}
	
}
