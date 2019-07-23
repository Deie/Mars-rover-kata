package com.company.cmd;

import java.util.Stack;

public class Scheduler {

    private Stack<Command> cmds = new Stack<>();

    public void schedule(Command cmd, long delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            cmd.execute();
            cmds.push(cmd);
        } catch (RuntimeException e) {
            e.printStackTrace();
            if (cmd instanceof UndoCommand) {
                ((UndoCommand) cmd).rollback();
            }

        }

    }

    public void rollbackOnLastCmd(){
        Command lastCmd = cmds.pop();
        if (lastCmd instanceof UndoCommand) {
            ((UndoCommand) lastCmd).rollback();
        } else {
            System.out.println("Sorry, rollback impossible"  + lastCmd);
        }

    }

}
