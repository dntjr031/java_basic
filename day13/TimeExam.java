package com.day13;

import java.util.Scanner;

public class TimeExam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��, ��, �ʸ� �Է��ϼ���");
		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		
		Time ti = new Time(h, m, s);
		Time ti2 = new Time(h, m);
		Time ti3 = new Time(h);
		
		ti.print();
		int sec = ti.toSec();
		System.out.println("�ʷ� ȯ���ϸ� " + sec);
		ti2.print();
		int sec2 = ti2.toSec();
		System.out.println("�ʷ� ȯ���ϸ� " + sec2);
		ti3.print();
		int sec3 = ti3.toSec();
		System.out.println("�ʷ� ȯ���ϸ� " + sec3);
		
		sc.close();

	}

}
