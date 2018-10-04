package packageTest.testing;

import java.util.ArrayList;
import java.util.ListIterator;

class Book{
	int id;
	String Name;
	String Author;
	String Publisher;
	int Quantity;
	
	public Book(int id, String Name, String Author, String Publisher, int Quantity) {
		this.id =id;
		this.Name = Name;
		this.Author = Author;
		this.Publisher = Publisher;
		this.Quantity = Quantity;
	}
	
}

public class ListIteratorInterface {

	public static void main(String[] args) {
		ArrayList<Book> li = new ArrayList<Book>();
		Book b1 = new Book(101,"ASDF","A", "AP1", 5);
		Book b2 = new Book(102, "zxcv", "B", "AP2", 6);
		Book b3 = new Book(103, "qwer","C", "AP3", 3);
		
		li.add(b1);
		li.add(b2);
		li.add(b3);
		
		for(Book b:li) {
			System.out.println("ID:: "+b.id +" Name:: "+b.Name+" Author :: "+b.Author+" Publisher :: "+b.Publisher+" Quantiy :: "+b.Quantity);
		}
		
		ListIterator<Book> Litr = li.listIterator();
		System.out.println("Litr ::: "+Litr.hashCode());
		
		while(Litr.hasNext()) {
			System.out.println("Next :: "+Litr.next().toString());
		}
		while(Litr.hasPrevious()) {
			System.out.println("Previous :: "+Litr.previous().toString());
		}
	}
}