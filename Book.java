package lab6;

import java.util.LinkedList;

public class Book extends DataObject {
	static LinkedList<DataObject> books = new LinkedList<DataObject>();
	protected String author;
	protected int pages;

	public Book(String author, int pages, String name, int price) {
		this.author = author;
		this.pages = pages;
		this.name = name;
		this.price = price;
	}

	public static void addBook(Book b) {
		books.add(b);
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
}
