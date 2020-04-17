package com.day17;

public class CardTest {

	public static void main(String[] args) {
		Card c1 = new Card("Heart", 7);
		c1.display();
		
		System.out.println("ī���� ���� ũ�� : " + Card.WIDTH);
		System.out.println("ī���� ���� ũ�� : " + Card.HEIGHT);
		
		Card c2 = new Card("Diamond", 3);
		c2.display();

		//Card.WIDTH = 100; => error
		//c2.KIND = "Clover"; => error
	}

}

class Card{
	//static final ������ ����� �ʱ�ȭ�� ����
	public static final int WIDTH = 120;
	public static final int HEIGHT = 200;
	// final ������ ����� �ʱ�ȭ�ϴ� ��� �����ڿ��� �� �ѹ� �ʱ�ȭ �� �� �ִ�.
	// => �ν��Ͻ����� �ٸ� ���� ���� �� �� �ִ�.
	final String KIND;
	final int NUMBER;
	
	public Card(String kIND, int nUMBER) {
		KIND = kIND;
		NUMBER = nUMBER;
	}
	public void display() {
		System.out.println("ī������ : " + KIND);
		System.out.println("ī����� : " + NUMBER);
	}
}