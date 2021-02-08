package com.scsa;

public class BookTest {

	public static void main(String[] args) {

		Book b1 = new Book();
		Book b2 = new Book();
		Magazine m = new Magazine();
		
		b1.setIsbn("21424");
		b1.setTitle("Java Pro");
		b1.setAuthor("김하나");
		b1.setPublisher("Jaen.kr");
		b1.setPrice(15000);
		b1.setDesc("기본문법");
		
		b2.setIsbn("35355");
		b2.setTitle("OOAD 분석,설계");
		b2.setAuthor("소나무");
		b2.setPublisher("Jaen.kr");
		b2.setPrice(30000);
		b2.setDesc("");
	
		m.setIsbn("35535");
		m.setTitle("Java World");
		m.setAuthor("편집부");
		m.setPublisher("androidjava.com");
		m.setPrice(7000);
		m.setYear(2013);
		m.setMonth(2);
		m.setDesc("");
		
		System.out.println("************************도서목록*****************************");
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(m.toString());
	}

}
