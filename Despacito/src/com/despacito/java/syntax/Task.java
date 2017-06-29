package com.despacito.java.syntax;

public class Task {
	//A constructor has the same name as the class.
	//It should not return a value, not even void.
	int a;
	int b;
	
	public Task() {
		a = 2;
		b = 4;
		System.out.println("This is a constructor.");
	}
	
	public void show() {
		System.out.println("The value of a: " + a);
		System.out.println("The value of b: " + b);
	}
}
