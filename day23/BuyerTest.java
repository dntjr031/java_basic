package com.day23;

import java.util.ArrayList;
import java.util.Scanner;

public class BuyerTest {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		Buyer b = new Buyer(1000);
		//�� ���Ű��ݰ� ��� ��� summary
		b.summary();
		//170���� �� ����
		Product p = new Computer(170);
		b.buy(p);
		//300���� Ƽ�� ����
		b.buy(new Tv(300));
		//250���� �� ����
		b.buy(new Computer(250));
		//�� ���Ű��ݰ� ��� ��� summary
		b.summary();
		//showInfo ȣ��
		b.showInfo();
		//170���� �� ��ǰ
		b.refund(p);
		//���� showInfo, summaryȣ��
		b.showInfo();
		b.summary();
		
		
		/*
		while(true) {
			System.out.println("1. ��ǰ ���� 2. ���ų��� ��ȸ 3. ��ǰ 4. ����");
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
					System.out.println("�����մϴ�.");
					return;
				default:
					System.out.println("�߸��Է�");
					continue;
			}
		}
		*/
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
	//�����ڰ� ������ ��ǰ���� ������ �迭
	private ArrayList<Product> pArr = new ArrayList<Product>();
	
	
	public Buyer(int myMoney) {
		this.myMoney = myMoney;
	}
	
	public void buy(Product p) {
		if(pArr.size() == 10) {
			System.out.println("���̻� ��ǰ�� ������ �� �����ϴ�.");
			return;
		}
		if(myMoney < p.getPrice()) {
			System.out.println("�ܾ��� �����Ͽ� ������ ������ �� �����ϴ�.\n");
			return;
		}
		
		this.myMoney -= p.getPrice();
		this.Point += p.getBonusPoint();
		
		pArr.add(p);
		
		System.out.println(p + "��(��) �����Ͽ����ϴ�.\n");
	}
	
	public void showInfo() {
		System.out.println("���� �ܰ� : " + myMoney);
		System.out.println("���ʽ� ����Ʈ : " + Point + "\n");
	}
	
	public void summary() {
		int sum = 0;
		String itemList = "";
		
		if(pArr.isEmpty()) {
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
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
		System.out.println("\n�����ڰ� ������ ��ǰ���� �� ���� : " + sum);
		System.out.println("�����Ͻ� ��ǰ�� : " + itemList + "�Դϴ�.");
		System.out.println("���ʽ� ����Ʈ : " + Point + "\n");
	}
	
	public void refund(Product p) {
		if(pArr.remove(p)) {
			myMoney += p.getPrice();
			Point -= p.getBonusPoint();
			System.out.println(p + "�� ��ǰ�ϼ̽��ϴ�.");
		}else {
			System.out.println("�ش� ��ǰ�� �����ϴ�.");
		}
		
	}
}

class ProductManager{
	static Scanner sc = new Scanner(System.in);
	
	public static void buyInput(Buyer b) {
		System.out.println("������ ��ǰ�� �����ϼ��� (1. TV 2. Computer)");
		int choice = sc.nextInt();
		if( choice == 1 || choice == 2) {
			System.out.println("��ǰ������ �Է��ϼ���");
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
			System.out.println("�߸��Է�");
				return;
		}		
	}
	
	public static Product refund() {
		Product p = null;
		System.out.println("��ǰ �� ��ǰ�� �����ϼ��� (1. TV 2. Computer)");
		int choice = sc.nextInt();
		if( choice == 1 || choice == 2) {
			
			System.out.println("��ǰ �� ��ǰ�� ������ �Է��ϼ���");
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
			System.out.println("�߸��Է�");
				return p;
		}		
	}
}