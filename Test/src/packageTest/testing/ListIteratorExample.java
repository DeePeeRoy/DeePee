package packageTest.testing;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		System.out.println("Initial Data Display Here:: "+al.get(2));
		System.out.println("Initial Data Display Here: 2 : "+al.get(4));
		
		ListIterator<String> Litr = al.listIterator();
		System.out.println("Taverse Here :: "+Litr);
		
		while(Litr.hasNext()) {
			System.out.println("ListIterator hasNext Display ::  " +Litr.next());
			System.out.println("ListIterator hasNext Display :A:  " +Litr.hasNext());
		}
		while(Litr.hasPrevious()) {
			System.out.println("ListIterator hasPrevious Display :: "+Litr.previous());
		}
		
	}
}
