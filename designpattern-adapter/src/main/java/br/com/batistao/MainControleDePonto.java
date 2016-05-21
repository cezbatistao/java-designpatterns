package br.com.batistao;

import br.com.batistao.funcionario.Funcionario;
import br.com.batistao.controleponto.ControleDePonto;

/**
 * Created by ceb on 18/05/16.
 */
public class MainControleDePonto {

    public static void main(String[] args) throws InterruptedException {
        ControleDePonto controleDePonto = new ControleDePonto();
        Funcionario funcionarioCarlos = new Funcionario("Carlos");

        controleDePonto.registrarEntrada(funcionarioCarlos);
        Thread.sleep(3000);
        controleDePonto.registrarSaida(funcionarioCarlos);
    }
}
