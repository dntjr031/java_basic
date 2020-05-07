package com.day15;

import java.util.Scanner;

public class BookSalesTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("책 제목, 수량, 단가를 입력하세요!");
			String title = sc.nextLine();
			int quantity = sc.nextInt();
			int price = sc.nextInt();
			
			BookSales obj = new BookSales(title, quantity, price);
			obj.findSalesPrice();
			obj.findTotal();
			
			System.out.println("판매금액=" + obj.getSalesPrice() + ", 누적 판매금액=" + 
					BookSales.getTotalSalesPrice() + "\n");
			
			System.out.println("그만하려면 Q");
			sc.nextLine();
			String quit = sc.nextLine();
			if(quit.equalsIgnoreCase("Q")) break;
		}
		
		sc.close();

	}

}
