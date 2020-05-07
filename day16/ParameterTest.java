package com.day16;

class Data{
	int x;
}

public class ParameterTest {

	public static void main(String[] args) {
		Data d = new Data();
		System.out.println("======기본형 매개변수======");
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	
		System.out.println("\n======참조형 매개변수======");
		d.x = 20;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
		
		System.out.println("\n======참조형(배열) 매개변수======");
		int[] x = {30};
		System.out.println("main() : x[0] = " + x[0]);
		
		change(x);
		System.out.println("After change(x)");
		System.out.println("main() : x[0] = " + x[0]);
		
	}
	
	public static void change(int x) { 
		// 기본형 매개변수, call by value
		// - 변수의 값을 읽기만 할 수 있다. (read only)
		// - 메서드에서 매개변수의 값을 변경해도 호출한 곳에서는 변경의 영향을 받지 않는다.
		x = 1000;
		System.out.println("change() : x = " + x);
	}
	
	public static void change(Data d) {
		// 참조형 매개변수, call by reference
		// - 변수의 값을 읽고 변경할 수 있다.
		d.x = 2000;
		System.out.println("change() : x = " + d.x);
	}
	
	public static void change(int[] x) {
		// 참조형 매개변수, call by reference
		// - 변수의 값을 읽고 변경할 수 있다.
		x[0]= 3000;
		System.out.println("change() : x[0] = " + x[0]);
	}

}
