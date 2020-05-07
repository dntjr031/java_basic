package com.day22.collection;

import java.util.ArrayList;

public class ProductTest {

	public static void main(String[] args) {
		ArrayList<Product> pArr = new ArrayList<Product>();
		pArr.add(new Product("A010", "TV", 150));
		pArr.add(new Product("A021", "Computer", 100));
		pArr.add(new Product("A034", "Radio", 50));
		
		for (int i = 0; i < pArr.size(); i++) {
			System.out.println(pArr.get(i));
		}

	}

}

class Product{
	private String code, pdName;
	private int price;
	
	public Product(String code, String pdName, int price) {
		this.code = code;
		this.pdName = pdName;
		this.price = price;
	}
	
	public String toString() {
		return "Product [code=" + code + ", pdName=" + pdName + ", price=" + price + "]";
	}
}
