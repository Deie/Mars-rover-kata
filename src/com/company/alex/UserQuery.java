package com.company.alex;

public class UserQuery extends DbQuery<User> {

    @Override
    protected User query() {
        return new User("Toto");
        //return new Utilisateur("Toto");
    }
}
