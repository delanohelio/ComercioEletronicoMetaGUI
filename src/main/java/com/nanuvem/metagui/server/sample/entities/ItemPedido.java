package com.nanuvem.metagui.server.sample.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.nanuvem.metagui.server.api.EntityType;
import com.nanuvem.metagui.server.sample.repositories.ItemPedidoRepository;

@Entity
@EntityType(resource="itenspedido", repositoryType=ItemPedidoRepository.class)
public class ItemPedido {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private int quantidade;
	
	@OneToOne
	private Produto produto;
	
	@ManyToOne
	private Pedido pedido;

	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
