package com.day15;

import java.util.Scanner;

public class FoodSaleTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("�޴�, ����, �ܰ��� �Է��ϼ���");
			String menu = sc.nextLine();
			int quantity = sc.nextInt();
			int price = sc.nextInt();
			
			FoodSale fo = new FoodSale(menu, quantity, price);
			fo.findDiscount();
			fo.findTotal();
			fo.findTouch();
			System.out.println("�Ǹűݾ� = " + fo.getTotalPrice() + "��");
			System.out.println("���� �Ǹűݾ� = " + FoodSale.getTouch() + "��");
			
			System.out.println("�׸��Ͻðڽ��ϱ�? Q");
			sc.nextLine();
			String esc = sc.nextLine();
			if(esc.equalsIgnoreCase("q")) break;
		}
		System.out.println("����Ǿ����ϴ�");
		
		sc.close();
		

	}

}
