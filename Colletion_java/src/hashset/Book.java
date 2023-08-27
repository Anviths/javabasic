package hashset;

public class Book {

	private String name;
	private String author;

	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Book b = (Book) obj;
		return this.name.equals(b.name);
	}

	@Override
	public String toString() {
		return "name=" + name + ", author=" + author + "]";
	}
	
	
}
