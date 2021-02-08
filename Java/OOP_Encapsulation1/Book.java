package com.scsa;

public class Book {

	private String isbn, title, author, publisher, desc; //private type for encapsulation
	private int price;
	
	public Book (String isbn, String title, String author, String publisher, int price, String desc) { //Book method for taking all private type variables
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
	}
	
	public String getIsbn() { //getters and setters methods
		return isbn;
	}



	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public String getPublisher() {
		return publisher;
	}



	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}



	public String getDesc() {
		return desc;
	}



	public void setDesc(String desc) {
		this.desc = desc;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public String toString() { //toString method for returning output in String type
		return isbn + " | " + title + " | " + author + " | " + publisher + " | " + price + " | " + desc; 
	}
	
}
