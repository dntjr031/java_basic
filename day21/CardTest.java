package com.day21;

public class CardTest {

	public static void main(String[] args) {
		Deck d = new Deck();

		Card c = d.pick(0);
		System.out.println(c.findInfo());
		
		System.out.println("\nÄ«µå ÇÑ ¹ú");
		Card[] cArr = d.getCard();
		for(Card card : cArr) {
			System.out.println(card.findInfo());
		}
		
		System.out.println("\nshuffle");
		d.shuffle();
		
		cArr = d.getCard();
		for(Card card : cArr) {
			System.out.println(card.findInfo());
		}
		
	}

}

class Card{
	private final int NUM, KIND;
	
	private static final int SPADE = 1, DIAMOND = 2, HEART = 3, CLOVER = 4;
	
	public static final int MAX_NUM = 13, MAX_KIND = 4;
	
	public Card(int nUM, int kIND) {
		NUM = nUM;
		KIND = kIND;
	}
	
	public String findInfo() {
		String kind = "", num = "";
		
		switch(KIND) {
			case SPADE: kind = "SPADE"; break;
			case DIAMOND: kind = "DIAMOND"; break;
			case HEART: kind = "HEART"; break;
			case CLOVER: kind = "CLOVER"; break;
			default:
		}
		switch(NUM){
			case 1: num = "A"; break;
			case 11: num = "J"; break;
			case 12: num = "Q"; break;
			case 13: num = "K"; break;
			default: num = NUM + "";
		}
		return "card[" + kind + ", " + num + "]";
	}
}

class Deck{
	private static final int CARD_NUM = 52;
	private Card[] card = new Card[CARD_NUM];
	int count = 0;
	
	public Deck() {
		for (int i = 1; i <= Card.MAX_KIND; i++) {
			for (int j = 1; j <= Card.MAX_NUM; j++) {
				card[count++] = new Card(j, i);
			}
		}
	}

	public Card[] getCard() {
		return card;
	}
	
	public Card pick(int idx) {
		Card c = null;
		if(idx >= 0 && idx < CARD_NUM) {
			c = card[idx];
		}else {
			c = pick();
		}
		return c;
	}
	
	public Card pick() {
		int random = (int)(Math.random()*52);
		return card[random];
	}
	
	public void shuffle() {
		for (int i = 0; i < 1000; i++) {
			int random = (int)(Math.random()*52);
			Card c = card[0];
			card[0] = card[random];
			card[random] = c;
			
		}
	}
	
}