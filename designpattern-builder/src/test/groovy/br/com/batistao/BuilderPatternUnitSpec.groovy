package br.com.batistao

import br.com.batistao.command.combuilder.ClienteComBuilder
import br.com.batistao.command.sembuilder.ClienteSemBuilder
import org.joda.time.LocalDate
import spock.lang.Specification

/**
 * Created by ceb on 18/05/16.
 */
class BuilderPatternUnitSpec extends Specification {

    def "Teste utilizando classe SEM o Builder"() {
        when:
        Date dataNascimento = new LocalDate(1982, 9, 15).toDate()

        ClienteSemBuilder clienteSemBuilder = new ClienteSemBuilder("Carlos", dataNascimento, "111.111", "carlos@email.com.br",
                "Rua Sem Nome", 10, "Nome do Bairro", "11.111-999", "SP", "Campinas", "19-91111-1111")

        then:
        assert clienteSemBuilder
        assert clienteSemBuilder.nome == "Carlos"
        assert clienteSemBuilder.dataNascimento == dataNascimento
        assert !clienteSemBuilder.rg
        assert clienteSemBuilder.cpf == "111.111"
        assert clienteSemBuilder.email == "carlos@email.com.br"

        assert clienteSemBuilder.logradouro == "Rua Sem Nome"
        assert clienteSemBuilder.numero == 10
        assert !clienteSemBuilder.complemento
        assert clienteSemBuilder.bairro == "Nome do Bairro"
        assert clienteSemBuilder.cep == "11.111-999"
        assert clienteSemBuilder.uf == "SP"
        assert clienteSemBuilder.cidade == "Campinas"

        assert !clienteSemBuilder.telefoneResidencial
        assert clienteSemBuilder.telefoneCelular == "19-91111-1111"
    }

    def "Teste utilizando classe COM o Builder"() {
        when:
        Date dataNascimento = new LocalDate(1982, 9, 15).toDate()

        ClienteComBuilder clienteComBuilder = new ClienteComBuilder.Builder().comNome("Carlos").comDataNascimento(dataNascimento).comCpf("111.111")
                .comRg("99.999").comEmail("carlos@email.com.br").noLogradouro("Rua Sem Nome").noNumero(10).noBairro("Nome do Bairro")
                .noCep("11.111-999").naUf("SP").naCidade("Campinas").comTelefoneCelular("19-91111-1111").build()

        then:
        assert clienteComBuilder
        assert clienteComBuilder.nome == "Carlos"
        assert clienteComBuilder.dataNascimento == dataNascimento
        assert clienteComBuilder.rg == "99.999"
        assert clienteComBuilder.cpf == "111.111"
        assert clienteComBuilder.email == "carlos@email.com.br"

        assert clienteComBuilder.logradouro == "Rua Sem Nome"
        assert clienteComBuilder.numero == 10
        assert !clienteComBuilder.complemento
        assert clienteComBuilder.bairro == "Nome do Bairro"
        assert clienteComBuilder.cep == "11.111-999"
        assert clienteComBuilder.uf == "SP"
        assert clienteComBuilder.cidade == "Campinas"

        assert !clienteComBuilder.telefoneResidencial
        assert clienteComBuilder.telefoneCelular == "19-91111-1111"
    }
}
