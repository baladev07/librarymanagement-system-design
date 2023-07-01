package Books;

import models.Author;

import java.util.List;

public class Book {

    String title;

    String language;

    String subject;

    List<Author> Authors;

    public Book(String title, String language, String subject, List<Author> authors) {
        this.title = title;
        this.language = language;
        this.subject = subject;
        Authors = authors;
    }
}
