package com.learnjava;

public class StaticMethod {

	 void nonStatic() {
		System.out.println("Non Static Method");
	}
	public void staticM() {
		System.out.println("Static Method");
	}
	public static void main(String[] args) {
		//staticM();// static method we can call directly inside the main method
		StaticMethod md = new StaticMethod();// created a object
		md.nonStatic();// we can't call non static method directly
	}
}
