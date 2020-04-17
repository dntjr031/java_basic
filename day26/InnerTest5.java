package com.day26;

public class InnerTest5 {
	
	class InstanceInner{}
	static class StaticInner{}
	
	InstanceInner iv = new InstanceInner();
	static StaticInner cv = new StaticInner(); // 서로 직접 접근이 가능
	
	static void staticMethod() {
		//InstanceInner obj1 = new InstanceInner(); static 멤버는 인스턴스멤버에 직접 접근할 수 없다.
		StaticInner obj2 = new StaticInner();
		obj2.toString();
		//굳이 접근하려면 객체를 생성해야 한다.
		InnerTest5 it = new InnerTest5();
		InstanceInner obj1 = it.new InstanceInner();
		obj1.toString();
	}
	
	void instanceMethod() {
		//인스턴스 메서드에서는 모두 접근 가능
		InstanceInner obj1 = new InstanceInner();
		obj1.toString();
		StaticInner obj2 = new StaticInner();
		obj2.toString();
		
		//LocalInner lv = new LocalInner(); // 메서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근 불가
	}
	
	void myMethod() {
		class LocalInner{}
		
		LocalInner lv = new LocalInner();
		lv.toString();
	}
	
	public static void main(String[] args) {
		
	}

}
