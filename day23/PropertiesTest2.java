package com.day23;

import java.io.*; 
import java.util.*; 

class PropertiesEx2{ 
	public static void main(String[] args) {
		
		
		Properties prop = new Properties();
		
		try {
			//public FileInputStream(String name) throws FileNotFoundException
			prop.load(new FileInputStream("text/input.txt")); 
			//public void load(InputStream inStream) throws IOException
			//=> 파일로부터 데이터를 읽어서 Properties 컬렉션에 저장
			
			/*
			pro.setProperty("name", "Hong gil dong ");
			pro.setProperty("data", "9,3,6,29,3,7,6,11");
			 */
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) { 
			e.printStackTrace();
		}
		
		String name = prop.getProperty("name"); 
		String[] data = prop.getProperty("data").split(","); 
		int max = 0; 
		int min = 0; 
		int sum = 0; 

		for(int i=0; i < data.length; i++) { 
			int intValue = Integer.parseInt(data[i]); 
			if (i==0) max = min = intValue;
			
			if (max < intValue) { 
				max = intValue; 
			} else if (min > intValue) {
				min = intValue; 
			}
			
			sum += intValue;
		}
			
		double avg = (double)sum/data.length;
		
		System.out.println("이름 :" + name); 
		System.out.println("최대값 :" + max); 
		System.out.println("최소값 :" + min); 
		System.out.println("합계 :" + sum); 
		System.out.println("평균 :" + Math.round(avg*100)/100.0); 
	}
}
