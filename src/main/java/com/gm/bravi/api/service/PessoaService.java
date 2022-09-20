package com.gm.bravi.api.service;

import java.util.List;

import com.gm.bravi.api.model.Pessoa;

public interface PessoaService {
	
	List<Pessoa> buscarTodos();

	Pessoa salvarPessoa(Pessoa project);

	Pessoa atualizarPessoa(Pessoa pessoa);

	long excluirPessoa(Long id);

	
}
