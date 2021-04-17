package com.learningjava;

import java.util.Scanner;
public class Deeps {
	
		public static void legal() {
		int [] str = new int[] {1, 2, 3, 4};
		System.out.print("Original Array is :");
		for(int i = 0; i<str.length; i++) {
			System.out.print(+str[i]+", ");		
		}
		System.out.println();
		System.out.print("The reversal array is :");
		for(int i = str.length-1; i>=0; i--) {
			System.out.print(+str[i]+", ");
			}
		}
		public static void root() {
			Scanner sc = new Scanner(System.in);
	        System.out.print("");
	        int len = sc.nextInt(); 
	        int [] input = new int[len];
	        for(int i = 0; i<len; i++){
	        System.out.print("");
	        input[i]= sc.nextInt();
	        }
	        sc.close();
		}
			
		public static void main(String[] args) {
			root();
	}

}
