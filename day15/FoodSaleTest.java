package com.day15;

import java.util.Scanner;

public class FoodSaleTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("메뉴, 수량, 단가를 입력하세요");
			String menu = sc.nextLine();
			int quantity = sc.nextInt();
			int price = sc.nextInt();
			
			FoodSale fo = new FoodSale(menu, quantity, price);
			fo.findDiscount();
			fo.findTotal();
			fo.findTouch();
			System.out.println("판매금액 = " + fo.getTotalPrice() + "원");
			System.out.println("누적 판매금액 = " + FoodSale.getTouch() + "원");
			
			System.out.println("그만하시겠습니까? Q");
			sc.nextLine();
			String esc = sc.nextLine();
			if(esc.equalsIgnoreCase("q")) break;
		}
		System.out.println("종료되었습니다");
		
		sc.close();
		

	}

}
