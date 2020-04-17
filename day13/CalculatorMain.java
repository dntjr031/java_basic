package com.day13;

import java.util.Scanner;

class Calculator {

	public double plus(double a, double b) {
		double c = a + b;
		return c;
	}
	
	public double minus(double a, double b) {
		double c = a - b;
		return c;
	}
	
	public double multiply(double a, double b) {
		double c = a * b;
		return c;
	}
	
	public double dicide(double a, double b) {
		double c = a / b;
		return c;
	}
	
	
}


public class CalculatorMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 실수를 입력하세요");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		Calculator cal = new Calculator();
		
		double plus = cal.plus(a, b);
		double minus = cal.minus(a, b);
		double multi = cal.multiply(a, b);
		double div = cal.dicide(a, b);
		
		System.out.println(plus + ", " + minus + ", " + multi + ", " + div);
		
				
		sc.close();

	}

}
