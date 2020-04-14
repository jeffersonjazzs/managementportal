package br.com.managementportal.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.managementportal.daos.ProjetoDAO;
import br.com.managementportal.models.Projeto;
import br.com.managementportal.validation.ProjetoValidation;

@Controller
public class ProjetosController {
	
	@Autowired
	private ProjetoDAO projetoDao;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(new ProjetoValidation());
	}

	@RequestMapping("/projetos/form")
	public String form() {
		System.out.println("Cadastrando projetos");
		return "projetos/form";
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView gravar(@Valid Projeto projeto, BindingResult result, RedirectAttributes redirectAttributes) {
		if(result.hasErrors()){
			return new ModelAndView("projetos/form");
		}
	
		projetoDao.gravar(projeto);
		redirectAttributes.addFlashAttribute("sucesso", "Projeto cadastrado com sucesso!");
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView listar() {
		List<Projeto> projetos = projetoDao.listar();
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("projetos", projetos);
		return modelAndView;
	}

}