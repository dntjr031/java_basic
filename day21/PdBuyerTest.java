package com.day21;

public class PdBuyerTest {

	public static void main(String[] args) {

		Buyer b = new Buyer(1000);
		Product p = null;
		
		//200������ tv ����
		p = new Tv(200);
		b.buy(p);
		//150������ computer����
		p = new Computer(150);
		b.buy(p);
		//�������� ���� ���� ���
		b.showInfo();
	}

}

abstract class Product{
	protected int price, bonusPoint; //��ǰ����, ����Ʈ ����
	protected final double POINT_RATE=0.02; // ����Ʈ ������ ��ǰ�� 2%
	
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
			System.out.println("�ܾ��� �����Ͽ� ������ ������ �� �����ϴ�.");
			return;
		}
		
		this.myMoney -= p.getPrice();
		this.Point += p.getBonusPoint();
		
		System.out.println(p.findInfo() + "��(��) �����Ͽ����ϴ�.");
	}
	
	public void showInfo() {
		System.out.println("���� �ܰ� : " + myMoney);
		System.out.println("���ʽ� ����Ʈ : " + Point + "\n");
	}
}
