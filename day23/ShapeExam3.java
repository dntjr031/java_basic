package com.day23;

import java.util.ArrayList;
import java.util.Scanner;

public class ShapeExam3 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("3�ܰ�-----------------");
		ArrayList<Shape> sarr = new ArrayList<Shape>();
		while(true) {
			Shape s = null;
			System.out.println("1. ��, 2. �簢��, 3. ���� �� ����");
			int n = sc.nextInt();
			switch(n) {
				case 1:
					System.out.println("�������� �Է��ϼ���");
					double d = sc.nextDouble();
					s = new Circle(d);
					sarr.add(s);
					break;
				case 2:
					System.out.println("����, ���θ� �Է��ϼ���");
					double w = sc.nextDouble();
					double d1 = sc.nextDouble();
					s = new Rect(w, d1);
					sarr.add(s);
					break;
				default:
					System.out.println("����");
					if(sarr.isEmpty()) {
						return;
					}else {
						sarr.forEach(System.out::println);
					}
					return;
			}
			
		}
	}

}
