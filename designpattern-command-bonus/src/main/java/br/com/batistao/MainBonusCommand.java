package br.com.batistao;

import br.com.batistao.command.Command;
import br.com.batistao.command.impl.EmailCommand;
import br.com.batistao.command.impl.FileIOCommand;
import br.com.batistao.command.impl.LogCommand;
import br.com.batistao.command.impl.SmsCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ceb on 18/05/16.
 */
public class MainBonusCommand {

    public static void main(String[] args) {
        List<Command> comandos = new ArrayList<>();
        String texto = "Encadeando processos com o Design Pattern Command!";
        comandos.add(new EmailCommand("remetente@email.com.br", "destinatario@email.com.br", "Command Queue", texto));
        comandos.add(new FileIOCommand(texto));
        comandos.add(new LogCommand());
        comandos.add(new SmsCommand("(99) 99999-9999"));

        for (Command comando : comandos) {
            comando.execute();
        }
    }
}
