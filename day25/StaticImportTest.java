package com.day25;

/*
 static import �� ���
 - static ����� ȣ���� �� Ŭ�������� ������ �� ����
 - JDK 5.0�� �߰���
 */
import static java.lang.System.out;
import static java.lang.Math.random;
import static java.lang.Math.PI;
//import static java.lang.Math.*;

public class StaticImportTest {

	public static void main(String[] args) {
		//System.out.println(Math.random());
		out.println(random());
		
		//System.out.println("Math.PI : " + Math.PI);
		out.println("Math.PI : " + PI);
	}

}
