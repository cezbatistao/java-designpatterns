package br.com.batistao.command;

/**
 * Created by ceb on 18/05/16.
 */
public interface Command {

    public void execute();

    public void undo();
}
