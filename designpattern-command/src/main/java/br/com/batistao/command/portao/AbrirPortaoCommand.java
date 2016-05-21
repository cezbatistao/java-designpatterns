package br.com.batistao.command.portao;

import br.com.batistao.command.Command;
import br.com.batistao.Portao;

/**
 * Created by ceb on 18/05/16.
 */
public class AbrirPortaoCommand implements Command {

    private Portao portao;

    public AbrirPortaoCommand(Portao portao) {
        this.portao = portao;
    }

    @Override
    public void execute() {
        portao.abrir();
    }

    @Override
    public void undo() {
        portao.fechar();
    }
}
