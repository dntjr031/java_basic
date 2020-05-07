package com.day18;

import java.util.Scanner;

class ShapeManager{
	final int MAX_COUNT = 10;
	Shape2[] sh = new Shape2[MAX_COUNT];
	int i = 0;
	static Scanner sc = new Scanner(System.in);
	
	public void showMenu() {
		System.out.print("1.원, 2.사각형, 3.보기, 4.종료 ==> ");
	}
	
	public void inputCircle() {
		if(i == MAX_COUNT) {
			System.out.println("더이상 입력할 수 없습니다.");
			return;
		}
		System.out.print("반지름 : ");
		int r = sc.nextInt();
		sh[i] = new Circle2(r);
		i++;
	}
	
	public void inputRectangle() {
		if(i == MAX_COUNT) {
			System.out.println("더이상 입력할 수 없습니다.");
			return;
		}
		System.out.println("가로, 세로 입력");
		int w = sc.nextInt();
		int h = sc.nextInt();
		sh[i] = new Rectangle(w, h);
		i++;
	}
	
	public void printAll() {
		if(i == 0) {
			System.out.println("데이터가 없습니다.");
			return;
		}
		for (int j = 0; j < i; j++) {
			sh[j].findArea();
		}
	}
	
}

public class ShapeTest2 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ShapeManager sh = new ShapeManager();
		
		while(true) {
			
			sh.showMenu();
			int n = sc.nextInt();
			
			if(n == 1) {
				sh.inputCircle();
				continue;
			}else if(n == 2) {
				sh.inputRectangle();
				continue;
			}else if(n == 3) {
				sh.printAll();
				continue;
			}else if(n == 4) {
				System.out.println("종료합니다");
				break;
			}else {
				System.out.println("잘못입력!");
				continue;
			}
			
		}
		
	}

}
