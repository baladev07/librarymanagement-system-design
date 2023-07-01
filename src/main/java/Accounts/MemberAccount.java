package Accounts;

import models.Person;

import java.util.Date;

public class MemberAccount extends Account {

    private Date dateOfMembership;

    private int totalNumberOfCheckoutBooks;


    public MemberAccount(String accountStatus, Person person) {
        super(accountStatus, person, Roles.member);
    }

    @Override
    Roles getRole() {
        return Roles.member;
    }


    public void reserveABookItem()
    {

    }

    public void checkoutABookItem()
    {

    }

    public void lendABook()
    {

    }
}
