package br.com.batistao.controleponto;

import br.com.batistao.funcionario.Funcionario;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import org.joda.time.LocalDateTime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by ceb on 18/05/16.
 */
public class ControleDePonto {

    private SimpleDateFormat simpleDateFormat;
    private Multimap<Funcionario, Ponto> registro;

    public ControleDePonto() {
        simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy H:m:s");
        registro = ArrayListMultimap.create();
    }

    public void registrarEntrada(Funcionario funcionario) {
        Date dataRegistro = new LocalDateTime().toDate();

        registro.put(funcionario, new Ponto(Ponto.Tipo.ENTRADA, dataRegistro));

        String format = simpleDateFormat.format(dataRegistro);
        System.out.println("[ControleDePonto] Entrada do(a) funcionário(a): " + funcionario.getNome() + " às " + format);
    }

    public void registrarSaida(Funcionario funcionario) {
        Date dataRegistro = new LocalDateTime().toDate();

        registro.put(funcionario, new Ponto(Ponto.Tipo.SAIDA, dataRegistro));

        String format = simpleDateFormat.format(dataRegistro);
        System.out.println("[ControleDePonto] Saída do(a) funcionário(a): " + funcionario.getNome() + " às " + format);
    }

    public List<Ponto> getListaPontos(Funcionario funcionario) {
        return Lists.newArrayList(registro.get(funcionario));
    }
}
