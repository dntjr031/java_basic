package com.day17;

public class CardTest {

	public static void main(String[] args) {
		Card c1 = new Card("Heart", 7);
		c1.display();
		
		System.out.println("카드의 가로 크기 : " + Card.WIDTH);
		System.out.println("카드의 세로 크기 : " + Card.HEIGHT);
		
		Card c2 = new Card("Diamond", 3);
		c2.display();

		//Card.WIDTH = 100; => error
		//c2.KIND = "Clover"; => error
	}

}

class Card{
	//static final 변수는 명시적 초기화만 가능
	public static final int WIDTH = 120;
	public static final int HEIGHT = 200;
	// final 변수는 선언시 초기화하는 대신 생성자에서 단 한번 초기화 할 수 있다.
	// => 인스턴스마다 다른 값을 갖게 할 수 있다.
	final String KIND;
	final int NUMBER;
	
	public Card(String kIND, int nUMBER) {
		KIND = kIND;
		NUMBER = nUMBER;
	}
	public void display() {
		System.out.println("카드종류 : " + KIND);
		System.out.println("카드숫자 : " + NUMBER);
	}
}
