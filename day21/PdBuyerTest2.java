package com.day21;

import java.util.Scanner;

public class PdBuyerTest2 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		Buyer2 b = new Buyer2(1000);
		
		while(true) {
			System.out.println("1. ��ǰ ���� 2. ���ų��� ��ȸ 3. ����");
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
					System.out.println("�����մϴ�.");
					return;
				default:
					System.out.println("�߸��Է�");
					continue;
			}
		}
	}

}

class ProductManager{
	static Scanner sc = new Scanner(System.in);
	
	public static void buyInput(Buyer2 b) {
		System.out.println("������ ��ǰ�� �����ϼ��� (1. TV 2. Computer)");
		int choice = sc.nextInt();
		if( choice == 1 || choice == 2) {
			System.out.println("��ǰ������ �Է��ϼ���");
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
			System.out.println("�߸��Է�");
				return;
		}		
	}
}

abstract class Product2{
	protected int price, bonusPoint; //��ǰ����, ����Ʈ ����
	protected final double POINT_RATE=0.02; // ����Ʈ ������ ��ǰ�� 2%
	
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
	//�����ڰ� ������ ��ǰ���� ������ �迭
	private Product2[] p = new Product2[10];
	private int count;
	
	public Buyer2(int myMoney) {
		this.myMoney = myMoney;
	}
	
	public void buy(Product2 p) {
		if(count == 10) {
			System.out.println("���̻� ��ǰ�� ������ �� �����ϴ�.");
			return;
		}
		if(myMoney < p.getPrice()) {
			System.out.println("�ܾ��� �����Ͽ� ������ ������ �� �����ϴ�.\n");
			return;
		}
		
		this.myMoney -= p.getPrice();
		this.Point += p.getBonusPoint();
		
		this.p[count++] = p;
		
		System.out.println(p.findInfo() + "��(��) �����Ͽ����ϴ�.\n");
	}
	
	public void showInfo() {
		System.out.println("���� �ܰ� : " + myMoney);
		System.out.println("���ʽ� ����Ʈ : " + Point + "\n");
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
		System.out.println("\n�����ڰ� ������ ��ǰ���� �� ���� : " + sum);
		System.out.println("�����Ͻ� ��ǰ�� : " + itemList + "�Դϴ�.");
		System.out.println("���ʽ� ����Ʈ : " + Point + "\n");
	}
}
