package com.day20;

import java.util.Scanner;

public class InterfaceConst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�!");
		System.out.println("1.�� 2.ȭ 3.�� 4.�� 5.�� 6.�� 7.��");
		int type = sc.nextInt();
		switch(type) {
			case Week.MON:
				System.out.println("�ְ� ȸ�ǰ� �ִ³�");
				break;
			case Week.THU:
				System.out.println("������Ʈ ��ȹ ȸ�ǰ� �ִ³�");
				break;
			case Week.WED:
				System.out.println("������� �����ϴ� ��");
				break;
			case Week.TUE:
				System.out.println("�౸���� �ϴ� ��");
				break;
			case Week.FRI:
				System.out.println("������Ʈ ������");
				break;
			case Week.SAT:
				System.out.println("������ �Բ� ��ſ� �ð� ��������");
				break;
			case Week.SUN:
				System.out.println("������ ����");
				break;
			default:
					System.out.println("�߸��Է�!");
		}
		sc.close();
	}

}

interface Week{
	int MON=1, TUE=2, WED=3, THU=4, FRI=5, SAT=6, SUN=7;
}