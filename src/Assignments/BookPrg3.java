package Assignments;

public class BookPrg3 {

	// Program - 3:
	// Create a class Book having Title, Book Publisher, Author with parameterized
	// constructor using this keyword.
	// Write a method to display the details of the Book and Test the class by
	// creating objects.
    String title;
    String publisher;
    String author;
    
    BookPrg3(String title, String publisher, String author) {
    this.title=title;
    this.publisher=publisher;
    this.author=author;
	}

	void display() {
		System.out.println(title+" is the title of the book and publisher of this book is "+publisher+" and author is "+author+".");
	}
	public static void main(String[] args) {
		BookPrg3 book = new BookPrg3("Me","publish-Mona","Monali");
		book.display();

	}

}

