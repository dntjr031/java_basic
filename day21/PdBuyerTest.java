package com.day21;

public class PdBuyerTest {

	public static void main(String[] args) {

		Buyer b = new Buyer(1000);
		Product p = null;
		
		//200만원인 tv 구매
		p = new Tv(200);
		b.buy(p);
		//150만원인 computer구매
		p = new Computer(150);
		b.buy(p);
		//구매자의 현재 상태 출력
		b.showInfo();
	}

}

abstract class Product{
	protected int price, bonusPoint; //상품가격, 포인트 점수
	protected final double POINT_RATE=0.02; // 포인트 점수는 상품의 2%
	
	public Product(int price) {
		this.price = price;
		this.bonusPoint = (int)(price * POINT_RATE);
	}

	public int getPrice() {
		return price;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}
	
	public abstract String findInfo();
}

class Tv extends Product{

	public Tv(int price) {
		super(price);
	}

	public String findInfo() {
		return "TV";
	}
	
}

class Computer extends Product{

	public Computer(int price) {
		super(price);
	}

	public String findInfo() {
		return "Computer";
	}
	
}

class Buyer{
	private int myMoney;
	private int Point;
	
	public Buyer(int myMoney) {
		this.myMoney = myMoney;
	}
	
	public void buy(Product p) {
		if(myMoney < p.getPrice()) {
			System.out.println("잔액이 부족하여 물건을 구매할 수 없습니다.");
			return;
		}
		
		this.myMoney -= p.getPrice();
		this.Point += p.getBonusPoint();
		
		System.out.println(p.findInfo() + "을(를) 구매하였습니다.");
	}
	
	public void showInfo() {
		System.out.println("현재 잔고 : " + myMoney);
		System.out.println("보너스 포인트 : " + Point + "\n");
	}
}
