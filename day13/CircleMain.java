package com.day13;

import java.util.Scanner;

public class CircleMain {

	public static void main(String[] args) {
		//���� ������ ���Ͻÿ� 
		// - findArea()�޼��� ���
		// - static �޼��尡 �ƴϹǷ� ��ü ���� �� ��������.�޼���() �� ȣ��
		
		//1. ��ü ����
		Circle cc = new Circle();
		
		//2. �޼��� ȣ��(���)
		//���� ��������� �� �Ҵ�
		cc.radius = 5;
		//�޼��� ȣ��
		double area = cc.findArea();
		
		
		System.out.println("���� ���� : " + area);

		//��������� �� ����
		cc.radius = 10;
		area = cc.findArea();
		System.out.println("����� ���� ���� : " + area);
		
		//����ڷκ��� �������� �Է¹޾Ƽ� ó��
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է�");
		int r = sc.nextInt();
		cc.radius = r;
		
		area = cc.findArea();
		System.out.println("�������� " + r + "�� ���� ���� : " + area);
		
		//���� �ѷ� ���ϱ�
		double girth = cc.findGirth();	
		System.out.println("���� �ѷ� : " + girth);
		sc.close();
	}

}
