package com.learnjava;

public class Encapsulation {
	private String name;
	
	public String getName() {
		System.out.println(name);
		return name;
		
		
	}
	public void setName(String name) {
		
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation enc = new Encapsulation();
		enc.setName("Jaya");
		enc.getName();
	}

}
