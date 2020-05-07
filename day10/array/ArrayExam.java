package com.day10.array;

import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		//[1]
		float[] farr ;
		farr = new float[3];
		farr[0] = 12.5f;
		farr[1] = -24.3f;
		farr[2] = 0.76f;
		//[2]
		float[] farr2 = new float[3];
		farr2[0] = 34.1f;
		farr2[1] = 43.2f;
		farr2[2] = 8.1f;
		
		for(int i = 0; i < farr.length; i++) {
			System.out.println("farr[" + i + "] = " + farr[i]);
		}
		
		for(int i = 0; i < farr.length; i++) {
			System.out.println("farr2[" + i + "] = " + farr2[i]);
		}

		System.out.println("====================");
		
		
		Scanner sc = new Scanner(System.in);
		
		double[] d = new double[4];
		System.out.println("실수 4개입력");
		for(int i = 0; i < d.length; i++) {
			d[i] = sc.nextDouble();
		}
		
		double total = 0;
		for(int i = 0; i < d.length; i++) {
			total += d[i];
		}
		
		double anerage = total /4;
		
		System.out.println("총점: " + total + ", 평균: " + anerage);
		
		sc.close();
	}

}
