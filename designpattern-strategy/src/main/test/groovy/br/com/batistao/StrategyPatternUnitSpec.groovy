package br.com.batistao

import br.com.batistao.strategy.loja.CompraComStrategy
import br.com.batistao.strategy.loja.Produto
import br.com.batistao.strategy.promocao.impl.PromocaoDeNatal
import br.com.batistao.strategy.promocao.impl.PromocaoDescontoProgressivo
import br.com.batistao.strategy.promocao.impl.PromocaoDiaDosNamorados
import br.com.batistao.strategy.promocao.impl.PromocaoQueimaDeEstoque
import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by ceb on 21/05/16.
 */
class StrategyPatternUnitSpec extends Specification {

    def "Teste valor de um produto sem ter promoçao"() {
        given:
        Produto celularMotoGPlus = new Produto("Smartphone Moto G 4 Plus", 1499.00);

        when:
        CompraComStrategy comprarNoLancamento = new CompraComStrategy();
        comprarNoLancamento.comprar(celularMotoGPlus, 1);

        then:
        assert comprarNoLancamento.valorCompra() == 1499.00d
    }

    def "Teste valor de um produto no Natal com 10% de desconto"() {
        given:
        Produto celularMotoGPlus = new Produto("Smartphone Moto G 4 Plus", 1499.00);

        when:
        CompraComStrategy comprarNoDiaDosNamorados = new CompraComStrategy();
        comprarNoDiaDosNamorados.comprar(celularMotoGPlus, 1);
        comprarNoDiaDosNamorados.concederPromocao(new PromocaoDeNatal());

        then:
        assert comprarNoDiaDosNamorados.valorCompra() == 1349.1d
    }

    def "Teste valor de um produto no Dia dos Namorados com 15% de desconto"() {
        given:
        Produto celularMotoGPlus = new Produto("Smartphone Moto G 4 Plus", 1499.00);

        when:
        CompraComStrategy comprarNoNatal = new CompraComStrategy();
        comprarNoNatal.comprar(celularMotoGPlus, 1);
        comprarNoNatal.concederPromocao(new PromocaoDiaDosNamorados());

        then:
        assert comprarNoNatal.valorCompra() == 1274.15d
    }

    def "Teste valor de um produto em Queima de Estoque com 25% de desconto"() {
        given:
        Produto celularMotoGPlus = new Produto("Smartphone Moto G 4 Plus", 1499.00);

        when:
        CompraComStrategy comprarQuandoForSairProximoModelo = new CompraComStrategy();
        comprarQuandoForSairProximoModelo.comprar(celularMotoGPlus, 1);
        comprarQuandoForSairProximoModelo.concederPromocao(new PromocaoQueimaDeEstoque());

        then:
        assert comprarQuandoForSairProximoModelo.valorCompra() == 1124.25d
    }

    @Unroll
    def "Teste de #quantidadeComprada produto(s) comprando(s) tem-se desconto de #desconto%"() {
        given:
        Produto celularMotoGPlus = new Produto("Smartphone Moto G 4 Plus", 1499.00);

        when:
        CompraComStrategy comprarMaisDeDoisDeUmaVezPeca = new CompraComStrategy();
        comprarMaisDeDoisDeUmaVezPeca.comprar(celularMotoGPlus, quantidadeComprada);
        comprarMaisDeDoisDeUmaVezPeca.concederPromocao(new PromocaoDescontoProgressivo(quantidadeComprada));

        then:
        assert comprarMaisDeDoisDeUmaVezPeca.valorCompra() == valorDaCompra
        assert comprarMaisDeDoisDeUmaVezPeca.promocao.desconto() == desconto

        where:
        quantidadeComprada  | valorDaCompra  | desconto
        0                   | 0              | 0
        1                   | 1349.1d        | 10
        2                   | 2398.4d        | 20
        3                   | 3147.9d        | 30
        4                   | 3597.6d        | 40
        5                   | 4497.0d        | 40
    }
}
