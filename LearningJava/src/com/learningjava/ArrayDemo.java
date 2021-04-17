package com.learningjava;

public class ArrayDemo {
	
	void simpleArray() {
		int[] array = {10, 20, 30, 40};
		System.out.println(array[3]);
	}
	void modArray(int number) {
		int[] array = new int[number];
		System.out.println(array.length);
		System.out.println(array);
	}
	public static void main(String[] args) {
		Array num = new Array(3);
		num.insert(10);
		num.insert(20);
		num.insert(30);
		num.insert(40);
		num.insert(50);
		num.insert(60);
		num.print();
	}

}
