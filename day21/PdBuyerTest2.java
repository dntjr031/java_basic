package com.day21;

import java.util.Scanner;

public class PdBuyerTest2 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		Buyer2 b = new Buyer2(1000);
		
		while(true) {
			System.out.println("1. 상품 구매 2. 구매내역 조회 3. 종료");
			int num = sc.nextInt();
			sc.nextLine();
			switch(num) {
				case 1:
					ProductManager.buyInput(b);
					break;
				case 2:
					b.summary();
					break;
				case 3:
					System.out.println("종료합니다.");
					return;
				default:
					System.out.println("잘못입력");
					continue;
			}
		}
	}

}

class ProductManager{
	static Scanner sc = new Scanner(System.in);
	
	public static void buyInput(Buyer2 b) {
		System.out.println("구입할 상품을 선택하세요 (1. TV 2. Computer)");
		int choice = sc.nextInt();
		if( choice == 1 || choice == 2) {
			System.out.println("상품가격을 입력하세요");
			int price = sc.nextInt();
			sc.nextLine();
			
			switch(choice){
			case 1:
				b.buy(new Tv2(price));
				break;
			case 2:
				b.buy(new Computer2(price));
				break;
			default:
				
			}	
		}else {
			System.out.println("잘못입력");
				return;
		}		
	}
}

abstract class Product2{
	protected int price, bonusPoint; //상품가격, 포인트 점수
	protected final double POINT_RATE=0.02; // 포인트 점수는 상품의 2%
	
	public Product2(int price) {
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

class Tv2 extends Product2{

	public Tv2(int price) {
		super(price);
	}

	public String findInfo() {
		return "TV";
	}
	
}

class Computer2 extends Product2{

	public Computer2(int price) {
		super(price);
	}

	public String findInfo() {
		return "Computer";
	}
	
}

class Buyer2{
	private int myMoney;
	private int Point;
	//구매자가 구매한 상품들을 저장할 배열
	private Product2[] p = new Product2[10];
	private int count;
	
	public Buyer2(int myMoney) {
		this.myMoney = myMoney;
	}
	
	public void buy(Product2 p) {
		if(count == 10) {
			System.out.println("더이상 상품을 구매할 수 없습니다.");
			return;
		}
		if(myMoney < p.getPrice()) {
			System.out.println("잔액이 부족하여 물건을 구매할 수 없습니다.\n");
			return;
		}
		
		this.myMoney -= p.getPrice();
		this.Point += p.getBonusPoint();
		
		this.p[count++] = p;
		
		System.out.println(p.findInfo() + "을(를) 구매하였습니다.\n");
	}
	
	public void showInfo() {
		System.out.println("현재 잔고 : " + myMoney);
		System.out.println("보너스 포인트 : " + Point + "\n");
	}
	
	public void summary() {
		int sum = 0;
		String itemList = "";
		
		for (int i = 0; i < count; i++) {
			Product2 p = this.p[i];
			sum += p.getPrice();
			itemList += p.findInfo();
			if(i < count-1) {
				itemList += ", ";
			}
		}
		System.out.println("\n구매자가 구매한 삼품들의 총 가격 : " + sum);
		System.out.println("구입하신 제품은 : " + itemList + "입니다.");
		System.out.println("보너스 포인트 : " + Point + "\n");
	}
}
