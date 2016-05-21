package br.com.batistao.command.sembuilder;

import org.joda.time.LocalDate;

import java.util.Date;

/**
 * Created by ceb on 18/05/16.
 */
public class MainClienteSemBuilder {

    public static void main(String[] args) {
        Date dataNascimento = new LocalDate(1982, 9, 15).toDate();

        ClienteSemBuilder clienteSemBuilder = new ClienteSemBuilder("Carlos", dataNascimento, "111.111", "carlos@email.com.br",
                "Rua Sem Nome", 10, "Nome do Bairro", "11.111-999", "SP", "Campinas", "19-91111-1111");

        System.out.println("Dados do Cliente: " + clienteSemBuilder.toString());
    }
}
