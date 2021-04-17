package com.learningjava;

class Run{
	
}

public class Abstract {

	public Abstract(int Id, String Name, long phno) {
		int id = Id;
		String name = Name;
		long ph_no = phno;
		System.out.println("Your Id is -"+id+"\nYour Name -"+name+"\nYour Phone Number -"+ph_no);
	}
	void demo(int id, String name, long phno) {
		int a = id;
		String b = name;
		long c= phno;
		System.out.println(a+"\n"+b+"\n"+c);
	}
	
	public static void main(String[] args) {
		//if the the parameter shows out of range then just write l/L after the number
		Abstract ab = new Abstract(1,"jayananda",9178057071l);
		ab.demo(1, "jayananda", 9178057071l);
		
	}
}
