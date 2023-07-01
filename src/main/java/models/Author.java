package models;

import Books.Book;

import java.util.List;

public class Author extends Person{
    List<Book> books;

    public Author(String name, String age, String emailID) {
        super(name, age, emailID);
    }

}
