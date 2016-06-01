package br.com.batistao.chainofresponsibility.loja;

/**
 * Created by ceb on 21/05/16.
 */
public class Produto {

    private String nome;
    private Double valor;

    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produto produto = (Produto) o;

        return !(nome != null ? !nome.equals(produto.nome) : produto.nome != null);

    }

    @Override
    public int hashCode() {
        return nome != null ? nome.hashCode() : 0;
    }
}
