package com.bancoapp.request;


//REQUEST DE LOGIN DA APLICAÇÃO
//OS PARAMETROS PASSADOS(SENHA E CPF) SAO DIFERENTE POIS SERA FEITO A COMPARAÇÃO DO REQUEST COM O DB
public class LoginCliente{
	
	private String cpflogin;
	private String senhalogin;
	
	public String getCpflogin() {
		return cpflogin;
	}
	public String getSenhalogin() {
		return senhalogin;
	}

}
