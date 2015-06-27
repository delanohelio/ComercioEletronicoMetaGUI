package com.nanuvem.metagui.server.sample.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.nanuvem.metagui.server.api.EntityType;
import com.nanuvem.metagui.server.sample.repositories.ClienteRepository;

@Entity
@EntityType(resource="clientes", repositoryType=ClienteRepository.class)
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="id")
public class Cliente{

	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	private String cpf;
	private Date nascimento;
	private String email;
	private double credito;
	
	@OneToMany(mappedBy="cliente", cascade = CascadeType.ALL)
	private List<Pedido> pedidos;
	
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
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
