package com.day15;

public class BookSales {

	private String title;
	private int quantity, price, salesPrice;
	private static int totalSalesPrice;
	
	public BookSales(String title, int quantity, int price) {
		this.title = title;
		this.quantity = quantity;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}

	public int getSalesPrice() {
		return salesPrice;
	}

	public static int getTotalSalesPrice() {
		return totalSalesPrice;
	}

	public void findSalesPrice() {
		salesPrice = price * quantity;
	}
	
	public void findTotal() {
		totalSalesPrice += salesPrice;
	}
}
