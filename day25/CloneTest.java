package com.day25;

public class CloneTest {

	public static void main(String[] args) {
		Point original = new Point(3, 5);
		Point copy = original.copy();
		copy.setX(88);
		copy.setY(90);
		
		System.out.println(original);
		System.out.println(copy);
		
		System.out.println(original.hashCode());
		System.out.println(copy.hashCode());
		
		System.out.println(System.identityHashCode(original));
		System.out.println(System.identityHashCode(copy));
	}

}

class Point implements Cloneable{
	int x, y;
	int[] arr = new int[2];

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		arr[0] = x;
		arr[1] = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		return "x="+x+", y=" + y;
	}

	public Point copy() {
		Object obj = null;
		try {
			obj = clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return (Point)obj;
	}
	
	
	
}