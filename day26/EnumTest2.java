package com.day26;

public class EnumTest2 {

	public static void main(String[] args) {
		Card1 c1 = new Card1(0, 0);
		c1.showInfo();
		
		Card c = new Card(Card.Kind.SPADE, Card.Num.TWO);
		c.showInfo();
		
		if(c1.kind == c1.num) { // true
			System.out.println("Card1.CLOVER와 Card1.TWO는 같다");
		}
		
		//if(c.kind == c.num) { }// error : incomparable types
		
		/*
		 이전 방식으로는 타입이 달라도 값이 같으면,
		 조건식 결과가 true였으나, 
		 새로 도입된 타입에 안전한 열거형에서는
		 실제 값이 같아도 타입이 다르면 조건식의 결과가 false가 됨
		 
		 값 뿐만 아니라 타입까지 체크하기 때문에 타입에 안전한 (typeSafe) 열거형이라고 함
		 */
	}

}

class Card1{
	static final int CLOVER = 0;
	static final int HEART = 1;
	static final int DIAMOMD = 2;
	static final int SPADE = 3;
	
	static final int TWO = 0;
	static final int THREE = 1;
	static final int FOUR = 2;
	
	final int kind;
	final int num;
	
	public Card1(int kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	
	public void showInfo() {
		System.out.println("kind = " + kind);
		System.out.println("num = " + num);
	}
}

class Card{
	enum Kind{CLOVER,HEART,DIAMOMD,SPADE}
	enum Num{TWO,THREE,FOUR}
	
	final Kind kind;
	final Num num;
	
	public Card(Kind kind, Num num) {
		this.kind = kind;
		this.num = num;
	}
	
	public void showInfo() {
		System.out.println("kind = " + kind);
		System.out.println("num = " + num);
	}
}