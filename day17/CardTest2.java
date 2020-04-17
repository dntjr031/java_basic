package com.day17;

public class CardTest2 {

	public static void main(String[] args) {
		
		Card[] c = new Card[3];
		c[0] = new Card("Heart", 7);
		c[1] = new Card("Diamond", 3);
		c[2] = new Card("Space", 1);
		
		for (int i = 0; i < c.length; i++) {
			c[i].display();
			System.out.println();
		}
		
	}
}
