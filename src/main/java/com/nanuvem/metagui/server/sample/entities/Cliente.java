package com.nanuvem.metagui.server.sample.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.nanuvem.metagui.server.api.EntityType;
import com.nanuvem.metagui.server.sample.repositories.ClienteRepository;

@Entity
@EntityType(resource="clientes", repositoryType=ClienteRepository.class)
public class Cliente{

	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	private String cpf;
	private Date nascimento;
	private String email;
	private double credito;
	
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getCredito() {
		return credito;
	}
	public void setCredito(double credito) {
		this.credito = credito;
	}
	
}
