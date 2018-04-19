package mybooks.bookstyle;

import mybooks.Book.Book;

public class BookStyle extends Book {
	String style;
	
	public BookStyle(String writerName, String bookName, int yearOfRelease, int price, String style){
		super(writerName, bookName, yearOfRelease, price);
		this.style = style;
	}
	
	public String getStyle(){
		return style;
	}
}
