package com.carlosandrade.microservice.loja.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.carlosandrade.microservice.loja.dto.CompraDTO;
import com.carlosandrade.microservice.loja.model.Compra;
import com.carlosandrade.microservice.loja.service.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {
	
	@Autowired
	private CompraService compraService;
	
	@RequestMapping("/{id}")
	public Compra getById(@PathVariable("id") Long id) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return compraService.getById(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public Compra realizaCompra(@RequestBody CompraDTO compra) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return compraService.realizaCompra(compra);
	}
	
	@GetMapping("/ola")
    public String ola() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "Ola\n" + authentication.toString();
    }
}
