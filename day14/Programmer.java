package com.day14;

public class Programmer {

	private String name, language;
	private int career;
	
	public Programmer(String name, String language, int career) {
		this.name = name;
		this.language = language;
		this.career = career;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	

	public int getCareer() {
		return career;
	}

	public void setCareer(int career) {
		this.career = career;
	}
	
	public void work() {
		System.out.println("프로그래밍을 합니다.");
	}
	
	
}
