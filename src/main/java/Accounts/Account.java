package Accounts;

import models.Person;

public abstract class Account {
    String accountStatus;

    Person person;

    Roles role;

    Account(String accountStatus, Person person, Roles role) {
        this.accountStatus = accountStatus;
        this.person = person;
        this.role = role;
    }



    abstract  Roles getRole();

}
