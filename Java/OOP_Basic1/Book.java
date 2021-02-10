package com.scsa;

public class Book {

	String isbn, title, author, publisher, desc; //default type to access in between the same package
	int price;
	
	
	
	@Override
	public String toString() { //toString method for returning output in String type
		return isbn + " | " + title + " | " + author + " | " + publisher + " | " + price + " | " + desc; 
	}
	
}
