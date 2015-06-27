package com.nanuvem.metagui.server.sample.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.nanuvem.metagui.server.api.EntityType;
import com.nanuvem.metagui.server.sample.repositories.VendedorRepository;

@Entity
@EntityType(resource="vendedores", repositoryType=VendedorRepository.class)
public class Vendedor {

	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	private String cpf;
	private Date nascimento;
	private String email;
	private String matricula;
	
	@OneToMany(mappedBy="vendedor", cascade = CascadeType.ALL)
	private List<Pedido> pedidosLancados;

	public List<Pedido> getPedidosLancados() {
		return pedidosLancados;
	}
	public void setPedidosLancados(List<Pedido> pedidosLancados) {
		this.pedidosLancados = pedidosLancados;
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
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}
