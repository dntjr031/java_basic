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
			//=> ���Ϸκ��� �����͸� �о Properties �÷��ǿ� ����
			
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
		
		System.out.println("�̸� :" + name); 
		System.out.println("�ִ밪 :" + max); 
		System.out.println("�ּҰ� :" + min); 
		System.out.println("�հ� :" + sum); 
		System.out.println("��� :" + Math.round(avg*100)/100.0); 
	}
}
