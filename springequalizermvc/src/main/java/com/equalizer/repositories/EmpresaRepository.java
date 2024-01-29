package com.equalizer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.equalizer.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
