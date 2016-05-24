package br.com.batistao.strategy;

import br.com.batistao.strategy.loja.CompraComStrategy;
import br.com.batistao.strategy.loja.Produto;
import br.com.batistao.strategy.promocao.impl.PromocaoDeNatal;
import br.com.batistao.strategy.promocao.impl.PromocaoDescontoProgressivo;
import br.com.batistao.strategy.promocao.impl.PromocaoDiaDosNamorados;
import br.com.batistao.strategy.promocao.impl.PromocaoQueimaDeEstoque;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Created by ceb on 21/05/16.
 */
public class MainPromocaoComStrategy {

    public static void main(String[] args) {
        Produto celularMotoGPlus = new Produto("Smartphone Moto G 4 Plus", 1499.00);
        CompraComStrategy comprarNoLancamento = new CompraComStrategy();
        comprarNoLancamento.comprar(celularMotoGPlus, 1);
        out.println(format("Valor do %s R$ %g", celularMotoGPlus.getNome(), comprarNoLancamento.valorCompra()));

        CompraComStrategy comprarNoDiaDosNamorados = new CompraComStrategy();
        comprarNoDiaDosNamorados.comprar(celularMotoGPlus, 1);
        comprarNoDiaDosNamorados.concederPromocao(new PromocaoDiaDosNamorados());
        out.println(format("Valor do %s no Dia dos Namorados R$ %g", celularMotoGPlus.getNome(), comprarNoDiaDosNamorados.valorCompra()));

        CompraComStrategy comprarNoNatal = new CompraComStrategy();
        comprarNoNatal.comprar(celularMotoGPlus, 1);
        comprarNoNatal.concederPromocao(new PromocaoDeNatal());
        out.println(format("Valor do %s no Natal R$ %g", celularMotoGPlus.getNome(), comprarNoNatal.valorCompra()));

        CompraComStrategy comprarQuandoForSairProximoModelo = new CompraComStrategy();
        comprarQuandoForSairProximoModelo.comprar(celularMotoGPlus, 1);
        comprarQuandoForSairProximoModelo.concederPromocao(new PromocaoQueimaDeEstoque());
        out.println(format("Valor do %s daqui um ano R$ %g", celularMotoGPlus.getNome(), comprarQuandoForSairProximoModelo.valorCompra()));

        int quantidadeComprada = 3;
        CompraComStrategy comprarMaisDeDoisDeUmaVezPeca = new CompraComStrategy();
        comprarMaisDeDoisDeUmaVezPeca.comprar(celularMotoGPlus, quantidadeComprada);
        comprarMaisDeDoisDeUmaVezPeca.concederPromocao(new PromocaoDescontoProgressivo(quantidadeComprada));
        out.println(format("Valor do %s com desconto progressivo R$ %g", celularMotoGPlus.getNome(), comprarMaisDeDoisDeUmaVezPeca.valorCompra()));
    }
}
