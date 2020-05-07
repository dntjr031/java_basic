package com.day25;

public class EqualsTset2 {

	public static void main(String[] args) {
		Person2 p1 = new Person2(9901971234567l);
		Person2 p2 = new Person2(9901971234567l);
		Person2 p3 = new Person2(9801971235564l);
		
		if(p1 == p2) {
			System.out.println("p1과 p2는 같은 주소입니다");
		}else {
			System.out.println("p1과 p2는 다른 주소입니다");//
		}
		if(p1.equals(p2)) { //오버라이딩 메서드 호출
			System.out.println("p1과 p2는 같은 사람입니다");//
		}else {
			System.out.println("p1과 p2는 다른 사람입니다");	
		}
		
		if(p1.equals(p3)) {
			System.out.println("p1과 p2는 같은 사람입니다");	
		}else {
			System.out.println("p1과 p2는 다른 사람입니다");//
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
