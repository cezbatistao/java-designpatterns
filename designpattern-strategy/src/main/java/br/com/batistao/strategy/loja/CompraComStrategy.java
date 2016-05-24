package br.com.batistao.strategy.loja;

import br.com.batistao.strategy.promocao.Promocao;
import br.com.batistao.strategy.promocao.impl.SemPromocao;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ceb on 21/05/16.
 */
public class CompraComStrategy {

    private Map<Produto, Integer> produtos;
    private Promocao promocao;

    public CompraComStrategy() {
        this.produtos = new HashMap<>();
        this.promocao = new SemPromocao();
    }

    public void comprar(Produto produto, int quantidade) {
        int quantidadetotal = quantidade;
        if(produtos.get(produto) != null) {
            int quantidadeJaComprada = produtos.get(produto);
            quantidadetotal = quantidadeJaComprada + quantidade;
        }

        produtos.put(produto, quantidadetotal);
    }

    public Double valorCompra() {
        Double porcentagemPromocao = (promocao.desconto()/100d);

        Double valorTotal = 0d;
        for (Map.Entry<Produto, Integer> produtoEntry : produtos.entrySet()) {
            valorTotal += produtoEntry.getKey().getValor() * produtoEntry.getValue();
        }

        return valorTotal - (valorTotal * porcentagemPromocao);
    }

    public void concederPromocao(Promocao promocao) {
        this.promocao = promocao;
    }
}
