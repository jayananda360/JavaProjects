package StringOperation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaPrint {
	
	public void list() {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("New cycle");
		ll.add("New Car");
		ll.add("New Bike");
		System.out.println(ll);
	}
	public void lists() {
		List<Integer> li = new ArrayList<>();
		li.add(12);
		li.add(13);
		li.add(14);
		
		System.out.println(li);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaPrint jp = new JavaPrint();
		jp.list();
		jp.lists();
	}

}
