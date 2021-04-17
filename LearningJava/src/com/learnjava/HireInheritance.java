package com.learnjava;

class Vehicle{
	void move() {
		System.out.println("Car is Moving and this is your parent class");
	}
}
	class Bike extends Vehicle{
		void run() {
			System.out.println("This is the child class which is the run method");
		}
}
	class Cars extends Bike{
		void slow() {
			System.out.println("This is slowly moving to the slow method");
		}
	}
class HireInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars c = new Cars();
		c.move();
		c.run();
		c.slow();
	}

}
