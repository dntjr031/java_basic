package com.day14;

public class Grade {

	private int kor, eng, math;

	public Grade(int kor, int eng, int math) {
		
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
	
	public int score() {
		return kor + eng + math;
	}
	
	public double grade() {
		return score() / 3.0;
	}
	
	
}
