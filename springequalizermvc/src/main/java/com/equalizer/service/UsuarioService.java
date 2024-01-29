package com.equalizer.service;

import java.util.List;

import com.equalizer.dto.UsuarioDTO;
import com.equalizer.entities.Usuario;

public interface UsuarioService {

	List<UsuarioDTO> findAllUsers();
	
	void saveUser(UsuarioDTO userDTO);

	Usuario findUserByUsername(String username);
}
