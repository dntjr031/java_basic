package com.day17;

class Points {
	//2차원 점의 좌표
	protected int x, y;
	
	public Points(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String findLocation() {
		String result = "x:" + x + ", y:" + y;
		return result;
	}
}

class Points3D extends Points{
	//3차원 점의 좌표
	private int z;
	/*
	생성자
	- 상속을 받았을 경우 부모클래스의 생성자가 매개변수를 가지고 있다면
	 자식은 부모의 생성자에게 매개변수를 넣어줘야 함
	 
	 생성자의 첫 줄에서 this()나 super()를 이요해서 다른 생성자를 호출하지 않으면
	 컴파일러가 자동으로 super()를 넣어준다.
	*/
	public Points3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	//오버라이딩 메서드 - 부모로부터 상속받은 메서드의 내용을 변경하는 것, 메서드 재정의
	/*
	public String findLocation() {
		String result = "x:" + x +", y:" + y + ", z:" + z;
		return result;
	}
	*/
	
	public String findLocation() {
		// 부모 메서드 호출 => super.메서드이름()
		return super.findLocation() + ", z:" + z;
	}
}


public class OverridingTest {

	public static void main(String[] args) {
		Points po = new Points(3,5);
		String str = po.findLocation();
		System.out.println("2차원 좌표=" + str + "\n");
		
		Points3D p = new Points3D(2,6,3);
		String r = p.findLocation();
		System.out.println("3차원 좌표=" + r);

	}

}
