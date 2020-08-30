package com.bancoapp.services;
import com.bancoapp.modelos.Emprestimo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bancoapp.modelos.Cliente;
import com.bancoapp.repositorios.ClienteRepository;
import com.bancoapp.request.CadastroRequest;
import com.bancoapp.request.EmprestimoRequest;
import com.bancoapp.request.LoginCliente;

@Service
public class ClienteService {
	private final ClienteRepository clienterepository;
	private final EmprestimoService emprestimoService;

	//CONSTRUTOR
	@Autowired
	public ClienteService(ClienteRepository clienterepository, EmprestimoService emprestimoService) {
		this.clienterepository = clienterepository;
		this.emprestimoService = emprestimoService;
	}
	
	//FAZ LOGIN DO CLIENTE SE OS DADOS BATEREM E SETA A FLAG LOGADO PRA TRUE
	public void login(LoginCliente loginCliente) throws Exception {
		Cliente cliente = clienterepository.findByCpf(loginCliente.getCpflogin()).orElseThrow(() -> new Exception("cpf nao encontrado"));
		if (cliente.getSenha().equals(loginCliente.getSenhalogin())){
			cliente.setLogado("true");
		}
		clienterepository.save(cliente);
	}

	//SALVA CADASTRO DO CLIENTE NO BANCO
	public Cliente save(CadastroRequest cadastroCliente){
		Cliente cliente = new Cliente(cadastroCliente.getCpf(),cadastroCliente.getSenha(),cadastroCliente.getNome_cliente(),cadastroCliente.getData_nascimento(),cadastroCliente.getScore_credito(),"false");
		return clienterepository.save(cliente);
	}
	
	//SOLICITA EMPRESTIMO SE CLIENTE ESTIVER CADASTRADO E LOGADO
	public Emprestimo emprestimo(EmprestimoRequest solicitarEmprestimo) throws Exception {
		Cliente cliente = clienterepository.findByCpf(solicitarEmprestimo.getCpf()).orElseThrow(() -> new Exception("cpf nao encontrado"));
		//Registra o emprestimo somente se o cliente estiver logado
		if (cliente.getLogado().equals("true")) {
			return emprestimoService.save(solicitarEmprestimo, cliente);
		} else {
			throw new Exception("Cliente deslogado");
		}
	}
}
