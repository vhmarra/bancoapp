package com.bancoapp.request;

//REQUEST DE CADASTRO DO CLIENTE NO BANCO

public class CadastroRequest {
    private String cpf;
    private String senha;
    private String nome_cliente;
    private String data_nascimento;
    private String score_credito;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getScore_credito() {
        return score_credito;
    }

    public void setScore_credito(String score_credito) {
        this.score_credito = score_credito;
    }
}
