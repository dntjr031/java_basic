package com.day26;

public class InnerTest2 {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner{
		int iiv = outerIv; // 외부 클래스의 private멤버도 접근 가능
		int iiv2 = outerCv;
	}
	
	static class StaticInner{
		//int siv = outerIv; // static 클래스는 외부 클래스의 static 멤버만 접근 가능
		static int scv = outerCv;
	}
	
	void myMethod() {
		/*int lv = 0;
		final int LV = 0;
		
		class LocalInner{
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv; // 외부클래스의 지역변수는 final이 붙은 상수만 접근가능했지만 JDK8.0부터 모두 가능
			int liv4 = LV;
		}*/
	}
	public static void main(String[] args) {
		
	}

}
