package br.com.batistao.chainofresponsibility.promocao.chain;

import br.com.batistao.chainofresponsibility.loja.Compra;
import br.com.batistao.chainofresponsibility.promocao.Desconto;

/**
 * Created by ceb on 21/05/16.
 */
public class DiaDasMaesDescontoHandler extends Desconto {

    @Override
    public void desconto(Compra.Promocao promocao, Compra compra) {
        if(promocao == Compra.Promocao.DIA_DAS_MAES) {
            compra.setDesconto(50);
        } else if(proximo != null) {
            proximo.desconto(promocao, compra);
        }
    }
}
