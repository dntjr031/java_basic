package com.day10.array;

public class ArrayTest3 {

	public static void main(String[] args) {

		System.out.println("=======변경 전=======");
		int[] score = {83,99,76,95,67,70,88,100,96,73};
		
		for(int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		
		//5점 가산
		System.out.println("=======변경 후=======");
		
		for(int i = 0; i < score.length; i++) {
			
			score[i] += 5;
			
			if(score[i] > 100) score[i] = 100;
			
			System.out.println(score[i]);
		}

	}

}
