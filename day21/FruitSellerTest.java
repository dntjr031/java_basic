package com.day21;

public class FruitSellerTest {

	public static void main(String[] args) {

		FruitSeller f1 = new FruitSeller(30, 1500);
		FruitSeller f2 = new FruitSeller(20, 1000);
		
		FruitBuyer my = new FruitBuyer(20000);
		my.buyApple(f1, 4500);
		my.buyApple(f2, 2000);
		
		System.out.println("<과일 판매자1의 현재상황>");
		f1.showSaleResult();
		System.out.println("<과일 판매자2의 현재상황>");
		f2.showSaleResult();
		System.out.println("<과일 구매자의 현재 상황>");
		my.showBuyResult();
		
		System.out.println("\n구매자가 과일장사2에게 4000원 만큼 구매하기");
		my.buyApple(f2, 4000);
		System.out.println("<과일 판매자2의 현재상황>");
		f2.showSaleResult();
		System.out.println("<과일 구매자의 현재 상황>");
		my.showBuyResult();
		
		//배열 이용
		System.out.println("\n구매자가 과일장사2에게 3500원 만큼 구매하기");
		my.buyApple(f2, 3500);
		System.out.println("<과일 판매자2의 현재상황>");
		f2.showSaleResult();
		System.out.println("<과일 구매자의 현재 상황>");
		my.showBuyResult();
		
		System.out.println("\n구매자가 과일장사1에게 4000원 만큼 구매하기");
		my.buyApple(f1, 4000);
		System.out.println("<과일 판매자1의 현재상황>");
		f1.showSaleResult();
		System.out.println("<과일 구매자의 현재 상황>");
		my.showBuyResult();
		
	}

}

class FruitResult{
	private int num, change; // 사과 개수, 거스름돈
	public FruitResult(int num, int change) {
		this.num = num;
		this.change = change;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getChange() {
		return change;
	}
	public void setChange(int change) {
		this.change = change;
	}
	
	
}

class FruitSeller {
	private final int APPLE_PRICE;
	private int numOfApple;
	private int myMoney;
	
	public FruitSeller(int numOfApple, int aPPLE_PRICE) {
		this.numOfApple = numOfApple;
		this.APPLE_PRICE = aPPLE_PRICE;
	}

	public FruitResult saleApple(int money) {
		
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		int change = money % APPLE_PRICE;
		myMoney += (money-change);
		FruitResult f = new FruitResult(num, change);
		
		return f;
	}
	
	public void showSaleResult() {
		System.out.println("남은 사과: " + numOfApple);
		System.out.println("판매 수익: " + myMoney);
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
			System.out.println("돈이 부족합니다.");
			return;
		}
		
		FruitResult f = seller.saleApple(money);
		numOfApple += f.getNum();
		myMoney -= (money - f.getChange());
		
	}
	public void showBuyResult() {
		System.out.println("현재 잔액 : " + myMoney);
		System.out.println("사과 개수 : " + numOfApple);
	}
}

