package com.bancoapp.modelos;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Emprestimo implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	
	//Dados do emprestimo
	private long emprestimo_id;
	private double valor_emprestimo;
	
	@ManyToOne
	@JoinColumn(name = "clienteid")
	private Cliente cliente;


	public Emprestimo() {
	}

	public Emprestimo(double valor_emprestimo, Cliente cliente) {
		this.valor_emprestimo = valor_emprestimo;
		this.cliente = cliente;
	}

	//GETERS E SETERS
	public Cliente getCpf() {
		return cliente ;
	}
	public void setCpf(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getValor_emprestimo() {
		return valor_emprestimo;
	}
	public void setValor_emprestimo(double valor_emprestimo) {
		this.valor_emprestimo = valor_emprestimo;
	}
	
	
}