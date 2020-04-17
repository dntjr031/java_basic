package com.day18;

public class FoodSale {
	protected String menu;
	protected int quantity, unitPrice, price;
	protected static int totalPrice;
	
	public FoodSale(String menu, int quantity, int unitPrice) {
		this.menu = menu;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public void findPrice() {
		price = quantity * unitPrice;
	}
	public void findTotal() {
		totalPrice += price;
	}
}

class StudentFoodSale extends FoodSale{
	private final double INTEREST_RATE = 0.1;
	private int interest, totalIterest;
	
	public int getTotalIterest() {
		return totalIterest;
	}

	public void setTotalIterest(int totalIterest) {
		this.totalIterest = totalIterest;
	}

	public StudentFoodSale(String menu, int quantity, int unitPrice) {
		super(menu, quantity, unitPrice);
		
	}

	public void findPrice() {
		
		super.findPrice();
		interest = (int)(price*INTEREST_RATE);
	}

	public void findTotal() {
		
		super.findTotal();
		totalIterest = price - interest;
	}
	
	
}
