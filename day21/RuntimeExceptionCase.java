package com.day21;

public class RuntimeExceptionCase {

	public static void main(String[] args) {
		try {
			int[] arr = new int[3];
			arr[3] = 10; //����
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���ܹ߻� : " + e);
		}
		
		try {
			Object obj = new int[3];
			String s = (String)obj;
			System.out.println(s);
		}catch(ClassCastException e) {
			System.out.println("���ܹ߻� : " + e.getMessage());
		}
		
		try {
			//String s = null;
			//int n = s.length();
			
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		try {
		//	int[] arr = new int[-4];
		}catch(NegativeArraySizeException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n====next====");
	}

}
