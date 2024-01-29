package com.equalizer.service;

import java.util.List;

import com.equalizer.entities.Empresa;

public interface EmpresaService {
	
	List<Empresa> getAllEmpresa();

	Empresa getEmpresaById(Long id);

	Empresa saveEmpresa(Empresa empresa);
	
	Empresa updateEmpresa(Long id, Empresa empresaAtualizada);

	void deleteEmpresa(Long id);


}
