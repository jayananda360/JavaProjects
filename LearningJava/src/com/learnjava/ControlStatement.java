package com.learnjava;

public class ControlStatement {
	public int b = 30;
	
	static void breakStatement() {
		int a = 10;
		for(int i = 1; a > i; i++) {
			if(i == 7) {
				System.out.println("Loop Breaked");
				break;
			
			}
			System.out.println(i);
		}
		
	}
	static void doWhile() {
		int a = 5;
		
		do {
			System.out.println(a);
			
			a--;
		}while(a>=0);
		System.out.println("----");
	}
	static void forLoop() {
		
		for(int i = 0 ; i <=5 ; i++) {
			System.out.println(i);
		}
		
		System.out.println("----");
	}
	static void ifLoop(int i) {
		for( ; i <= 10; i++) {
			if(i == 6) {
				break;
			}
			System.out.println(i);
		}
		
	}
	public int parameter(Integer a, Integer b) {
		a = 10;
		int result = a + b;
		System.out.println("the result is : "+result);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControlStatement cs = new ControlStatement();
		int a = 50;
		int b = 60;
		breakStatement();
		//ifLoop(0);
		//doWhile();
		//forLoop();
		int rel = cs.parameter(a,b);
		System.out.println(rel);
		
	}

}
