package br.com.batistao.strategy.promocao.impl;


import br.com.batistao.strategy.promocao.Promocao;

/**
 * Created by ceb on 21/05/16.
 */
public class SemPromocao implements Promocao {

    @Override
    public int desconto() {
        return 0;
    }
}
