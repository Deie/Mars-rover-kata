package com.company.cmd;

public class TimeToEat implements  UndoCommand {
    @Override
    public void execute() {
        System.out.println("Hungryyyy");
    }

    public void rollback(){
        System.out.println("I'm thirsty");
    }
}