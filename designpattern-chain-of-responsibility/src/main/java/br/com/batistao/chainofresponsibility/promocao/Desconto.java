package br.com.batistao.chainofresponsibility.promocao;

import br.com.batistao.chainofresponsibility.loja.Compra;

/**
 * Created by ceb on 21/05/16.
 */
public abstract class Desconto {

    protected Desconto proximo;

    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }

    public abstract void desconto(Compra.Promocao promocao, Compra compra);
}
