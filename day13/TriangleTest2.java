package com.day13;

import java.util.Scanner;

public class TriangleTest2 {

	public static int area(int w, int h) {
		return w * h / 2;
		
	}
	
	public static void main(String[] args) {
		// 2. ����Ŭ�������� �ﰢ�� ���� ���ϴ� �޼��� ���� ó��
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ﰢ���� �غ�, ���̸� �Է�");
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int area = area(w, h);
		System.out.println("���� : " + area);
		
		sc.close();

	}

}
