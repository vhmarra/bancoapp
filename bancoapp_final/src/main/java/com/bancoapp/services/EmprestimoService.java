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
    
    //salva emprestimo
    public Emprestimo save(EmprestimoRequest solicitarEmprestimo, Cliente cliente){
        Emprestimo emprestimo = new Emprestimo(solicitarEmprestimo.getValor_emprestimo(),cliente);
        	return emprestimoRepository.save(emprestimo);
    }
}
