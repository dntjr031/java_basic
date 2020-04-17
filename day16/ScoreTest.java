package com.day16;

import java.util.Scanner;

class Score{
	private int[] subject;

	public Score(int[] subject) {
		this.subject = subject;
	}

	public int[] getSubject() {
		return subject;
	}

	public void setSubject(int[] subject) {
		this.subject = subject;
	}
	
	public int calcTotal() {
		int sum =0;
		for (int i = 0; i < subject.length; i++) {
			sum += subject[i];
		}
		return sum;
	}
	
	public double calcAverage() {
		int sum = calcTotal();
		double avg = (double)sum / subject.length;
		
		return avg;
	}
}

public class ScoreTest {

	public static void main(String[] args) {
		int[] subject = {70,60,50};
		Score score = new Score(subject);
		int a = score.calcTotal();
		double b = score.calcAverage();
		System.out.println("총합 : " + a + ", 평균 : " + b);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국영수를 입력하세요");
		for (int i = 0; i < subject.length; i++) {
			subject[i] = sc.nextInt();
		}
		
		a = score.calcTotal();
		b = score.calcAverage();
		
		System.out.println("변경된 과목");
		int[] subject1 = score.getSubject();
		for(int n : subject1) {
			System.out.println(n + "\t");
		}
		
		System.out.println("\n\n총점 : " + a + ", 평균 : " + b);
		
		sc.close();
	}

}
