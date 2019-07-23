package com.company.cmd;

public class Hello implements Command {

    @Override
    public void execute() {
        System.out.println("Coucou" );
    }

    public void rollback() {
        System.out.println("CA PULSE PAS");
    }
}
