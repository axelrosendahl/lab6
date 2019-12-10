package lab6;



public class Book extends DataObject{
	protected String author;
	protected int pages;
	public String getAuthor() {
		return author;
	}
	
	public Book(String author, int pages, String name, int price {
		this.author=author;
		this.pages=pages;
		this.name=name;
		this.price=price;
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
