package com.bancoapp.repositorios;

import com.bancoapp.modelos.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmprestimoRepository extends JpaRepository<Emprestimo, String> {

}
