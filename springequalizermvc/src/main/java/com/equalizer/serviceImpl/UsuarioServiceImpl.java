package com.equalizer.serviceImpl;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.equalizer.dto.UsuarioDTO;
import com.equalizer.entities.Role;
import com.equalizer.entities.Usuario;
import com.equalizer.repositories.RoleRepository;
import com.equalizer.repositories.UsuarioRepository;
import com.equalizer.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService, UserDetailsService {
	
	@Autowired
	private UsuarioRepository userRepository;
	
	@Autowired 
	private PasswordEncoder passwordEncoder;

	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public List<UsuarioDTO> findAllUsers() {
		List<Usuario> users = userRepository.findAll();
		
		return users.stream().map((user) -> mapToUserDto(user)).collect(Collectors.toList());
	}
	
	private UsuarioDTO mapToUserDto(Usuario user) { 
		UsuarioDTO userDto = new UsuarioDTO();
		userDto.setUsername(user.getUsername());
		userDto.setNome(user.getNome());
		userDto.setCpf(user.getCpf());
        userDto.setTelefone(user.getTelefone());
        userDto.setNascimento(user.getNascimento());
		userDto.setEmail(user.getEmail());
		userDto.setPassword(user.getPassword());
		return userDto;
	}

	@Override
	public void saveUser(UsuarioDTO userDTO) {
		Usuario user = new Usuario();
		user.setUsername(userDTO.getUsername());
		user.setNome(userDTO.getNome());
		user.setCpf(userDTO.getCpf());
        user.setTelefone(userDTO.getTelefone());
        user.setNascimento(userDTO.getNascimento());
		user.setEmail(userDTO.getEmail());
		user.setPassword(passwordEncoder.encode(userDTO.getPassword()));
		
		Role role = roleRepository.findByAuthority("ROLE_COMUM");
		
		if (role == null) { 
			throw new IllegalStateException("'ROLE_COMUM' não encontrada.");
		}
		
		user.setRoles((List<Role>) Arrays.asList(role));
		userRepository.save(user);
		
	}

	@Override
	public Usuario findUserByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario user = userRepository.findByUsername(username);
		
		if (user != null) { 
			return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
					mapRolesToAuthorities(user.getRoles()));
		} else { 
			throw new UsernameNotFoundException("Username ou senha inválidos.");
		}
	}
	
	private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
		Collection<? extends GrantedAuthority> mapRoles = roles.stream()
				.map(role -> new SimpleGrantedAuthority(role.getAuthority())).collect(Collectors.toList());
		return mapRoles;
	}


}
