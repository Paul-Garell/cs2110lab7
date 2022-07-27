/** A class modeling a book. */
public class Book {
    String title;
    int year;
    String author;
    
    /** Create a new book with title b. */
    public Book(String t, String a, int y) {
        title= t;
        author= a;
        year = y;
    }



    /** Print this book. */
    public void printBook() {
        System.out.println(title + " (" + year + ") by " + author);
    }

    /** Some book examples. */
    public static void main(String[] args) {
        Book b = new Book("A Clockwork Orange", Anthony Burgess, 1962);
        b.printBook();
    }
}