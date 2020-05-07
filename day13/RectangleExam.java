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
		
		System.out.println("사각형의 가로, 세로를 입력하세요");
		int w = sc.nextInt();
		int d = sc.nextInt();
		
		Rectangle re = new Rectangle(w, d);
		
		int area = re.area();
		int girth = re.girth();
		System.out.println("사각형의 넓이 : " + area);
		System.out.println("사각형의 둘레 : " + girth);
		
		sc.close();

	}

}
