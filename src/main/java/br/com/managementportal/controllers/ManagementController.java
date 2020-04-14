package br.com.managementportal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManagementController {

	@RequestMapping("/")
	public String index() {
		System.out.println("Index");
		return "index";
	}

}
