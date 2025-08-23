package Day9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Book class implementing Comparable
class Book implements Comparable<Book> {
    int bookId;
    String title;
    String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    // Compare books by bookId in descending order
    @Override
    public int compareTo(Book other) {
        // Descending order: higher bookId comes first
        return Integer.compare(other.bookId, this.bookId);
    }

    @Override
    public String toString() {
        return "Book{" + "bookId=" + bookId + ", title='" + title + '\'' + ", author='" + author + '\'' + '}';
    }
}

public class BookSortDemo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        // Add books
        books.add(new Book(101, "Java Basics", "Alice"));
        books.add(new Book(105, "Data Structures", "Bob"));
        books.add(new Book(103, "Algorithms", "Charlie"));
        books.add(new Book(102, "OOP Concepts", "Diana"));

        // Display before sorting
        System.out.println("Before sorting:");
        for (Book b : books) {
            System.out.println(b);
        }

        // Sort books by bookId descending
        Collections.sort(books);

        // Display after sorting
        System.out.println("\nAfter sorting by bookId (descending):");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
