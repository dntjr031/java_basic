package com.day18;

import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �����ϼ���(1. ����, 2. ����)");
		int num = sc.nextInt();
		Car c = null;
		if(num == 1) {
			c = new Equus();
		}else if(num == 2) {
			c = new Benz();
		}else {
			System.out.println("�߸��Է�");
		}
		
		if(c != null) {
			c.carKinds();
			c.engine();
		}

		sc.close();
	}

}
