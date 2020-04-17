package com.day16;

class Data{
	int x;
}

public class ParameterTest {

	public static void main(String[] args) {
		Data d = new Data();
		System.out.println("======�⺻�� �Ű�����======");
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	
		System.out.println("\n======������ �Ű�����======");
		d.x = 20;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
		
		System.out.println("\n======������(�迭) �Ű�����======");
		int[] x = {30};
		System.out.println("main() : x[0] = " + x[0]);
		
		change(x);
		System.out.println("After change(x)");
		System.out.println("main() : x[0] = " + x[0]);
		
	}
	
	public static void change(int x) { 
		// �⺻�� �Ű�����, call by value
		// - ������ ���� �б⸸ �� �� �ִ�. (read only)
		// - �޼��忡�� �Ű������� ���� �����ص� ȣ���� �������� ������ ������ ���� �ʴ´�.
		x = 1000;
		System.out.println("change() : x = " + x);
	}
	
	public static void change(Data d) {
		// ������ �Ű�����, call by reference
		// - ������ ���� �а� ������ �� �ִ�.
		d.x = 2000;
		System.out.println("change() : x = " + d.x);
	}
	
	public static void change(int[] x) {
		// ������ �Ű�����, call by reference
		// - ������ ���� �а� ������ �� �ִ�.
		x[0]= 3000;
		System.out.println("change() : x[0] = " + x[0]);
	}

}
