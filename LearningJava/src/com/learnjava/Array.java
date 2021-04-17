package com.learnjava;
import java.util.Scanner;
public class Array {
	public int arrayInitializer() {
		int a[] = {5, 6, 4, 9, 8};
		a[3] = 30;
		System.out.println(a[3]);
		System.out.println("Array length : "+ a.length);
		return 0;
	}
	public void newOperator() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your the length of array :");
		int length = sc.nextInt();
		int[]array = new int [length];
		
		for(int i = 0; i < length;i++) {
			System.out.println("Enter your number for array:"+ i);
			array[i] =sc.nextInt(); 
		}
		System.out.println("Display : "+array[3]);
	sc.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array arr = new Array();
		//arr.arrayInitializer();
		arr.newOperator();
		
	}

}
