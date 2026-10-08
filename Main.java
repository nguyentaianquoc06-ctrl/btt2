package Equal;

class Book {
	private String title;
	private String author;
	private double price;

	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || !(obj instanceof Book)) {
			return false;
		}

		Book other = (Book) obj;

		return this.title.equals(other.title) && this.author.equals(other.author) && this.price == other.price;
	}
}

public class Main {
	public static void main(String[] args) {

		Book book1 = new Book("Java", "Nguyen Van A", 100.0);
		Book book2 = new Book("Java", "Nguyen Van A", 100.0);

		System.out.println(book1 == book2);
		System.out.println(book1.equals(book2));
	}
}