package com.nanuvem.metagui.server.sample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nanuvem.metagui.server.sample.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
