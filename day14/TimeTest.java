package com.day14;

import java.util.Scanner;

public class TimeTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��, ��, �� �Է�!");
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int sec = sc.nextInt();
		
		Time t = new Time(hour, min, sec);
		
		int toSec = t.toSec();
		
		System.out.println("�ʷ� ȯ�� �ϸ� => " + toSec + "��");
		
		//setter�� �̿��ؼ� ��������� �� ����
		t.setHour(12);
		t.setMin(13);
		t.setSec(50);
		
		//getter�� �̿��ؼ� ��������� �� �о����
		System.out.println("\n\n------����� �ð�------");
		System.out.println(t.getHour() + "�� " + t.getMin() + "�� " + t.getSec() + "��");
		System.out.println("�ʷ� ȯ�� : " + t.toSec() + "��");
		
		sc.close();

	}

}
