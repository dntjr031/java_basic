package com.day24;

import java.util.Scanner;

public class TimeExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ð��� �Է��ϼ���(��, ��, ��)");
		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		
		Time t = new Time(h, m, s);
		t.imcrementHour();
		System.out.println(t.getHours()[0] + " : " + t.getHours()[1] + " : " + t.getHours()[2]);
		
		sc.close();
	}

}

class Time{
	private int[] hours = new int[3];

	public Time(int h, int m, int s) {
		hours[0] = h;
		hours[1] = m;
		hours[2] = s;
	}

	public int[] getHours() {
		return hours;
	}

	public void setHours(int[] hours) {
		this.hours = hours;
	}
	public void imcrementHour() { //�ú��� ��� 1����
		System.out.println("1�ð� 1�� 1�� ��");
		for (int i = 0; i < hours.length; i++) {
			hours[i] += 1;
		}
	}
}
