package br.com.batistao.command.combuilder;

import java.util.Date;

/**
 * Created by ceb on 18/05/16.
 */
public class ClienteComBuilder {

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

    private ClienteComBuilder(Builder builder) {
        this.nome = builder.nome;
        this.dataNascimento = builder.dataNascimento;
        this.rg = builder.rg;
        this.cpf = builder.cpf;
        this.email = builder.email;
        this.logradouro = builder.logradouro;
        this.numero = builder.numero;
        this.complemento = builder.complemento;
        this.bairro = builder.bairro;
        this.cep = builder.cep;
        this.uf = builder.uf;
        this.cidade = builder.cidade;
        this.telefoneResidencial = builder.telefoneResidencial;
        this.telefoneCelular = builder.telefoneCelular;
    }

    public static class Builder {

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

        public Builder comNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder comDataNascimento(Date dataNascimento) {
            this.dataNascimento = dataNascimento;
            return this;
        }

        public Builder comRg(String rg) {
            this.rg = rg;
            return this;
        }

        public Builder comCpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public Builder comEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder noLogradouro(String logradouro) {
            this.logradouro = logradouro;
            return this;
        }

        public Builder noNumero(Integer numero) {
            this.numero = numero;
            return this;
        }

        public Builder noComplemento(String complemento) {
            this.complemento = complemento;
            return this;
        }

        public Builder noBairro(String bairro) {
            this.bairro = bairro;
            return this;
        }

        public Builder noCep(String cep) {
            this.cep = cep;
            return this;
        }

        public Builder naUf(String uf) {
            this.uf = uf;
            return this;
        }

        public Builder naCidade(String cidade) {
            this.cidade = cidade;
            return this;
        }

        public Builder comTelefoneResidencial(String telefoneResidencial) {
            this.telefoneResidencial = telefoneResidencial;
            return this;
        }

        public Builder comTelefoneCelular(String telefoneCelular) {
            this.telefoneCelular = telefoneCelular;
            return this;
        }

        public ClienteComBuilder build() {
            return new ClienteComBuilder(this);
        }
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
        return "ClienteComBuilder{" +
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
