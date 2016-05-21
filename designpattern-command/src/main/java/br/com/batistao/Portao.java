package br.com.batistao;

/**
 * Created by ceb on 18/05/16.
 */
public class Portao {

    enum EstadoPortao {
        ABERTO, FECHADO
    }

    private EstadoPortao estado = EstadoPortao.FECHADO;

    public EstadoPortao getEstado() {
        return estado;
    }

    public void abrir() {
        this.estado = EstadoPortao.ABERTO;
        System.out.println("O portão abriu...");
    }

    public void fechar() {
        this.estado = EstadoPortao.FECHADO;
        System.out.println("O portão fechou...");
    }

    @Override
    public String toString() {
        return "O portão da casa está " + estado.name().toLowerCase();
    }
}
