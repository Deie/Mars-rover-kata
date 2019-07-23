package com.company.cmd;

public class Main {

    public static void main(String[] args) throws Exception {

        final Scheduler scheduler = new Scheduler();
        final Hello cmd = new Hello();
        scheduler.schedule(cmd, 3000);
        scheduler.schedule(cmd, 30);

        final TimeToEat lunch = new TimeToEat();
        scheduler.schedule(lunch, 20);

        final TimeToEat diner = new TimeToEat();
        scheduler.schedule(diner, 200);
        scheduler.schedule(diner, 150);
        scheduler.schedule(diner, 100);
        scheduler.rollbackOnLastCmd();
        scheduler.rollbackOnLastCmd();
        System.in.read();
    }

}
