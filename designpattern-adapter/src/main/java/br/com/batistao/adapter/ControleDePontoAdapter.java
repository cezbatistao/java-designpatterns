package br.com.batistao.adapter;

import br.com.batistao.controleponto.Ponto;
import br.com.batistao.funcionario.Funcionario;
import br.com.batistao.controleponto.ControleDePonto;
import br.com.batistao.controleponto.novo.ControleDePontoNovo;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;

import java.util.List;

/**
 * Created by ceb on 18/05/16.
 */
public class ControleDePontoAdapter extends ControleDePonto {

    private ControleDePontoNovo controleDePontoNovo;

    public ControleDePontoAdapter() {
        this.controleDePontoNovo = new ControleDePontoNovo();
    }

    @Override
    public void registrarEntrada(Funcionario funcionario) {
        controleDePontoNovo.registrar(funcionario, true);
    }

    @Override
    public void registrarSaida(Funcionario funcionario) {
        controleDePontoNovo.registrar(funcionario, false);
    }

    @Override
    public List<Ponto> getListaPontos(Funcionario funcionario) {
        Multimap<Funcionario, Ponto> registrosDePonto = controleDePontoNovo.getRegistro();
        return Lists.newArrayList(registrosDePonto.get(funcionario));
    }
}
