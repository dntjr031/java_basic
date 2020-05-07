package com.day26;

public class InnerTest4 {

	public static void main(String[] args) {
		Outer2 o = new Outer2();
		Outer2.InstanceInner ii = o.new InstanceInner();
		ii.method();
	}

}
class Outer2{
	int value = 10;
	
	class InstanceInner{
		int value = 20;
		
		public void method() {
			int value = 30;
			System.out.println("value=" + value);
			System.out.println("this.value=" + this.value);
			System.out.println("Outer.this.value=" + Outer2.this.value);
		}
	}
}
