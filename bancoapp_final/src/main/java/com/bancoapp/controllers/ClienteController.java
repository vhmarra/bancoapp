package com.bancoapp.controllers;
import com.bancoapp.modelos.Emprestimo;
import com.bancoapp.request.CadastroRequest;
import com.bancoapp.request.EmprestimoRequest;
import com.bancoapp.request.LoginCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bancoapp.modelos.Cliente;
import com.bancoapp.services.ClienteService;
import com.bancoapp.services.EmprestimoService;



//MAPEAMENTO DAS ENDPOINTS

@Controller
@RequestMapping("/inicio")
public class ClienteController{

	private final ClienteService cliente_service;
	

	@Autowired
	public ClienteController(ClienteService cliente_service) {
		this.cliente_service = cliente_service;
	}
	
	@PostMapping("/cadastro")
	public ResponseEntity<Cliente> formulario_cadastro(@RequestBody CadastroRequest cadastroCliente) {
		return new ResponseEntity<Cliente>(cliente_service.save(cadastroCliente), HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ResponseEntity<Void> formulario_login(@RequestBody LoginCliente loginCliente) throws Exception {
		cliente_service.login(loginCliente);
		return new ResponseEntity<>(HttpStatus.OK) ;
	}

	@PostMapping("/emprestimo")
	public ResponseEntity<Emprestimo> formulario_emprestimo(@RequestBody EmprestimoRequest solicitarEmprestimo) throws Exception {
		cliente_service.emprestimo(solicitarEmprestimo);
		return new ResponseEntity<>(cliente_service.emprestimo(solicitarEmprestimo), HttpStatus.OK);
	}
		
}
	

