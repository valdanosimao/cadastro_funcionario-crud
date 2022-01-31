package com.api.funcionarios.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.funcionarios.entities.Funcionario;

@Service
public interface FuncionarioService {
	
	List<Funcionario> getAllFuncionarios();
	void saveFuncionario(Funcionario funcionario);
	Funcionario getFuncionarioById(Long id);
	void deleteFuncionarioById(Long id);

}
