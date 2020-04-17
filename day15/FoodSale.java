package com.day15;

public class FoodSale {

	private String menu;
	private int quantity, price, totalPrice;
	private static int touch;
	private static int discount;
	
	public FoodSale(String menu, int quantity, int price) {
		this.menu = menu;
		this.quantity = quantity;
		this.price = price;
	}

	public String getMenu() {
		return menu;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public static int getTouch() {
		return touch;
	}

	public void findTotal() {
		totalPrice = price * quantity - discount;
	}
	
	public void findDiscount() {
		discount = (int)(price * quantity * 0.15);
	}
	
	public void findTouch() {
		touch += totalPrice;
	}
}
