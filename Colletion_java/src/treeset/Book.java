package treeset;

public class Book implements Comparable<Book> {

	private int bookId;
	private String bookTitle;
	private double bookPrice;

	
	/**
	 * @param bookId
	 * @param bookTitle
	 * @param bookPrice
	 */
	public Book(int bookId, String bookTitle, double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "[ Book Id : " + bookId + "Book Title : " + bookTitle + "Book Price : " + bookPrice + "]";
	}

	@Override
	public int hashCode() {
		return bookId + bookTitle.hashCode() + Double.valueOf(bookPrice).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Book b = (Book) obj;
		if (this.bookId != b.bookId)
			return false;
		if (this.bookPrice != b.bookPrice)
			return false;
		if (!this.bookTitle.equalsIgnoreCase(b.bookTitle))
			return false;
		return true;

	}

	@Override
	public int compareTo(Book o) {
		return this.hashCode() - o.hashCode();
	}

}
