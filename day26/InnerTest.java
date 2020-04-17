package com.day26;

public class InnerTest {
	
	// 인스턴스 클래스
	class InstanceInner{
		int iv = 100;
		//static int cv = 100; //error, static변수를 선언할 수 없다
		final static int CONST = 100; // 상수이므로 허용
	}
	
	//static 클래스
	static class StaticInner{
		int iv = 200;
		static int cv = 200; // static클래스만 static멤버를 정의할 수 있다.
		final static int CONST = 100;
	}
	
	void myMethod() {
		//지역 클래스
		/*class LocalInner{
			int iv = 300;
			//static int cv = 300; // error, static변수를 선언할 수 없다
			final static int CONST = 300; // 상수이므로 허용
		}*/
	}
	
	public static void main(String[] args) {
		System.out.println(InnerTest.StaticInner.cv);
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.CONST);
	}

}
