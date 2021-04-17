package com.learnjava;
import java.util.Scanner;

public class Array1 {
	void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int arr[][] = new int [row][col];
		for(int i = 0; i < row; i++) {
			System.out.println("Enter your value for the array");
			for(int j = 0; j < col; j++) {
				
			arr[i][j] = sc.nextInt();
			
			System.out.println(arr[i][j]);
				
			}
			
		}
		
		sc.close();
	}
	public static void main(String[] args) {
		Array1 ar = new Array1();
		ar.check();
	}
}
