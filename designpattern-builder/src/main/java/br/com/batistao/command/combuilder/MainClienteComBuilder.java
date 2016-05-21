package br.com.batistao.command.combuilder;

import org.joda.time.LocalDate;

import java.util.Date;

/**
 * Created by ceb on 18/05/16.
 */
public class MainClienteComBuilder {

    public static void main(String[] args) {
        Date dataNascimento = new LocalDate(1982, 9, 15).toDate();

        ClienteComBuilder clienteComBuilder = new ClienteComBuilder.Builder().comNome("Carlos").comDataNascimento(dataNascimento).comCpf("111.111")
                .comRg("99.999").comEmail("carlos@email.com.br").noLogradouro("Rua Sem Nome").noNumero(10).noBairro("Nome do Bairro")
                .noCep("11.111-999").naUf("SP").naCidade("Campinas").comTelefoneCelular("19-91111-1111").build();


        System.out.println("Dados do Cliente: " + clienteComBuilder.toString());
    }
}
