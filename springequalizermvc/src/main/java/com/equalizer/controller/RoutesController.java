package com.equalizer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.equalizer.entities.Empresa;
import com.equalizer.service.EmpresaService;

@Controller
public class RoutesController {
    
    @Autowired
    private EmpresaService Service;
    
    @GetMapping("/")
    public String home(Model model) { 
        List<Empresa> empresa = Service.getAllEmpresa();
        model.addAttribute("empresa", empresa);
        return "pages/homepage";
    }
    
    @GetMapping("/login")
    public String login() { 
        return "pages/login";
    }
}
