package br.com.batistao.chainofresponsibility;

import br.com.batistao.chainofresponsibility.loja.Compra;
import br.com.batistao.chainofresponsibility.loja.Produto;

import static br.com.batistao.chainofresponsibility.loja.Compra.Promocao.*;
import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Created by ceb on 21/05/16.
 */
public class MainChainOfResponsibility {

    public static void main(String[] args) {
        Produto celularMotoGPlus = new Produto("Smartphone Moto G 4 Plus", 1499.00);
        CalcularValorCompra calcularValorCompra = new CalcularValorCompra();

        Compra comprarNoLancamento = new Compra();
        comprarNoLancamento.comprar(celularMotoGPlus, 1);
        out.println(format("Valor do %s: R$ %.2f", celularMotoGPlus.getNome(), calcularValorCompra.valorCompra(SEM_DESCONTO, comprarNoLancamento)));

        Compra comprarNoDiaDosNamorados = new Compra();
        comprarNoDiaDosNamorados.comprar(celularMotoGPlus, 1);
        out.println(format("Valor do %s: no Dia dos Namorados R$ %.2f", celularMotoGPlus.getNome(), calcularValorCompra.valorCompra(DIA_DOS_NAMORADOS, comprarNoDiaDosNamorados)));

        Compra comprarNoNatal = new Compra();
        comprarNoNatal.comprar(celularMotoGPlus, 1);
        out.println(format("Valor do %s: no Natal R$ %.2f", celularMotoGPlus.getNome(), calcularValorCompra.valorCompra(NATAL, comprarNoNatal)));

        Compra comprarQuandoForSairProximoModelo = new Compra();
        comprarQuandoForSairProximoModelo.comprar(celularMotoGPlus, 1);
        out.println(format("Valor do %s: na queima de estoque R$ %.2f", celularMotoGPlus.getNome(), calcularValorCompra.valorCompra(QUEIMA_ESTOQUE, comprarQuandoForSairProximoModelo)));

        Compra comprarMaisDeDoisDeUmaVez = new Compra();
        comprarMaisDeDoisDeUmaVez.comprar(celularMotoGPlus, 3);
        out.println(format("Valor do %s: comprando mais de uma unidade R$ %.2f", celularMotoGPlus.getNome(), calcularValorCompra.valorCompra(DESCONTO_PROGRESSIVO, comprarMaisDeDoisDeUmaVez)));

        Compra comprarNoDiaDasMaes = new Compra();
        comprarNoDiaDasMaes.comprar(celularMotoGPlus, 1);
        out.println(format("Valor do %s: no dia das Mães R$ %.2f", celularMotoGPlus.getNome(), calcularValorCompra.valorCompra(DIA_DAS_MAES, comprarNoDiaDasMaes)));
    }
}
