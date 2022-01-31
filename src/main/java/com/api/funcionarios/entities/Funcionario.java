package com.api.funcionarios.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "FUNCIONARIO")

public class Funcionario {
	
	
	//atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "SOBRE_NOME")
	private String sobreNome;
	
	@Column(name = "EMAIL")
	private String email;

	//construtor sem parâmetros
	public Funcionario() {
		
	}

	//construtor com parâmetros
	public Funcionario(String nome, String sobreNome, String email) {		
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.email = email;
	}

	//métodos getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id, nome, sobreNome);
	}

	//hashcode
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Objects.equals(sobreNome, other.sobreNome);
	}

	//toString
	@Override
	public String toString() {
		return "Nnome = " + nome + ", Sobre Nome = " + sobreNome + "Email = " + email;
	}	

}
