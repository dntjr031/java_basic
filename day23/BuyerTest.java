package com.day23;

import java.util.ArrayList;
import java.util.Scanner;

public class BuyerTest {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		Buyer b = new Buyer(1000);
		//총 구매가격과 목록 출력 summary
		b.summary();
		//170만원 컴 구매
		Product p = new Computer(170);
		b.buy(p);
		//300만원 티비 구매
		b.buy(new Tv(300));
		//250만원 컴 구매
		b.buy(new Computer(250));
		//총 구매가격과 목록 출력 summary
		b.summary();
		//showInfo 호출
		b.showInfo();
		//170만원 컴 반품
		b.refund(p);
		//최종 showInfo, summary호출
		b.showInfo();
		b.summary();
		
		
		/*
		while(true) {
			System.out.println("1. 상품 구매 2. 구매내역 조회 3. 반품 4. 종료");
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
					Product p = ProductManager.refund();
					if(p == null) continue;
					b.refund(p);
					break;
				case 4:	
					System.out.println("종료합니다.");
					return;
				default:
					System.out.println("잘못입력");
					continue;
			}
		}
		*/
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
		
	public String toString() {
		return "Product [price=" + price + "]";
	}
	
	
}

class Tv extends Product{

	public Tv(int price) {
		super(price);
	}

	public String toString() {
		return "TV [price=" + price + "]";
	}
	
}

class Computer extends Product{

	public Computer(int price) {
		super(price);
	}

	public String toString() {
		return "Computer [price=" + price + "]";
	}
}

class Buyer{
	private int myMoney;
	private int Point;
	//구매자가 구매한 상품들을 저장할 배열
	private ArrayList<Product> pArr = new ArrayList<Product>();
	
	
	public Buyer(int myMoney) {
		this.myMoney = myMoney;
	}
	
	public void buy(Product p) {
		if(pArr.size() == 10) {
			System.out.println("더이상 상품을 구매할 수 없습니다.");
			return;
		}
		if(myMoney < p.getPrice()) {
			System.out.println("잔액이 부족하여 물건을 구매할 수 없습니다.\n");
			return;
		}
		
		this.myMoney -= p.getPrice();
		this.Point += p.getBonusPoint();
		
		pArr.add(p);
		
		System.out.println(p + "을(를) 구매하였습니다.\n");
	}
	
	public void showInfo() {
		System.out.println("현재 잔고 : " + myMoney);
		System.out.println("보너스 포인트 : " + Point + "\n");
	}
	
	public void summary() {
		int sum = 0;
		String itemList = "";
		
		if(pArr.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		for (int i = 0; i < pArr.size(); i++) {
			Product p = pArr.get(i);
			sum += p.getPrice();
			itemList += p;
			if(i < pArr.size()-1) {
				itemList += ", ";
			}
		}
		System.out.println("\n구매자가 구매한 삼품들의 총 가격 : " + sum);
		System.out.println("구입하신 제품은 : " + itemList + "입니다.");
		System.out.println("보너스 포인트 : " + Point + "\n");
	}
	
	public void refund(Product p) {
		if(pArr.remove(p)) {
			myMoney += p.getPrice();
			Point -= p.getBonusPoint();
			System.out.println(p + "를 반품하셨습니다.");
		}else {
			System.out.println("해당 제품이 없습니다.");
		}
		
	}
}

class ProductManager{
	static Scanner sc = new Scanner(System.in);
	
	public static void buyInput(Buyer b) {
		System.out.println("구입할 상품을 선택하세요 (1. TV 2. Computer)");
		int choice = sc.nextInt();
		if( choice == 1 || choice == 2) {
			System.out.println("상품가격을 입력하세요");
			int price = sc.nextInt();
			sc.nextLine();
			
			switch(choice){
			case 1:
				b.buy(new Tv(price));
				break;
			case 2:
				b.buy(new Computer(price));
				break;
			default:
			}	
		}else {
			System.out.println("잘못입력");
				return;
		}		
	}
	
	public static Product refund() {
		Product p = null;
		System.out.println("반품 할 상품을 선택하세요 (1. TV 2. Computer)");
		int choice = sc.nextInt();
		if( choice == 1 || choice == 2) {
			
			System.out.println("반품 할 상품의 가격을 입력하세요");
			int price = sc.nextInt();
			sc.nextLine();
			
			switch(choice){
			case 1:
				p = new Tv(price);
				break;
			case 2:
				p = new Computer(price);
				break;
			default:
			}	
			return p;
		}else {
			System.out.println("잘못입력");
				return p;
		}		
	}
}