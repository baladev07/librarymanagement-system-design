package Books;

import Accounts.Account;
import Books.Book;
import models.Author;
import models.Rack;

import java.util.Date;
import java.util.List;

public class BookItem extends Book {

    double price;

    Date dateOfPurchase;

    Date publicationDate;

    Rack placedAt;

    Account reserves;

    Account borrows;



    public BookItem(String title, String language, String subject, List<Author> authors) {
        super(title, language, subject, authors);
    }


}
