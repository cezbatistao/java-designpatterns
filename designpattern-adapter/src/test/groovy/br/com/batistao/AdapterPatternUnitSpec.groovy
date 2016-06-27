package br.com.batistao

import br.com.batistao.adapter.ControleDePontoAdapter
import br.com.batistao.controleponto.ControleDePonto
import br.com.batistao.controleponto.Ponto
import br.com.batistao.funcionario.Funcionario
import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by ceb on 18/05/16.
 */
class AdapterPatternUnitSpec extends Specification {

    private ControleDePonto controleDePonto

    @Unroll
    def "Teste utilizando a instância de #instanciaControlePonto realizando uma entrada e uma saída deve ter total de número de pontos: #numeroPontosEsperados"() {
        given:
        controleDePonto = instanciaControlePonto
        Funcionario funcionario = new Funcionario("Carlos")

        when:
        controleDePonto.registrarEntrada(funcionario)

        and:
        controleDePonto.registrarSaida(funcionario)

        then:
        List<Ponto> pontos = controleDePonto.getListaPontos(funcionario)

        assert pontos.size() == numeroPontosEsperados

        where:
        instanciaControlePonto        | numeroPontosEsperados
        new ControleDePonto()         | 2
        new ControleDePontoAdapter()  | 2
    }
}
