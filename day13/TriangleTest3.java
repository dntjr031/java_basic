package com.day13;

import java.util.Scanner;

public class TriangleTest3 {

	public static void main(String[] args) {
		// 3. ������ Ŭ�������� �ﰢ�� ���� ���ϴ� �޼��� ���� ó��
		//(������� ���� Ŭ����)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ﰢ���� �غ�, ���̸� �Է�");
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		// ��ü ������ ��������.�޼���() ȣ��
		Triangle tri = new Triangle();
		
		int area = tri.area(w, h);
		System.out.println("���� : " + area);
		
		sc.close();

	}

}