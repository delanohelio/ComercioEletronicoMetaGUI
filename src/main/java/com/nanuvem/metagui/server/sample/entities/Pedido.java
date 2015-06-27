package com.nanuvem.metagui.server.sample.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.nanuvem.metagui.server.api.EntityType;
import com.nanuvem.metagui.server.api.RelationshipType;
import com.nanuvem.metagui.server.sample.repositories.PedidoRepository;

@Entity
@EntityType(resource="pedidos", repositoryType=PedidoRepository.class)
public class Pedido {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private Date lancamento;
	
	@RelationshipType(composition=true)
	@OneToMany(mappedBy="pedido", cascade = CascadeType.ALL)
	private List<ItemPedido> itens;
	@ManyToOne
	private Vendedor vendedor;
	@ManyToOne
	private Cliente cliente;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<ItemPedido> getItens() {
		return itens;
	}
	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getLancamento() {
		return lancamento;
	}

	public void setLancamento(Date lancamento) {
		this.lancamento = lancamento;
	}
	
}
