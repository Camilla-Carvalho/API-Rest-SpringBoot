package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/api/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("João");
		cliente1.setTelefone("34 99999-1111");
		cliente1.setEmail("joaodascouves@algaworks.com");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Maria");
		cliente2.setTelefone("11 77777-1111");
		cliente2.setEmail("mariadasilva@algaworks.com");
		
		var cliente3 = new Cliente();
		cliente3.setId(3L);
		cliente3.setNome("Camilla");
		cliente3.setTelefone("14 99900-3206");
		cliente3.setEmail("camillacarvahodejesus@gmail.com");
		
		return Arrays.asList(cliente1, cliente2, cliente3);
	}
	
}
