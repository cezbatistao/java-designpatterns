package br.com.batistao.command.sembuilder;

import java.util.Date;

/**
 * Created by ceb on 18/05/16.
 */
public class ClienteSemBuilder {

    private String nome;
    private Date dataNascimento;
    private String rg;
    private String cpf;
    private String email;

    private String logradouro;
    private Integer numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String uf;
    private String cidade;

    private String telefoneResidencial;
    private String telefoneCelular;

    public ClienteSemBuilder(String nome, Date dataNascimento, String rg, String cpf, String email, String logradouro, Integer numero,
                             String complemento, String bairro, String cep, String uf, String cidade, String telefoneResidencial, String telefoneCelular) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.email = email;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.telefoneResidencial = telefoneResidencial;
        this.telefoneCelular = telefoneCelular;
    }

    public ClienteSemBuilder(String nome, Date dataNascimento, String rg, String cpf, String email, String logradouro, Integer numero,
                             String complemento, String bairro, String cep, String uf, String cidade, String telefoneCelular) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.email = email;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.telefoneCelular = telefoneCelular;
    }

    public ClienteSemBuilder(String nome, Date dataNascimento, String cpf, String email, String logradouro, Integer numero,
                             String complemento, String bairro, String cep, String uf, String cidade, String telefoneResidencial, String telefoneCelular) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.email = email;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.telefoneResidencial = telefoneResidencial;
        this.telefoneCelular = telefoneCelular;
    }

    public ClienteSemBuilder(String nome, Date dataNascimento, String cpf, String email, String logradouro, Integer numero,
                             String complemento, String bairro, String cep, String uf, String cidade, String telefoneCelular) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.email = email;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.telefoneCelular = telefoneCelular;
    }

    public ClienteSemBuilder(String nome, Date dataNascimento, String rg, String cpf, String email, String logradouro, Integer numero,
                             String bairro, String cep, String uf, String cidade, String telefoneCelular) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.email = email;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.telefoneCelular = telefoneCelular;
    }

    public ClienteSemBuilder(String nome, Date dataNascimento, String cpf, String email, String logradouro, Integer numero,
                             String bairro, String cep, String uf, String cidade, String telefoneCelular) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.email = email;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.telefoneCelular = telefoneCelular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefoneResidencial() {
        return telefoneResidencial;
    }

    public void setTelefoneResidencial(String telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    @Override
    public String toString() {
        return "ClienteSemBuilder{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", rg='" + rg + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numero=" + numero +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cep='" + cep + '\'' +
                ", uf='" + uf + '\'' +
                ", cidade='" + cidade + '\'' +
                ", telefoneResidencial='" + telefoneResidencial + '\'' +
                ", telefoneCelular='" + telefoneCelular + '\'' +
                '}';
    }
}
