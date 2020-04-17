package com.day25;

public class EqualsTset2 {

	public static void main(String[] args) {
		Person2 p1 = new Person2(9901971234567l);
		Person2 p2 = new Person2(9901971234567l);
		Person2 p3 = new Person2(9801971235564l);
		
		if(p1 == p2) {
			System.out.println("p1�� p2�� ���� �ּ��Դϴ�");
		}else {
			System.out.println("p1�� p2�� �ٸ� �ּ��Դϴ�");//
		}
		if(p1.equals(p2)) { //�������̵� �޼��� ȣ��
			System.out.println("p1�� p2�� ���� ����Դϴ�");//
		}else {
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�");	
		}
		
		if(p1.equals(p3)) {
			System.out.println("p1�� p2�� ���� ����Դϴ�");	
		}else {
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�");//
		}
		
	}

}
class Person2{
	private long id;

	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person) {
			return id == ((Person2)obj).id;
		}else {
			return false;
		}
	}

	public Person2(long id) {
		this.id = id;
	}
	
}