package com.learnjava;

public class Operator {
	
	static void shiftOperator() {
		int a= 20;
		int b = (a<<2);
		float c = (a>>4);
		System.out.println(b+" "+c);
		
	}
	static void ternaryOperator() {
		int a =5;
		int b = 6;
		// if the condition is true then it will print 100, if false then 200 will printed
		int ter = a<b ? 100:200;
		System.out.println(ter);
	}
	static void parsDatatype() {
		String s1= "50";
		String s2= "55";
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		int result = num1 + num2;
		System.out.println(result);
		}
	static void stringConversion() {
		int a1 = 55;
		String num = Integer.toString(a1);
		//or
		String num1 = String.valueOf(a1);
		System.out.println(num + " "+ num1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shiftOperator();
		ternaryOperator();
		parsDatatype();
		stringConversion();
	}

}
