package com.day13;

import java.util.Scanner;

class Rectangle {
	int depth;
	int width;
	
	public Rectangle(int width, int depth) {
		
		this.width = width;
		this.depth = depth;
	}
	
	public int area() {
		return width * depth;
		 
	}
	
	public int girth() {
		return 2 * (width + depth);
		
	}
}

public class RectangleExam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�簢���� ����, ���θ� �Է��ϼ���");
		int w = sc.nextInt();
		int d = sc.nextInt();
		
		Rectangle re = new Rectangle(w, d);
		
		int area = re.area();
		int girth = re.girth();
		System.out.println("�簢���� ���� : " + area);
		System.out.println("�簢���� �ѷ� : " + girth);
		
		sc.close();

	}

}
