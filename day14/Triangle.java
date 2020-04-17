package com.day14;

public class Triangle {
	
	private int width, hight;

	/*
	 this
	  - 인스턴스 자신을 가리키는 참조변수
	  - 자기 자신을 가리키는 this
	  - 자신의 멤버를 가리키는 this(this.멤버변수)
	  - 인스턴스의 주소가 저장되어 있음 
	 */
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

	public Triangle(int width, int hight) {
	
		this.width = width;
		this.hight = hight;
	}

	public int area() {
		return width * hight / 2;
		
	}
	
	
}
