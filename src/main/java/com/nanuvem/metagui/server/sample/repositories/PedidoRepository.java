package com.nanuvem.metagui.server.sample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nanuvem.metagui.server.sample.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
