package com.day17;

public class SuperTest3 {
	public static void main(String[] args) {
		Son s = new Son("홍길동");
		s.showInfo();
	}
}

class Father{
	private String name;

	public Father(String name) {
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
	}

}

class Son extends Father{
	//부모 생성자에 매개변수가 있으므로 자식 클래스에는 반드시 생성자가 있어야 함
	public Son(String name) {
		super(name); // 부모 생성자에 매개변수를 넣어줘야 하므로
	}
	
}
