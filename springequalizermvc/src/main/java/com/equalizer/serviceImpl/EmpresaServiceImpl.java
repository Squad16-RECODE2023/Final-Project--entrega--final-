package com.equalizer.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.equalizer.entities.Empresa;
import com.equalizer.repositories.EmpresaRepository;
import com.equalizer.service.EmpresaService;

@Service
public class EmpresaServiceImpl implements EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    public List<Empresa> getAllEmpresa() {
        return empresaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Empresa getEmpresaById(Long id) {
        return empresaRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Empresa saveEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    @Override
    @Transactional
    public Empresa updateEmpresa(Long id, Empresa empresaAtualizada) {
        Empresa empresaExistente = empresaRepository.findById(id).orElse(null);
        if (empresaExistente != null) {
            empresaExistente.setNome(empresaAtualizada.getNome());
            empresaExistente.setDescricao(empresaAtualizada.getDescricao());
            empresaExistente.setCnpj(empresaAtualizada.getCnpj());
            empresaExistente.setDepartamento(empresaAtualizada.getDepartamento());
            empresaExistente.setQtdfuncionarios(empresaAtualizada.getQtdfuncionarios());

            return empresaRepository.save(empresaExistente);
        } else {
            throw new RuntimeException("Empresa não encontrada com o ID: " + id);
        }
    }

    @Override
    public void deleteEmpresa(Long id) {
        empresaRepository.deleteById(id);
    }
}
