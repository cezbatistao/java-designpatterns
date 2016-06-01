package br.com.batistao.chainofresponsibility.promocao.chain;

import br.com.batistao.chainofresponsibility.loja.Compra;
import br.com.batistao.chainofresponsibility.promocao.Desconto;

/**
 * Created by ceb on 21/05/16.
 */
public class DiaDosNamoradosDescontoHandler extends Desconto {

    @Override
    public void desconto(Compra.Promocao promocao, Compra compra) {
        if(promocao == Compra.Promocao.DIA_DOS_NAMORADOS) {
            compra.setDesconto(15);
        } else if(proximo != null) {
            proximo.desconto(promocao, compra);
        }
    }
}
