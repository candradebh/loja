package com.carlosandrade.microservice.loja.controller.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.carlosandrade.microservice.loja.dto.CompraDTO;
import com.carlosandrade.microservice.loja.dto.UsuarioDTO;
import com.carlosandrade.microservice.loja.model.Compra;
import com.carlosandrade.microservice.loja.model.Usuario;
import com.carlosandrade.microservice.loja.service.CompraService;

@RestController
@RequestMapping("/auth")
public class LoginController {
	
	

	@RequestMapping(method = RequestMethod.POST)
	public Authentication realizaCompra(@RequestBody UsuarioDTO usuario) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication;
	}
}
