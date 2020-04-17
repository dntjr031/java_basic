package com.day9;

import java.io.IOException;
import java.util.Scanner;

public class MathodExam5 {
	
	public static int convToint(char ch) {
		int result = ch - '0';
		return result;
	}
	
	public static void aB(int i) {
		for(int k = 0; k < i; k++) {
			for(int j = 0; j < k; j++) {
				System.out.print("A");
			}
			System.out.println("B");
		}
	}

	public static void main(String[] args)throws IOException {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("0~9사이의 숫자를 입력하세요");
		char num = (char)System.in.read();
		
		int result = convToint(num);

		System.out.println(num + " => " + result);
		System.out.println(result + "*" + 100 + "=" + result * 100);
		
		System.out.println("\n===================\n");
		
		System.out.print("반복횟수를 입력하세요 : ");
		int count = sc.nextInt();
		
		aB(count);
		
		sc.close();

	}

}
