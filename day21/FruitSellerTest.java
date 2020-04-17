package com.day21;

public class FruitSellerTest {

	public static void main(String[] args) {

		FruitSeller f1 = new FruitSeller(30, 1500);
		FruitSeller f2 = new FruitSeller(20, 1000);
		
		FruitBuyer my = new FruitBuyer(20000);
		my.buyApple(f1, 4500);
		my.buyApple(f2, 2000);
		
		System.out.println("<���� �Ǹ���1�� �����Ȳ>");
		f1.showSaleResult();
		System.out.println("<���� �Ǹ���2�� �����Ȳ>");
		f2.showSaleResult();
		System.out.println("<���� �������� ���� ��Ȳ>");
		my.showBuyResult();
		
		System.out.println("\n�����ڰ� �������2���� 4000�� ��ŭ �����ϱ�");
		my.buyApple(f2, 4000);
		System.out.println("<���� �Ǹ���2�� �����Ȳ>");
		f2.showSaleResult();
		System.out.println("<���� �������� ���� ��Ȳ>");
		my.showBuyResult();
		
		//�迭 �̿�
		System.out.println("\n�����ڰ� �������2���� 3500�� ��ŭ �����ϱ�");
		my.buyApple(f2, 3500);
		System.out.println("<���� �Ǹ���2�� �����Ȳ>");
		f2.showSaleResult();
		System.out.println("<���� �������� ���� ��Ȳ>");
		my.showBuyResult();
		
		System.out.println("\n�����ڰ� �������1���� 4000�� ��ŭ �����ϱ�");
		my.buyApple(f1, 4000);
		System.out.println("<���� �Ǹ���1�� �����Ȳ>");
		f1.showSaleResult();
		System.out.println("<���� �������� ���� ��Ȳ>");
		my.showBuyResult();
		
	}

}

class FruitResult{
	private int num, change; // ��� ����, �Ž�����
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
		
		FruitResult f = seller.saleApple(money);
		numOfApple += f.getNum();
		myMoney -= (money - f.getChange());
		
	}
	public void showBuyResult() {
		System.out.println("���� �ܾ� : " + myMoney);
		System.out.println("��� ���� : " + numOfApple);
	}
}

