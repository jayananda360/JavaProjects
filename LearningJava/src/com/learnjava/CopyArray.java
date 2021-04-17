package com.learnjava;

public class CopyArray {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] source = {'H', 'A', 'P','P','Y','N','E','W','Y','E','A','R'};
		char[]destination = new char[7];
		//copy element from one array to another
		System.arraycopy(source, 0, destination, 1, 5);
		System.out.println(new String(destination));
		//deleting element from array
		int flag = 3;
		//element to be deleted
		for(int i = 0; i < source.length; i++) {
			//delete function
			if(flag == i) {
				for(; i < source.length - 1;) {
					i++;
				}
				System.out.println(source);
			}
		}
	}

}
