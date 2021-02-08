package com.scsa;

public class Book {

	String isbn, title, author, publisher, desc; //default type to access in between the same package
	int price;
	
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
