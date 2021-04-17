package com.learningjava;

abstract class Mobile {
	Mobile(){
		System.out.println("Mobile is the base class");
	}
	abstract void run();
	
}
class Nokia extends Mobile{
	void run() {
		System.out.println("Nokia is the derivd class");
	}
	void dialNumber() {
		System.out.println("Number are dialled from nokia mobile");
	}
}
public class AbstDemo{
	public static void main(String[] args) {
		Nokia obj = new Nokia();
		obj.run();
		obj.dialNumber();
	}
	
}
