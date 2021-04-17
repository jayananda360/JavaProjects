package com.learningjava;

import java.util.Scanner;

public class ReciprocalLatter {
	
	static void reciprocalString(String word) {
		char ch;
		for(int i = 0; i < word.length(); i++) {
			ch = word.charAt(i);
			if(Character.isLetter(ch)) {
				if(Character.isLowerCase(ch)) {
					ch = (char)(122 -(int)(ch) + 97);
				}
				if(Character.isUpperCase(ch)) {
					ch = (char)(90 - (int)(ch) + 65);
				}
			}
			System.out.print(ch);	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your letter :");
		String st = sc.next();
		System.out.println("Your reciprocal of "+st+" is "+"");
		reciprocalString(st);
		sc.close();
	}

}
