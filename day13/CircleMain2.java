package com.day13;


public class CircleMain2 {

	public static void main(String[] args) {
		//��ü ���� �� ��������.�޼���()�� �޼��� ȣ��
		Circle2 cc = new Circle2(10); // ��ü ������ ������ ȣ��κп��� �Ű������� �ݵ�� �Ѱܾ� ��
		//new ������ �κ��� �����ڸ� ȣ���ϴ� �κ�
		double area = cc.findArea();
		
		
		System.out.println("���� ���� : " + area);

		
		double girth = cc.findGirth();	
		System.out.println("���� �ѷ� : " + girth);
		
	}

}
