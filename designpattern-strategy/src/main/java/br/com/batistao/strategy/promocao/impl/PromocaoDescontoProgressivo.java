package br.com.batistao.strategy.promocao.impl;


import br.com.batistao.strategy.promocao.Promocao;

import java.util.Map;

/**
 * Created by ceb on 21/05/16.
 */
public class PromocaoDescontoProgressivo implements Promocao {

    public Integer desconto;

    public PromocaoDescontoProgressivo(int numeroItens) {
        if(numeroItens >= 4) {
            desconto = 40;
        } else if(numeroItens == 3) {
            desconto = 30;
        } else if(numeroItens == 2) {
            desconto = 20;
        } else if(numeroItens == 1) {
            desconto = 10;
        } else {
            desconto = 0;
        }
    }

    @Override
    public int desconto() {
        return desconto;
    }
}
