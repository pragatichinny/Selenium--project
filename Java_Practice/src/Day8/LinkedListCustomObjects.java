package Day8;

import java.util.LinkedList;

class Book {
    int id;
    String title;
    String author;

    Book(int id, String title, String author){
        this.id = id;
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("ID: " + id + ", Title: " + title + ", Author: " + author);
    }
}

public class LinkedListCustomObjects {
    public static void main(String[] args) {
        LinkedList<Book> books = new LinkedList<>();
        books.add(new Book(101, "Java Basics", "Alice"));
        books.add(new Book(102, "Data Structures", "Bob"));
        books.add(new Book(103, "Algorithms", "Charlie"));

        System.out.println("Book Details:");
        for(Book b : books) {
            b.display();
        }
    }
}
