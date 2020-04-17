package com.day26;

public class EnumTest2 {

	public static void main(String[] args) {
		Card1 c1 = new Card1(0, 0);
		c1.showInfo();
		
		Card c = new Card(Card.Kind.SPADE, Card.Num.TWO);
		c.showInfo();
		
		if(c1.kind == c1.num) { // true
			System.out.println("Card1.CLOVER�� Card1.TWO�� ����");
		}
		
		//if(c.kind == c.num) { }// error : incomparable types
		
		/*
		 ���� ������δ� Ÿ���� �޶� ���� ������,
		 ���ǽ� ����� true������, 
		 ���� ���Ե� Ÿ�Կ� ������ ������������
		 ���� ���� ���Ƶ� Ÿ���� �ٸ��� ���ǽ��� ����� false�� ��
		 
		 �� �Ӹ� �ƴ϶� Ÿ�Ա��� üũ�ϱ� ������ Ÿ�Կ� ������ (typeSafe) �������̶�� ��
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