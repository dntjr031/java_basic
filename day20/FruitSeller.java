package com.day20;

public class FruitSeller {
	private final int APPLE_PRICE;
	private int numOfApple;
	private int myMoney;
	
	public FruitSeller(int numOfApple, int aPPLE_PRICE) {
		this.numOfApple = numOfApple;
		this.APPLE_PRICE = aPPLE_PRICE;
	}

	public int[] saleApple(int money) {
		int[] arr = new int[2];
		arr[0] = money / APPLE_PRICE;
		numOfApple -= arr[0];
		arr[1] = money % APPLE_PRICE;
		myMoney += (money-arr[1]);
		return arr;
	}
	
	public void showSaleResult() {
		System.out.println("���� ���: " + numOfApple);
		System.out.println("�Ǹ� ����: " + myMoney);
	}
}

class FruitBuyer{
	private int myMoney;
	private int numOfApple;
	
	public FruitBuyer(int myMoney) {
		this.myMoney = myMoney;
	}
	
	public void buyApple(FruitSeller seller, int money) {
		if(money > myMoney) {
			System.out.println("���� �����մϴ�.");
			return;
		}
		int[] arr = seller.saleApple(money);
		numOfApple += arr[0];
		myMoney -= (money - arr[1]);
	}
	public void showBuyResult() {
		System.out.println("���� �ܾ� : " + myMoney);
		System.out.println("��� ���� : " + numOfApple);
	}
}
