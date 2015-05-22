package com.nanuvem.metagui.server.sample.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.nanuvem.metagui.server.api.EntityType;
import com.nanuvem.metagui.server.sample.repositories.ItemPedidoRepository;

@Entity
@EntityType(resource="itenspedido", repositoryType=ItemPedidoRepository.class)
public class ItemPedido {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private int quantidade;

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
