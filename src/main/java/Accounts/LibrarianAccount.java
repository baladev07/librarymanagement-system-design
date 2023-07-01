package Accounts;

import models.Person;

public class LibrarianAccount extends Account {
    public LibrarianAccount(String accountStatus, Person person) {
        super(accountStatus, person, Roles.librarian);
    }

    @Override
    Roles getRole() {
        return Roles.librarian;
    }

    public boolean addBookItem()
    {
        return false;
    }


    public boolean blockMember()
    {
        return false;
    }

    public boolean unblockMember()
    {
        return false;
    }
}
