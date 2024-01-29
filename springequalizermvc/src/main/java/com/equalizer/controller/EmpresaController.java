package com.equalizer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.equalizer.entities.Empresa;
import com.equalizer.service.EmpresaService;

@Controller
@RequestMapping("/empresas")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @GetMapping
    public String listEmpresas(Model model) {
        List<Empresa> empresas = empresaService.getAllEmpresa();
        model.addAttribute("empresa", empresas);
        return "pages/empresas/listEmpresas";
    }

    @GetMapping("/novo")
    public String showForm(Model model) {
        Empresa empresa = new Empresa();
        model.addAttribute("empresa", empresa);
        return "pages/empresas/empresaForm";
    }

    @PostMapping("/save")
    public String saveEmpresa(@ModelAttribute("empresa") Empresa empresa) {
        empresaService.saveEmpresa(empresa);
        return "redirect:/empresas";
    }

    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable("id") Long id, Model model) {
        Empresa empresa = empresaService.getEmpresaById(id);
        model.addAttribute("empresa", empresa);
        return "pages/empresas/editarEmpresa";
    }

    @PostMapping("/update/{id}")
    public String updateEmpresa(@PathVariable("id") Long id, @ModelAttribute("empresa") Empresa empresa) {
        empresaService.updateEmpresa(id, empresa);
        return "redirect:/empresas";
    }

    @GetMapping("/deletar/{id}")
    public String deleteEmpresa(@PathVariable Long id) {
        empresaService.deleteEmpresa(id);
        return "redirect:/empresas";
    }
}
