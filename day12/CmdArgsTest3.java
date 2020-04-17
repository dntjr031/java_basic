package com.day12;

public class CmdArgsTest3 {
	
	public static int more(int a, int b) {
		if(b > a) {
			return b;
		}
		return a;
	}

	public static void main(String[] args) {

		if(args.length < 2) {
			System.out.println("두 수 입력");
			return;
		}
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		
		int result = more(a, b);
		
		System.out.println("더큰수 => " + result);

	}

}
