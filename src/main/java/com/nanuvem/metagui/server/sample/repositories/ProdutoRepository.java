package com.nanuvem.metagui.server.sample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nanuvem.metagui.server.sample.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
