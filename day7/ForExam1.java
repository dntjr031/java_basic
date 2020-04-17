package com.day7;

public class ForExam1 {

	public static void main(String[] args) {
		
		System.out.println("====int a~z====");
		
		for(int a = 97; a <= 122; a++) {
			System.out.print((char)a);
			if(a < 122) 
				System.out.print(", ");
		}
		
		System.out.println("\n\n====char a~z====");
		
		for(char b = 'a'; b <= 'z'; b++) {
			System.out.print(b);
			if(b < 'z') 
				System.out.print(", ");
		}
		System.out.println("\n\n====변수설정====");
		
		char lower = 'a';
		for(int i = 1; i <= 26; i++) {
			System.out.print(lower++);
			if(i < 26)	System.out.print(", ");
		}
		

	}

}
