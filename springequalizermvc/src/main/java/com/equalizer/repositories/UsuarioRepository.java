package com.equalizer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.equalizer.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	Usuario findByUsername(String username);

}
