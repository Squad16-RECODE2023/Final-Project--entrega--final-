package com.equalizer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.equalizer.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	
	Role findByAuthority(String authority);

}
