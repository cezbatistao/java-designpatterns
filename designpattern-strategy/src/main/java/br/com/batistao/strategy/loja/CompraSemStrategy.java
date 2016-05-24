package br.com.batistao.strategy.loja;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ceb on 21/05/16.
 */
public class CompraSemStrategy {

    private Map<Produto, Integer> produtos;

    public CompraSemStrategy() {
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

    public Double valorDaCompra(int desconto) {
        Double porcentagemPromocao = (desconto/100d);

        Double valorTotal = 0d;
        for (Map.Entry<Produto, Integer> produtoEntry : produtos.entrySet()) {
            valorTotal += produtoEntry.getKey().getValor() * produtoEntry.getValue();
        }

        return valorTotal - (valorTotal * porcentagemPromocao);
    }
}
