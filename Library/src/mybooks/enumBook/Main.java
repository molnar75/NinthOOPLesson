package mybooks.enumBook;

import java.util.Scanner;

import mybooks.Book.Book;
import mybooks.enumBook.BookWithEnum.Style;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please give the number of books: ");
		int arrayLength = scanner.nextInt();
		
		BookWithEnum[] booksArray = new BookWithEnum[arrayLength];
		
		for(int i=0; i < arrayLength; i++){
			booksArray[i] = new BookWithEnum("Sajt", "Ementali", 1998, (1200+i*1000), Style.SCIFI);
		}
		
		displayBookArrayData(booksArray);
		BookWithEnum[] booksScifi = getBookWithStyle(Style.SCIFI, booksArray);
		for(int i=0; i< booksScifi.length; i++){
			System.out.println(booksScifi[i]);
		}

	}
	
	public static void displayBookArrayData(Book[] books){
		for (Book book : books) {
			System.out.println(book);
		}
	}
	
	public static BookWithEnum[] getBookWithStyle(Style style, BookWithEnum[] books){
		BookWithEnum[] tempEnumBooks= new BookWithEnum[books.length];
		int counter = 0;
		
		for (BookWithEnum bookWithEnum : books) {
			if(bookWithEnum.getStyle()==style){
				tempEnumBooks[counter]=bookWithEnum;
				counter++;
			}
		}
		
		BookWithEnum[] enumBooks = new BookWithEnum[counter];
		
		for (int i = 0; i < counter; i++) {
			enumBooks[i] = tempEnumBooks[i];
		}
		
		return enumBooks;
	}

}
