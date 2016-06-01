package br.com.batistao.chainofresponsibility;

import br.com.batistao.chainofresponsibility.loja.Compra;
import br.com.batistao.chainofresponsibility.loja.Produto;
import br.com.batistao.chainofresponsibility.promocao.Desconto;
import br.com.batistao.chainofresponsibility.promocao.chain.*;

import java.util.Map;

/**
 * Created by ceb on 21/05/16.
 */
public class CalcularValorCompra {

    private Desconto desconto;

    public CalcularValorCompra() {
        Desconto diaDosNamoradosDescontoHandler = new DiaDosNamoradosDescontoHandler();
        Desconto natalDescontoHandler = new NatalDescontoHandler();
        Desconto queimaDeEstoqueDescontoHandler = new QueimaDeEstoqueDescontoHandler();
        Desconto descontoProgressivoDescontoHandler = new DescontoProgressivoDescontoHandler();
        Desconto diaDasMaesDescontoHandler = new DiaDasMaesDescontoHandler();

        this.desconto = diaDosNamoradosDescontoHandler;
        diaDosNamoradosDescontoHandler.setProximo(natalDescontoHandler);
        natalDescontoHandler.setProximo(queimaDeEstoqueDescontoHandler);
        queimaDeEstoqueDescontoHandler.setProximo(descontoProgressivoDescontoHandler);
        descontoProgressivoDescontoHandler.setProximo(diaDasMaesDescontoHandler);
    }

    public Double valorCompra(Compra compra) {
        return valorCompra(Compra.Promocao.SEM_DESCONTO, compra);
    }

    public Double valorCompra(Compra.Promocao promocao, Compra compra) {
        desconto.desconto(promocao, compra);

        Double valorTotal = 0d;
        for (Map.Entry<Produto, Integer> produtoEntry : compra.getProdutos().entrySet()) {
            valorTotal += produtoEntry.getKey().getValor() * produtoEntry.getValue();
        }

        return valorTotal-(valorTotal*(compra.getDesconto()/100d));
    }
}
