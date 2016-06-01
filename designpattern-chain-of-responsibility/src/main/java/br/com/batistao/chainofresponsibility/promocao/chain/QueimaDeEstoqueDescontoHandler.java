package br.com.batistao.chainofresponsibility.promocao.chain;

import br.com.batistao.chainofresponsibility.loja.Compra;
import br.com.batistao.chainofresponsibility.promocao.Desconto;

/**
 * Created by ceb on 21/05/16.
 */
public class QueimaDeEstoqueDescontoHandler extends Desconto {

    @Override
    public void desconto(Compra.Promocao promocao, Compra compra) {
        if(promocao == Compra.Promocao.QUEIMA_ESTOQUE) {
            compra.setDesconto(25);
        } else if(proximo != null) {
            proximo.desconto(promocao, compra);
        }
    }
}
