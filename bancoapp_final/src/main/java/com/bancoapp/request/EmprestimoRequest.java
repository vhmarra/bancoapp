package com.bancoapp.request;


//REQUEST EMPRESTIMO BANCO

public class EmprestimoRequest {
    private double valor_emprestimo;
    private String cpf;

    public double getValor_emprestimo() {
        return valor_emprestimo;
    }

    public void setValor_emprestimo(double valor_emprestimo) {
        this.valor_emprestimo = valor_emprestimo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
