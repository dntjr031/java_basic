package com.day13;

import java.util.Scanner;

public class TriangleTest4 {

	public static void main(String[] args) {
		// 4. ������ Ŭ�������� �ﰢ�� ���� ���ϴ� �޼��� ���� ó��
		//(��������� �ִ� Ŭ����)
		Scanner sc = new Scanner(System.in);
		System.out.println("�ﰢ���� �غ�, ���̸� �Է�");
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		// ��ü ������ ��������.�޼���() ȣ��
		Triangle2 tri = new Triangle2(w, h);
		
		int area = tri.area();
		System.out.println("���� : " + area);
		
		//��������� �� ����
		tri.h = 100;
		tri.w = 200;
		
		area = tri.area();
		System.out.println("����� ���� : " + area);
		
		sc.close();

	}

}
