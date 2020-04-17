package com.day22;

public class FinallyTest2 {
	public static boolean divider(int n1, int n2) {
		try {
			int res = n1/n2;
			System.out.println(n1 + "/" + n2 + "=" + res);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally {
			System.out.println("finally ºÎºÐ");
		}
	}
	public static void main(String[] args) {
		if(divider(10, 2)) {
			System.out.println("³ª´°¼À ¿¬»ê ¼º°ø!\n");
		}else {
			System.out.println("³ª´°¼À ¿¬»ê ½ÇÆÐ!\n");
		}
		
		if(divider(10, 0)) {
			System.out.println("³ª´°¼À ¿¬»ê ¼º°ø!\n");
		}else {
			System.out.println("³ª´°¼À ¿¬»ê ½ÇÆÐ!\n");
		}
	}
}
