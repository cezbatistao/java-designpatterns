package br.com.batistao.chainofresponsibility.loja;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ceb on 21/05/16.
 */
public class Compra {

    public enum Promocao {
        SEM_DESCONTO, DIA_DOS_NAMORADOS, NATAL, QUEIMA_ESTOQUE, DESCONTO_PROGRESSIVO, DIA_DAS_MAES
    }

    private Map<Produto, Integer> produtos;
    private int desconto = 0;

    public Compra() {
        this.produtos = new HashMap<>();
    }

    public void comprar(Produto produto, int quantidade) {
        int quantidadetotal = quantidade;
        if(produtos.get(produto) != null) {
            int quantidadeJaComprada = produtos.get(produto);
            quantidadetotal = quantidadeJaComprada + quantidade;
        }

        produtos.put(produto, quantidadetotal);
    }

    public Map<Produto, Integer> getProdutos() {
        return produtos;
    }

    //    public Double valorCompra() {
//        Double porcentagemPromocao = (promocao.desconto()/100d);
//
//        Double valorTotal = 0d;
//        for (Map.Entry<Produto, Integer> produtoEntry : produtos.entrySet()) {
//            valorTotal += produtoEntry.getKey().getValor() * produtoEntry.getValue();
//        }
//
//        return valorTotal-(valorTotal*(promocao.desconto()/100d));
//    }


    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public int getDesconto() {
        return desconto;
    }
}
