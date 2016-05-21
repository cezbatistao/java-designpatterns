package br.com.batistao.command.impl;

import br.com.batistao.command.Command;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Created by ceb on 18/05/16.
 */
public class FileIOCommand implements Command {

    private String texto;

    public FileIOCommand(String texto) {
        this.texto = texto;
    }

    @Override
    public void execute() {
        out.println(format("Manipulando o texto: %s", texto));
    }
}
