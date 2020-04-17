package com.day18;

import java.util.Scanner;

class ShapeManager{
	final int MAX_COUNT = 10;
	Shape2[] sh = new Shape2[MAX_COUNT];
	int i = 0;
	static Scanner sc = new Scanner(System.in);
	
	public void showMenu() {
		System.out.print("1.��, 2.�簢��, 3.����, 4.���� ==> ");
	}
	
	public void inputCircle() {
		if(i == MAX_COUNT) {
			System.out.println("���̻� �Է��� �� �����ϴ�.");
			return;
		}
		System.out.print("������ : ");
		int r = sc.nextInt();
		sh[i] = new Circle2(r);
		i++;
	}
	
	public void inputRectangle() {
		if(i == MAX_COUNT) {
			System.out.println("���̻� �Է��� �� �����ϴ�.");
			return;
		}
		System.out.println("����, ���� �Է�");
		int w = sc.nextInt();
		int h = sc.nextInt();
		sh[i] = new Rectangle(w, h);
		i++;
	}
	
	public void printAll() {
		if(i == 0) {
			System.out.println("�����Ͱ� �����ϴ�.");
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
				System.out.println("�����մϴ�");
				break;
			}else {
				System.out.println("�߸��Է�!");
				continue;
			}
			
		}
		
	}

}
