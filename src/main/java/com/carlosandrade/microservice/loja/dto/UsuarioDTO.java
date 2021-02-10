package com.carlosandrade.microservice.loja.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UsuarioDTO {
	
	@JsonIgnore
	private Long id;
	
	private String email;
	
	private String senha;
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
