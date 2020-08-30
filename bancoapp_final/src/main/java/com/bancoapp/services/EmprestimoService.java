package com.bancoapp.services;

import com.bancoapp.modelos.Cliente;
import com.bancoapp.modelos.Emprestimo;
import com.bancoapp.repositorios.EmprestimoRepository;
import com.bancoapp.request.EmprestimoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmprestimoService {
    private final EmprestimoRepository emprestimoRepository;

    @Autowired
    public EmprestimoService(EmprestimoRepository emprestimoRepository) {
        this.emprestimoRepository = emprestimoRepository;
    }
    
    //SE CLIENTE ESTA LOGADO SALVA EMPRESTIMO
    public Emprestimo save(EmprestimoRequest solicitarEmprestimo, Cliente cliente) throws Exception {
        Emprestimo emprestimo = new Emprestimo(solicitarEmprestimo.getValor_emprestimo(),cliente);
        if (cliente.getLogado().equals("true")) {
        	return emprestimoRepository.save(emprestimo);
        } 
        else {
        	throw new Exception("Cliente nao esta logado");
        }
		 

    }
}
