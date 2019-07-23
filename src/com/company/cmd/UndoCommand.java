package com.company.cmd;

public interface UndoCommand<T> extends Command {

    void rollback();
}
