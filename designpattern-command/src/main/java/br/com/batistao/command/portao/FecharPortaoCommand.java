package br.com.batistao.command.portao;

import br.com.batistao.command.Command;
import br.com.batistao.Portao;

/**
 * Created by ceb on 18/05/16.
 */
public class FecharPortaoCommand implements Command {

    private Portao portao;

    public FecharPortaoCommand(Portao portao) {
        this.portao = portao;
    }

    @Override
    public void execute() {
        portao.fechar();
    }

    @Override
    public void undo() {
        portao.abrir();
    }
}
