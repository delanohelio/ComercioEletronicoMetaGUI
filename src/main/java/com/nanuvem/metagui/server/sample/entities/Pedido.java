package com.nanuvem.metagui.server.sample.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.nanuvem.metagui.server.api.EntityType;
import com.nanuvem.metagui.server.sample.repositories.PedidoRepository;

@Entity
@EntityType(resource="pedidos", repositoryType=PedidoRepository.class)
public class Pedido {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private Date lancamento;
	
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
