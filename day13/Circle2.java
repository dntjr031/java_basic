package com.day13;

public class Circle2 {
	
	//1. ������� (�Ӽ�, ��������, ������)
	int radius; //������
	
	//2. ������
	Circle2(int p_radius){
		radius = p_radius;
	}
	
	
	//3. �޼��� (���, �ൿ)
	//���� ���� ���ϴ� ���
	public double findArea() {
		double area = radius*radius*3.14;
		return area;
	}
	//���� �ѷ� ���ϴ� ���
	public double findGirth() {
		double girth = 3.14*2*radius;
		return girth;
	}

}
