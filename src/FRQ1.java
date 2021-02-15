import java.util.ArrayList;

// Given implementation
class Book {
	private String title;
	private String author;

	public Book(String t, String a) {
		title = t;
		author = a;
	}

	public void printBookInfo() {
		System.out.print(title + ", written by " + author);
	}
}

// (a) The PictureBook class is a subclass of the Book class that has one additional attribute: a String variable named illustrator that is used to represent the name of the illustrator of a picture book.
// The PictureBook class also contains a printBookInfo method to print the title, writer, and illustrator of a picture book.
class PictureBook extends Book {
	String illustrator;
	public PictureBook(String Title, String Author, String Illustrator) {
		super(Title, Author);
		illustrator = Illustrator;
	}
	public void printBookInfo() {
		super.printBookInfo();
		System.out.print(" and illustrated by " + illustrator);
	}
}

// (c) Complete the BookListing class below. Your implementation should conform to the examples.
// Assume that class PictureBook works as intended, regardless of what you wrote in part (a).
class BookListing {
	Book BookObject;
	double Price;
	public BookListing(Book BookObject, double Price) {
		this.BookObject = BookObject;
		this.Price = Price;
	}
	void printDescription() {
		BookObject.printBookInfo();
		System.out.print(", $" + Price);
	}
}

public class FRQ1 {
	public static void main(String[] args) {
		// Test part (a)
		PictureBook myBook = new PictureBook("Peter and Wendy", "J.M. Barrie", "F.D. Bedford");
		myBook.printBookInfo();
		System.out.println();

		// (b) Write a code segment that can be used to replace /* missing code */ so that book1 and book2 will be correctly created and added to myLibrary.
		// Assume that class PictureBook works as intended, regardless of what you wrote in part (a).
		ArrayList<Book> myLibrary = new ArrayList<Book>();

		Book book1 = new Book("Frankenstein", "Mary Shelley");
		Book book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");

		myLibrary.add(book1);
		myLibrary.add(book2);

		// Test part(c)
		BookListing listing1 = new BookListing(book1, 10.99);
		listing1.printDescription();
		System.out.println();

		BookListing listing2 = new BookListing(book2, 12.99);
		listing2.printDescription();
		System.out.println();
	}
}
