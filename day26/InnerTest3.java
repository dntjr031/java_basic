package com.day26;

public class InnerTest3 {

	public static void main(String[] args) {
		//인스턴스클래스의 인스턴스를 생성하려면
		//외부 클래스의 인스턴스를 먼저 생성해야한다.
		System.out.println(Outer.InstanceInner.cv); // static 변수는 클래스명으로 바로 접근 가능
		Outer o = new Outer();
		Outer.InstanceInner ii = o.new InstanceInner();
		
		System.out.println("ii.iv : " + ii.iv);
		System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);
		
		//스태틱 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다.
		System.out.println(Outer.StaticInner.cv); // 스태틱 내부 클래스의 스택틱변수는 객체생성하지 않아도 된다.
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.iv : " + si.iv);
	}

}

class Outer{
	class InstanceInner{
		int iv = 100;
		static final int cv = 150;
	}
	static class StaticInner{
		int iv = 200;
		static int cv = 300;
	}
	
	void myMethod() {
		/*class LocalInner{ // 메서드 내에 있는 지역클래스는 외부에서 접근 할 수 없다.
			int iv = 400;
		}*/
	}
}
