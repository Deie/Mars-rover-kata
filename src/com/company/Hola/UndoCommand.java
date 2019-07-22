package com.company.Hola;

public interface UndoCommand<T> extends Command {

    void rollback();
}
