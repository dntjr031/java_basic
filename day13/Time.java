package com.day13;

public class Time {

	int hour, min, sec;

	public Time(int hour, int min, int sec) {
		
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	
	public Time(int hour, int min) {
		
		this.hour = hour;
		this.min = min;
		
	}
	
	public Time(int hour) {
	
		this.hour = hour;

	}
	
	public void print() {
		System.out.println(hour + "시\t" + min + "분\t" + sec + "초");
	}
	
	public int toSec() {
		return hour*60*60 + min*60 + sec;
	}
	
}
