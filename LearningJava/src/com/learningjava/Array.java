package com.learningjava;
//Dynamic array format
public class Array {
	private int [] items;
	private int count;
	public Array(int length) {
		items = new int[length];
	}
	public void insert(int item) {
		//if the array is full, we have to resize it
		//Add the new item at the end
		if(items.length == count) {
			int[] newItems = new int[count * 2];
			
			for(int i = 0; i < count; i++)
				newItems[i] = items[i];
			items = newItems;
		}
		items[count++] = item;
	}
	
	public void print() {
		for (int i = 0; i < count; i++)
			System.out.println(items[i]);
	}
}
