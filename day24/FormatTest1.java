package com.day24;

import java.text.DecimalFormat;

public class FormatTest1 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.##");
		double d = 1234567.89512;
		
		//public final String format(double number)
		//숫자 => 형식화한 문자열
		String s = df.format(d);
		System.out.println("#,###.## => "+s);
		
		DecimalFormat df2 = new DecimalFormat("#,###.00");
		
		s = df2.format(d);
		System.out.println("#,###.00 => " + s);
		
		d = 123456.723;
		DecimalFormat df3 = new DecimalFormat("#,###");
		s = df3.format(d);
		System.out.println("#,### => " + s);
		
	}

}
