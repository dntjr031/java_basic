package com.day14;

public class Triangle {
	
	private int width, hight;

	/*
	 this
	  - �ν��Ͻ� �ڽ��� ����Ű�� ��������
	  - �ڱ� �ڽ��� ����Ű�� this
	  - �ڽ��� ����� ����Ű�� this(this.�������)
	  - �ν��Ͻ��� �ּҰ� ����Ǿ� ���� 
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
