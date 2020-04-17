package com.day25;

public class HashCodeTest {

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		String s3 = "abc";
		String s4 = "abc";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		/*
		 String Ŭ������ ���ڿ��� ������ ������,
		 ������ �ؽ��ڵ带 ��ȯ�ϵ��� hashCode �޼��带 �������̵� �Ͽ���.
		 
		 System.identityHashCode(Object x)
		 - Object Ŭ������ hashCode �޼���ó�� ��ü�� �ּҰ����� �ؽ��ڵ带 ����
		 => ��� ��ü�� ���� �׻� �ٸ� �ؽ��ڵ尪�� ��ȯ��
		 */
		
		int hcode = System.identityHashCode(s1);
		System.out.println("s1 �ּҰ�" + hcode);
		System.out.println("s2 �ּҰ�" +System.identityHashCode(s2));
		System.out.println("s3 �ּҰ�" +System.identityHashCode(s3));
		System.out.println("s4 �ּҰ�" +System.identityHashCode(s4));
		
		Integer n1 = 123, n2 = 300;
		System.out.println("n1 �ؽ��ڵ� : " + n1.hashCode());
		System.out.println("n2 �ؽ��ڵ� : " + n2.hashCode());
		System.out.println("n1 �ּҰ� : " + System.identityHashCode(n1));
		System.out.println("n2 �ּҰ� : " + System.identityHashCode(n2));
		
		Person3 p1 = new Person3();
		Person3 p2 = new Person3();
		System.out.println("p1 �ؽ��ڵ� : " + p1.hashCode());
		System.out.println("p2 �ؽ��ڵ� : " + p2.hashCode());
		System.out.println("p1 �ּҰ� : " + System.identityHashCode(p1));
		System.out.println("p2 �ּҰ� : " + System.identityHashCode(p2));
	}

}
class Person3{}