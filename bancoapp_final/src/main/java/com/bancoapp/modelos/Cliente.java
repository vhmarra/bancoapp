package com.bancoapp.modelos;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long clienteid;

	
	//dados do cliente
	private String cpf;
	private String senha;
	private String nome_cliente;
	private String data_nascimento;
	private String score_credito;
	private String logado = "false";

	@OneToMany
	private List <Emprestimo> emprestimos;

	
	//CONSTRUTOR
	public Cliente(String cpf, String senha, String nome_cliente, String data_nascimento, String score_credito, String logado) {
		this.cpf = cpf;
		this.senha = senha;
		this.nome_cliente = nome_cliente;
		this.data_nascimento = data_nascimento;
		this.score_credito = score_credito;
		this.logado = logado;
	}

	public Cliente() {
	}

	//GETERS E SETERS
	public long getId() {
		return clienteid;
	}
	
	public void setId(long clienteid) {
		this.clienteid = clienteid;
	}
	
	public String getNome_cliente() {
		return nome_cliente;
	}
	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public String getLogado() {
		return logado;
	}

	public void setLogado(String logado) {
		this.logado = logado;
	}
}
