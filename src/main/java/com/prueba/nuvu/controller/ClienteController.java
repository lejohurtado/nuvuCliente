package com.prueba.nuvu.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.nuvu.entity.Cliente;
import com.prueba.nuvu.entity.ClientePK;
import com.prueba.nuvu.repository.ClienteRepository;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
	
	@Autowired
	ClienteRepository clienteRepository;

	@GetMapping("/status")
	public String status() {
		return "on line";
	}

	@PostMapping("/registro")
	public ResponseEntity<String> registroCliente(@RequestBody Cliente cliente) {
		clienteRepository.save(cliente);
		return new ResponseEntity<>("Sucessfull", HttpStatus.OK);
	}
	
	@GetMapping("/consulta")
	public Optional<Cliente> ConsultaCliente(@RequestParam(name="numero_identificacion", required=true) int numero_id
							, @RequestParam(name="tipo_identificacion", required=true) String tipo_id) {
		ClientePK clientePk = new ClientePK(tipo_id, numero_id);
		return clienteRepository.findById(clientePk);
	}
	
	@PostMapping("/actualiza")
	public ResponseEntity<String> actualizaCliente(@RequestBody Cliente cliente) {
		
		if(clienteRepository.findById(new ClientePK(cliente.getTipoIdentificacion(), cliente.getNumeroIdentificacion())) != null){
			clienteRepository.save(cliente);
			return new ResponseEntity<>("Sucessfull", HttpStatus.OK);
		}else {
			return new ResponseEntity<>("Cliente no encontrado", HttpStatus.NO_CONTENT);
		}
		
	}
	
}
