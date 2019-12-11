package lab6;

import java.util.LinkedList;

public class Movie extends DataObject {
	static LinkedList<DataObject> movies =new LinkedList<DataObject>();
	protected String director;
	protected int length;

	public Movie(String director, int length, String name, int price) {
		super();
		this.director = director;
		this.length = length;
		this.name = name;
		this.price = price;
	}
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void addMovie(Movie m) {
		movies.add(m);
	}

	

}