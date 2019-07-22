package com.company.alex.client;

import com.company.Hola.Command;
import com.company.alex.User;
import com.company.alex.UserQuery;

public class Main {

    public static void main(String[] args) {
        final User result = new UserQuery().execute();
        ///User bob = (User) result;
        System.out.println("Bob est en fait " + result.name);


    }
}
