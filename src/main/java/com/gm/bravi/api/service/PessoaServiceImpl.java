package com.gm.bravi.api.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.gm.bravi.api.model.Pessoa;
import com.gm.bravi.api.repository.PessoaRepository;

@Service
@Transactional
public class PessoaServiceImpl implements PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Override
	public List<Pessoa> buscarTodos(){
		return (List<Pessoa>) pessoaRepository.findAll();
	}

	@Override
	public Pessoa salvarPessoa(Pessoa project) {
		try {
			project = pessoaRepository.save(project);		
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "xxxxxxxx");
		}
		return project;	
	}

	@Override
	public Pessoa atualizarPessoa(Pessoa pessoa) {
		Optional<Pessoa> pessoas = pessoaRepository.findById(pessoa.getId());
		if(pessoas.isPresent()) {
			Pessoa existingp = pessoas.get();
			existingp.setNome(pessoa.getNome());
			return pessoaRepository.save(existingp);
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "xxxxxxxx");
	}

	@Override
	public long excluirPessoa(Long id){
		Optional<Pessoa> projectDb = pessoaRepository.findById(id);
		if(projectDb.isPresent()) {
			pessoaRepository.delete(projectDb.get());
			return id;
		}
		return -1;
	}
}
