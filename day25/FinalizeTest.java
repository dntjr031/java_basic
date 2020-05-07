package com.day25;

public class FinalizeTest {

	public static void main(String[] args) {
		MyName obj1 = new MyName("인스턴스1");
		MyName obj2 = new MyName("인스턴스2");
		
		System.out.println(obj1);
		System.out.println(obj2);
		//obj1 = null;
		//obj2 = null;
		
		obj1 = obj2; // 인스턴스1 소멸 대상
		obj2 = null; // 소멸 x
		obj1 = null; // 인스턴스 2 소멸 대상
		System.out.println("프로그램을 종료합니다.");
		
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
		System.out.println(name + "이 소멸되었습니다.");
	}

	public String toString() {
		return "MyName [name=" + name + "]";
	}

}
