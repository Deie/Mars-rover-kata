package com.company.alex;

public abstract class DbQuery<R> implements Query<R> {

    public R execute() {
        System.out.println("OUVRE CONN");
        R result = query();
        System.out.println("FERME CONN");
        return result;
    }

}

