package com.day16;

class Points {
	//2차원 점의 좌표
	protected int x, y;
	
	public String findLocation() {
		String result = "x:" + x + ", y:" + y;
		return result;
	}
}

class Points3D extends Points{
	//3차원 점의 좌표
	private int z;
	
	//오버라이딩 메서드 - 부모로부터 상속받은 메서드의 내용을 변경하는 것, 메서드 재정의
	public String findLocation() {
		String result = "x:" + x +", y:" + y + ", z:" + z;
		return result;
	}
}


public class OverridingTest {

	public static void main(String[] args) {
		Points po = new Points();
		String str = po.findLocation();
		System.out.println("2차원 좌표=" + str + "\n");
		
		Points3D p = new Points3D();
		String r = p.findLocation();
		System.out.println("3차원 좌표=" + r);

	}

}
