package com.day16;

import com.test2.Child;

public class ProtectedTest {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.showInfo();
		ch.addr = "논현동";
		ch.showInfo();

	}

}
