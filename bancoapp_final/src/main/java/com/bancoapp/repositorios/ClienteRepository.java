package com.bancoapp.repositorios;

import com.bancoapp.modelos.Cliente;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//REPOSITORIO DO CLIENTE E CRIA METODO PARA PROCURAR O CPF, SE NULL OPTIONAL RETORNAR UM EXCEPTION
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	Optional<Cliente> findByCpf(String cpf);
}
