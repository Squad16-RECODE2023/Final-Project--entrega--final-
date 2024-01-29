package com.equalizer.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    
	@Column(columnDefinition= "TEXT")
    private String descricao;
	
	private String cnpj;
	
    private String departamento;
 
    private int qtdfuncionarios;


    @ManyToMany   //Definição da relação e Formação da tabela intermediária
    @JoinTable (name ="usuario_empresa",
    joinColumns= @JoinColumn (name ="usuario_id"), inverseJoinColumns = @JoinColumn (name="empresa_id"))
    private Set<Usuario>usuarios = new HashSet<>();


    public Empresa() {

    }

    

	public Empresa(Long id, 
			String nome, String descricao, 
			String cnpj, String departamento, 
			int qtdfuncionarios,
			Set<Usuario> usuarios) {
		
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.cnpj = cnpj;
		this.departamento = departamento;
		this.qtdfuncionarios = qtdfuncionarios;
		this.usuarios = usuarios;
	}



	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public int getQtdfuncionarios() {
		return qtdfuncionarios;
	}


	public void setQtdfuncionarios(int qtdfuncionarios) {
		this.qtdfuncionarios = qtdfuncionarios;
	}


	public Set<Usuario> getUsuarios() {
		return usuarios;
	}


	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

  
 
  
    }

