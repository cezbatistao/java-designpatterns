package br.com.batistao.strategy;

import br.com.batistao.strategy.loja.CompraSemStrategy;
import br.com.batistao.strategy.loja.Produto;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Created by ceb on 21/05/16.
 */
public class MainPromocaoSemStrategy {

    public static void main(String[] args) {
        Produto celularMotoGPlus = new Produto("Smartphone Moto G 4 Plus", 1499.00);
        CompraSemStrategy comprarSemStrategyNoLancamento = new CompraSemStrategy();
        comprarSemStrategyNoLancamento.comprar(celularMotoGPlus, 1);
        out.println(format("Valor do %s R$ %g", celularMotoGPlus.getNome(), comprarSemStrategyNoLancamento.valorDaCompra(0)));

        CompraSemStrategy comprarSemStrategyNoDiaDosNamorados = new CompraSemStrategy();
        comprarSemStrategyNoDiaDosNamorados.comprar(celularMotoGPlus, 1);
        out.println(format("Valor do %s no Dia dos Namorados R$ %g", celularMotoGPlus.getNome(), comprarSemStrategyNoDiaDosNamorados.valorDaCompra(15)));

        CompraSemStrategy comprarSemStrategyNoNatal = new CompraSemStrategy();
        comprarSemStrategyNoNatal.comprar(celularMotoGPlus, 1);
        out.println(format("Valor do %s no Natal R$ %g", celularMotoGPlus.getNome(), comprarSemStrategyNoNatal.valorDaCompra(10)));

        CompraSemStrategy comprarSemStrategyQuandoForSairProximoModelo = new CompraSemStrategy();
        comprarSemStrategyQuandoForSairProximoModelo.comprar(celularMotoGPlus, 1);
        out.println(format("Valor do %s daqui um ano R$ %g", celularMotoGPlus.getNome(), comprarSemStrategyQuandoForSairProximoModelo.valorDaCompra(25)));

        int quantidadeComprada = 3;
        int porcentagemDesconto = 0;
        if(quantidadeComprada == 1) {
            porcentagemDesconto = 10;
        } else if(quantidadeComprada == 2) {
            porcentagemDesconto = 20;
        } else if(quantidadeComprada == 3) {
            porcentagemDesconto = 30;
        } else if(quantidadeComprada >= 4) {
            porcentagemDesconto = 40;
        }

        CompraSemStrategy comprarMaisDeDoisDeUmaVezPeca = new CompraSemStrategy();
        comprarMaisDeDoisDeUmaVezPeca.comprar(celularMotoGPlus, quantidadeComprada);
        out.println(format("Valor do %s com desconto progressivo R$ %g", celularMotoGPlus.getNome(), comprarMaisDeDoisDeUmaVezPeca.valorDaCompra(porcentagemDesconto)));
    }
}
