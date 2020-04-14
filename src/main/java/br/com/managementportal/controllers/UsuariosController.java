package br.com.managementportal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.managementportal.daos.UsuarioDAO;
import br.com.managementportal.models.Usuario;

@Controller
public class UsuariosController {
	@Autowired
	private UsuarioDAO usuarioDao;

	@RequestMapping("/usuarios/form")
	public String form() {
		System.out.println("Cadastrando usuarios");
		return "usuarios/form";
	}

	@RequestMapping(value = "/usuarios", method = RequestMethod.POST)
	public String gravar(Usuario usuario) {
		System.out.println(usuario);
		usuarioDao.gravar(usuario);
		return "usuarios/ok";
	}

}