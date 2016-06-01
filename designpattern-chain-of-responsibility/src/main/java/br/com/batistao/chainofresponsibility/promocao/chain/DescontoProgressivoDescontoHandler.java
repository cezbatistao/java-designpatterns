package br.com.batistao.chainofresponsibility.promocao.chain;

import br.com.batistao.chainofresponsibility.loja.Compra;
import br.com.batistao.chainofresponsibility.promocao.Desconto;

/**
 * Created by ceb on 21/05/16.
 */
public class DescontoProgressivoDescontoHandler extends Desconto {

    @Override
    public void desconto(Compra.Promocao promocao, Compra compra) {
        if(promocao == Compra.Promocao.DESCONTO_PROGRESSIVO) {
            int numeroItens = 0;
            for (Integer totalItensPorProduto : compra.getProdutos().values()) {
                numeroItens += totalItensPorProduto;
            }

            int desconto = 0;
            if(numeroItens >= 4) {
                desconto = 40;
            } else if(numeroItens == 3) {
                desconto = 30;
            } else if(numeroItens == 2) {
                desconto = 20;
            } else if(numeroItens == 1) {
                desconto = 10;
            }

            compra.setDesconto(desconto);
        } else if(proximo != null) {
            proximo.desconto(promocao, compra);
        }
    }
}
