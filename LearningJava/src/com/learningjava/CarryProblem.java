package com.learningjava;

public class CarryProblem {
	
	static void carry(long x, long y) {
		
		int carry = 0;
		int count = 0;
		
		while((x != 0) || (y != 0)) {
			
			long p = x % 10;
			long q = y % 10;
			long n = p + q + carry;
			if(n > 9) {
				carry = 1;
				count ++;
			}else {
				carry = 0;
			}
			x = x/10;
			y = y/10;
		}
			System.out.println("Your Carry is: "+count);
	}
	static void fibonacci(int x) {
		int a = 0;
		int b = 1;
		System.out.print(a+" "+b+" ");
		for(int i = 2; x > i; i++) {
		int c = a + b;
		a = b;
		b = c;
		System.out.print(c+" ");
		}
	}
	static void palindrome(int n) {
		int x, temp, sum = 0;
		temp = n;
		while(n > 0) {
			x = n % 10;//find reminder
			sum = (sum * 10) + x;
			n = n / 10;
		}
		if(sum == temp) {
			System.out.println("This is palindrome");
		}else {
			System.out.println("This is not a Palindrome");
		}
	}
	static void prime(int n) {
		@SuppressWarnings("unused")
		boolean flag = false;
		int m = n/2;
		if(n == 0 || n == 1) {
			System.out.println("Not Prime");
		}else {
			for(int i = 2; m > i; i++) {
				if(n % 2 == 0) {
					System.out.println("Not Prime");
					flag = true;
					break;
				}
			}
		}if(flag = true) {
			System.out.println("Prime");
		}
	}
	static void factorial(int n) {
		int a = 1;
		for(int i = 1; n >= i; i++) {
			a = a *i;
		}
		System.out.println("Factorial is: "+a);
	}
	static void amstrong(int n) {
		int temp = n, c = 0, a;
		while(n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);
		}
			if(c == temp) {
				System.out.println("The number is amstrong");
			}else {
				System.out.println("Not amstrong");
			}
	}
	static void asciiValue() {
		int a = 'a';
		int a1 = 'z';
		int b = 'A';
		int b1 = 'Z';
		System.out.println(a);
		System.out.println(a1);
		System.out.println(b);
		System.out.println(b1);
	}
	static void copyArray() {
		int arr1[] = new int[] {1, 2, 3, 4, 5};
		int arr2[] = new int[arr1.length];
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
			System.out.print(arr2[i]+" ");
		
		}
	}
	static void arrayRotate() {
		int n = 3;
		int arr[] = new int [] {1, 2, 3, 4, 5, 6};
		
		System.out.println("Original Array");
		for(int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int j = 0; j <= n; j++) {
			int ar[] = new int [arr.length];
			
			System.out.print(ar[j]+" ");
			
		}
	}
	public static void main(String[] args) {
		
		//carry(999999, 9999999);
		//fibonacci(10);
		//palindrome(232);
		prime(5);
		////factorial(3);
		//amstrong(371);
		//asciiValue();
		//copyArray();
		//arrayRotate();
		
	}
}