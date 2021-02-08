package com.scsa;

public class Magazine {

	private String isbn, title, author, publisher, desc; //private type for encapsulation
	private int year, month, price;
	
	

	public Magazine (String isbn, String title, String author, String publisher, int price, String desc, int year, int month) {  //Magazine method for taking all private type variables
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
		this.year = year;
		this.month = month;
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



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public int getMonth() {
		return month;
	}



	public void setMonth(int month) {
		this.month = month;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public String toString() { //toString method for returning output in String type
		return isbn + " | " + title + " | " + author + " | " + publisher + " | " + price + " | " + desc + " | " + year + "." + month; 
	}
	
}
