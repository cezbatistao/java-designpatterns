package br.com.batistao.command.impl;

import br.com.batistao.command.Command;

import static java.lang.System.out;

/**
 * Created by ceb on 18/05/16.
 */
public class LogCommand implements Command {

    @Override
    public void execute() {
        out.println("Escrevendo no log...");
    }
}
