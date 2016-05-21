package br.com.batistao;

import br.com.batistao.command.portao.AbrirPortaoCommand;
import br.com.batistao.command.portao.FecharPortaoCommand;
import br.com.batistao.controle.Controle;

/**
 * Created by ceb on 18/05/16.
 */
public class MainPortaoCommand {

    public static void main(String[] args) {
        Portao portaoDeCasa = new Portao();
        Controle controle = new Controle(new AbrirPortaoCommand(portaoDeCasa), new FecharPortaoCommand(portaoDeCasa));

        System.out.println(portaoDeCasa.toString());

        controle.abrirPortao();

        System.out.println(portaoDeCasa.toString());

        controle.fecharPortal();

        System.out.println(portaoDeCasa.toString());

        controle.abrirPortao();

        System.out.println(portaoDeCasa.toString());

        controle.desfazer();

        System.out.println(portaoDeCasa.toString());
    }
}
