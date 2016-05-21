package br.com.batistao.command.impl;

import br.com.batistao.command.Command;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Created by ceb on 18/05/16.
 */
public class SmsCommand implements Command {

    private String numeroCelular;

    public SmsCommand(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    @Override
    public void execute() {
        out.println(format("Enviando SMS para: %s", numeroCelular));
    }
}
