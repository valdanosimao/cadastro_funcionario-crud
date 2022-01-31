package com.api.funcionarios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.funcionarios.entities.Funcionario;
import com.api.funcionarios.repositories.FuncionarioRepositorio;

@Service
public class FuncionarioServiceImpl implements FuncionarioService{
	
	
	@Autowired
	private FuncionarioRepositorio fr;	

	//construtor sem parâmetros
	public FuncionarioServiceImpl() {
		
	}
	
	//construtor com parâmetros
	public FuncionarioServiceImpl(FuncionarioRepositorio fr) {		
		this.fr = fr;
	}

	@Override
	public List<Funcionario> getAllFuncionarios() {		
		return fr.findAll();
	}

	@Override
	public void saveFuncionario(Funcionario funcionario) {
		this.fr.save(funcionario);
		
	}

	@Override
	public Funcionario getFuncionarioById(Long id) {		
		return fr.getById(id);
	}

	@Override
	public void deleteFuncionarioById(Long id) {
		this.fr.deleteById(id);
		
	}

	public FuncionarioRepositorio getFr() {
		return fr;
	}
	

}
