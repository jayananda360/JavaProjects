package com.learnjava;

public class AccessModifier {

	Integer instanceVariable;
	static Integer staticVariable = 30;
	
	private synchronized void nonStaticTest() {
		int localVariable = 20;
		instanceVariable = 50;
		System.out.println(instanceVariable);
		System.out.println(localVariable);
		System.out.println("non static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier am = new AccessModifier();
		am.instanceVariable = 40;
		AccessModifier am2 = new AccessModifier();
		am2.instanceVariable = 50;

		am.nonStaticTest();
		StaticMethod st = new StaticMethod();
		st.nonStatic();
		st.staticM();
	}

}
