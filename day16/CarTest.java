package com.day16;

/*
 this.��� => �ڽ��� ����� ����Ű�� this
 this() => �����ڸ� ȣ���ϴ� this()
 			�ڽ��� �����ڵ� �� �ٸ� ������ ȣ��
 			�������� ù�ٿ����� ȣ�� ����
 */
class Car{
	private String color, gearType;
	private int door;
	
	public Car() {
		this("white", "auto", 4);
	}
	
	public Car(String color) {
		this(color,"auto",4);
	}
	
	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	public void showInfo() {
		System.out.println("color:" + color + ", gearType:" + gearType + ", door:" + door + "\n");
	}
	
}

public class CarTest {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car("black");
		c1.showInfo();
		c2.showInfo();
		
		Car c3 = new Car("red", "manual", 2);
		c3.showInfo();

	}

}
