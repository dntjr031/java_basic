package com.day15;

import java.util.Scanner;

public class BookSalesTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("å ����, ����, �ܰ��� �Է��ϼ���!");
			String title = sc.nextLine();
			int quantity = sc.nextInt();
			int price = sc.nextInt();
			
			BookSales obj = new BookSales(title, quantity, price);
			obj.findSalesPrice();
			obj.findTotal();
			
			System.out.println("�Ǹűݾ�=" + obj.getSalesPrice() + ", ���� �Ǹűݾ�=" + 
					BookSales.getTotalSalesPrice() + "\n");
			
			System.out.println("�׸��Ϸ��� Q");
			sc.nextLine();
			String quit = sc.nextLine();
			if(quit.equalsIgnoreCase("Q")) break;
		}
		
		sc.close();

	}

}
