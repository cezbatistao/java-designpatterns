package br.com.batistao.funcionario;

/**
 * Created by ceb on 18/05/16.
 */
public class Funcionario {

    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Funcionario that = (Funcionario) o;

        return nome.equals(that.nome);

    }

    @Override
    public int hashCode() {
        return nome.hashCode();
    }
}
