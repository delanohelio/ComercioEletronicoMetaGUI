package com.nanuvem.metagui.server.sample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nanuvem.metagui.server.sample.entities.Vendedor;

public interface VendedorRepository extends JpaRepository<Vendedor, Long>{

}
