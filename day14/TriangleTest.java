package com.day14;

import java.util.Scanner;

public class TriangleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ﰢ���� �غ�, ���� �Է�!");
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		Triangle tr = new Triangle(w, h);
		int area = tr.area();
		
		System.out.println("�ﰢ�� ���� : " + area);
		
		//getter, setter�� ��������� �� ����
		tr.setHight(30);
		tr.setWidth(40);
		
		area = tr.area();
		
		System.out.println("\n����� �غ� : " + tr.getWidth());
		System.out.println("���� : " + tr.getHight());
		System.out.println("���� : " + area);
		
		sc.close();

	}

}
