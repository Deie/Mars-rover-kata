package com.company.alex;

public class UserQuery extends DbQuery<User> {

    @Override
    public User query() {
        return new User("Toto");
        //return new Utilisateur("Toto");
    }
}
