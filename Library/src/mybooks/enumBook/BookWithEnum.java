package mybooks.enumBook;

import mybooks.Book.Book;

public class BookWithEnum extends Book{
	
	public enum Style{ //osztály definíció, ez egy beágyazott osztály
		SCIFI, ROMANCE, COOK, OTHER;
	}

	Style style;
	
	public BookWithEnum(String writerName, String bookName, int yearOfRelease,
			int price, Style style) {
		super(writerName, bookName, yearOfRelease, price);
		this.style = style;
	}

	@Override
	public String toString() {
		return "BookWithEnum style=" + style + ", "
				+ super.toString();
	}

	public Style getStyle() {
		return style;
	}
	
}
