package com.day12;

public class Array2Test2 {

	public static void main(String[] args) {

		System.out.println("=====[1]=====");
		
		String[] season = new String[4];
		season[0] = "봄";
		season[1] = "여름";
		season[2] = "가을";
		season[3] = "겨울";
		
		for(int i = 0; i < season.length; i++) {
			System.out.println("season[" + i + "]=" + season[i]);
		}
		
		System.out.println("\n=====[2]=====");
		
		double[][] dArr = new double[3][2];
		dArr[0][0] = 10.1;
		dArr[0][1] = 10.2;
		dArr[1][0] = 10.3;
		dArr[1][1] = 10.4;	
		dArr[2][0] = 10.5;
		dArr[2][1] = 10.6;
		
		double[][] dArr2 = {{1,2},{3,4},{5,6}};
		
		double[][] dArr4 = new double[3][2];
		int sum = 10;
		for (int i = 0; i < dArr4.length; i++) {
			for (int j = 0; j < dArr4[i].length; j++) {
				dArr4[i][j] = sum;
				sum += 10;
			}
		}
		
		for(int i = 0; i < dArr.length; i++) {
			for(int k = 0; k < dArr[i].length; k++) {
				System.out.println("dArr[" + i + "][" + k + "]=" + dArr[i][k]);
			}
		}
		System.out.println();
		
		for (int i = 0; i < dArr2.length; i++) {
			for (int j = 0; j < dArr2[i].length; j++) {
				System.out.println("dArr2[" + i + "][" + j + "]=" + dArr2[i][j]);
			}
		}
		System.out.println();
		
		for (int i = 0; i < dArr4.length; i++) {
			for (int j = 0; j < dArr4[i].length; j++) {
				System.out.println("dArr4[" + i + "][" + j + "]=" + dArr4[i][j]);
			}
		}
		
		System.out.println("\n=====[3]=====");
		
		double[] dArr3 = new double[dArr.length*dArr[0].length];
		
		for(int i = 0; i < dArr.length; i++) {
			for(int k = 0; k < dArr[i].length; k++) {
				dArr3[i*dArr[i].length + k] = dArr[i][k];
			}
		}
		
		for(double n : dArr3) {
			System.out.print(n + "\t");
		}

	}

}
