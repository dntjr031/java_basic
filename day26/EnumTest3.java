package com.day26;

import java.util.ArrayList;

public class EnumTest3 {

	public static void main(String[] args) {
		Deck2 deck = new Deck2();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick(1));
		System.out.println(deck.pick(2) + "\n\n");
		
		for (int i = 0; i < deck.getCardList().size(); i++) {
			System.out.println(deck.pick(i));
		}
	}

}

class Card2{
	enum Kind{CLOVER,HEART,DIAMOND,SPADE};
	enum Num{TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING,ACE}
	
	final Kind kind;
	final Num num;
	
	public Card2(Kind kind, Num num) {
		this.kind = kind;
		this.num = num;
	}

	public Card2() {
		this(Kind.SPADE, Num.ACE);
	}

	public String toString() {
		return "Card2 [kind=" + kind + ", num=" + num + "]";
	}
	
	
}

class Deck2{
	private ArrayList<Card2> cardList = new ArrayList<Card2>();
	
	public ArrayList<Card2> getCardList() {
		return cardList;
	}

	Deck2(){
		for(Card2.Kind kind : Card2.Kind.values()) {
			for(Card2.Num num : Card2.Num.values()) {
				cardList.add(new Card2(kind, num));
			}
		}
	}
	
	public Card2 pick(int index) {
		return cardList.get(index);
	}
}
