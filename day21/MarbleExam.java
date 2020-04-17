package com.day21;

public class MarbleExam {

	public static void main(String[] args) {
		
		Child c1 = new Child(15);
		Child c2 = new Child(9);
		
		System.out.println("���� �� ������ ���� ����");
		System.out.println("===���1===");
		c1.showProperty();
		System.out.println("===���2===");
		c2.showProperty();
		
		c1.obtainBead(c2, 2);
		c2.obtainBead(c1, 7);
		System.out.println("\n���� �� ������ ���� ����");
		System.out.println("===���1===");
		c1.showProperty();
		System.out.println("===���2===");
		c2.showProperty();
	}

}

class Child{
	private int marble;

	public Child(int marble) {
		this.marble = marble;
	}
	
	public void loseBead(int loseCount) {
		marble -= loseCount;
	}
	
	public void obtainBead(Child ch, int obtainCount) {
		ch.loseBead(obtainCount);
		marble += obtainCount;
	}
	
	public void showProperty() {
		System.out.println("���� ������ ����: " + marble);
	}
}