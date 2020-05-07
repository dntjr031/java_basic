package com.day14;

import java.util.Scanner;

class Score2{
	//1. 멤버변수
	//입력값에 해당하는 멤버변수
	private int kor, eng, math;
	
	//결과값에 해당하는 멤버변수
	private int sum;
	private float average;

	public Score2(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public float getAverage() {
		return average;
	}

	public void setAverage(float average) {
		this.average = average;
	}
	
	//총점, 평균을 구하는 메서드
	public void sum() {
		sum = kor + eng + math;
	}
	
	public void score() {
		sum();
		average = sum / 3f;
	}
	
}

public class ScoreExam2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수를 입력하세요");
		int k = sc.nextInt();
		int e = sc.nextInt();
		int m = sc.nextInt();
		
		Score2 g = new Score2(k, e, m);
		
		g.score();
		g.sum();
		
		System.out.println("총점 : " + g.getSum() + ", 평균 = " + g.getAverage());
		
		sc.close();

	}

}
