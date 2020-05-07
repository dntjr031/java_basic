package com.day20;

/*
 AA와 BB 클래스는 간접적인 관계
 
 클래스 A가 클래스 B를 직접 호출하지 않고 인터페이스를 매개체로 하는 경우
  - 클래스 A는 인터페이스 I 하고만  직접적인 관계가 있기때문에
   	클래스 B의 변경에 영향을 받지 않음
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
