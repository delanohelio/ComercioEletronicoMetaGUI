package com.nanuvem.metagui.server.sample.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.nanuvem.metagui.server.api.EntityType;
import com.nanuvem.metagui.server.api.RelationshipType;
import com.nanuvem.metagui.server.sample.repositories.FornecedorRepository;

@Entity
@EntityType(resource="fornecedores", repositoryType=FornecedorRepository.class)
public class Fornecedor {

	@Id
	@GeneratedValue
	private Long id;
	
	private String nomeFantasia;
	private String razaoSocial;
	private String cnpj;
	private String endereco;
	private String cep;
	
	@RelationshipType(composition=true)
	@OneToMany(mappedBy="fornecedor")
	private List<Produto> produtosFornecidos;
	
	public List<Produto> getProdutosFornecidos() {
		return produtosFornecidos;
	}
	public void setProdutosFornecidos(List<Produto> produtosFornecidos) {
		this.produtosFornecidos = produtosFornecidos;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
}
