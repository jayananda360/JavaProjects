package com.learningjava;

public class UseSuper {

	String wheels= "Super class";
	}
	class Truck extends UseSuper{
		String wheels = "Child class";
		void printWhile() {
			System.out.println(wheels);
			System.out.println(super.wheels);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck tk = new Truck();
		tk.printWhile();
	}

}
