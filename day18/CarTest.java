package com.day18;

import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("차종을 선택하세요(1. 에쿠스, 2. 벤츠)");
		int num = sc.nextInt();
		Car c = null;
		if(num == 1) {
			c = new Equus();
		}else if(num == 2) {
			c = new Benz();
		}else {
			System.out.println("잘못입력");
		}
		
		if(c != null) {
			c.carKinds();
			c.engine();
		}

		sc.close();
	}

}
