package com.gm.bravi.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gm.bravi.api.model.Pessoa;
import com.gm.bravi.api.service.PessoaService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/pessoa")
public class PessoaResource {
	

	@Autowired
	private PessoaService pessoaService;
	
	@GetMapping(value = "/listar")
	public ResponseEntity<List<Pessoa>> getAllProjects() {
		return ResponseEntity.ok().body(pessoaService.buscarTodos());
	}
	
	@PostMapping(value = "/salvar")
	public ResponseEntity<Pessoa> salvar(@RequestBody Pessoa pessoa) {
		return ResponseEntity.ok().body(pessoaService.salvarPessoa(pessoa));
	}
	
	@PostMapping(value = "/atualizar")
    public ResponseEntity<Pessoa> atualizarPessoa(@RequestBody Pessoa pessoa) {
        return ResponseEntity.ok().body(pessoaService.atualizarPessoa(pessoa));
    }
	
	@DeleteMapping(value = "/excluir")
	public ResponseEntity<Long> excluirPessoa(@RequestParam(name="idPessoa", value="pessoaId") long id) {
        return ResponseEntity.ok().body(pessoaService.excluirPessoa(id));
    }
}
