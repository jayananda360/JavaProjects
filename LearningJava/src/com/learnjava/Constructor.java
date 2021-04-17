package com.learnjava;

public class Constructor {
	int id;
	int salary;
	String company = "ABC";
	
	Constructor(){
		this("Valla");
		System.out.println("This is me!");
	}
	Constructor(String n){
		System.out.println(n);
	}
	//Constructor with parameter
	Constructor(int i, int s){
		id = i;
		salary = s;
		
	}
	void display() {
		System.out.println("Emplyee id-"+id+" Salary is -"+salary+" Company Name - "+company);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor cn = new Constructor();
		System.out.println(cn);
		Constructor con1 = new Constructor(001, 25000);
		Constructor con2 = new Constructor(002, 35000);
		con1.display();
		con2.display();
	}

}
