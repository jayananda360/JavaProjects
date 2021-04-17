package com.learnjava;

public class StringConcat {
	public void stringCon() {
		String s1 = "Happy";
		String s2 = "Happy";
		System.out.println(s2.replace("a", "p"));
		System.out.println(s2);
		System.out.println("Concatination: "+s1);
		System.out.println("concatination data: "+s1.concat("Learning"));
		System.out.println(s1.substring(1));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.compareTo(s2));
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringConcat sc = new StringConcat();
		sc.stringCon();
	}

}
