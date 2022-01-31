package com.api.funcionarios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.api.funcionarios.entities.Funcionario;
import com.api.funcionarios.services.FuncionarioService;

@Controller
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService fs;

	public FuncionarioController(FuncionarioService fs) {	
		this.setFs(fs);
	}	

	//exibir lista de funcionários
	@GetMapping("/")
	public String verPaginaInicial(Model model) {
		model.addAttribute("listaFuncionariosObj", fs.getAllFuncionarios());
		return "funcionario/index";
	}
	
	@GetMapping("/mostrarFormNovoFuncionario")
	public String mostrarNovoFuncionario(Model model) {
	//cria o atributo do modelo para vincular os dados do formulário
		Funcionario funcionario = new Funcionario();
		model.addAttribute("funcionarioObjForm", funcionario);
		return "funcionario/novo_funcionario";
		
	}
	
	@PostMapping("/salvarFuncionario")
	public String salvarFuncionario(@ModelAttribute("funcionarioObjSalvar") Funcionario funcionario) {
		//salva o funcionário no banco de dados
		fs.saveFuncionario(funcionario);
		return "redirect:/";
	
	}
	
	@GetMapping("mostrarFormAtualizado/{id}")
	public String mostrarFormAtualizado(@PathVariable (value = "id") Long id, Model model) {
		//obter funcionário do serviço
		Funcionario funcionario = fs.getFuncionarioById(id);
		
		//definir funcionário como um atributo de modelo para pré-preencher o formulário
		model.addAttribute("funcionarioAtualizadoObj", funcionario);
		return "funcionario/atualizar_funcionario";
	}
	

	@GetMapping("/deletarFuncionario/{id}")
	public String deletarFuncionario(@PathVariable("id")Long id) {
		//chamar método de exclusão de funcionário
		this.fs.deleteFuncionarioById(id);
		return "redirect:/";
	}
	
	
	
	
	//métodos getters and setters
	public FuncionarioService getFs() {
		return fs;
	}

	public void setFs(FuncionarioService fs) {
		this.fs = fs;
	}
	

}
