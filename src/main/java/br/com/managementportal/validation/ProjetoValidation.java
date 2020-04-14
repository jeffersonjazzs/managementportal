package br.com.managementportal.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.managementportal.models.Projeto;

public class ProjetoValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Projeto.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "nome", "field.required");
		ValidationUtils.rejectIfEmpty(errors, "gestor", "field.required");

	}

}