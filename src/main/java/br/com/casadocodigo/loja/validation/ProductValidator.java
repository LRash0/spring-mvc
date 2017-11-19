package br.com.casadocodigo.loja.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.casadocodigo.loja.models.Prodcut;

public class ProductValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {

	return Prodcut.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

	ValidationUtils.rejectIfEmptyOrWhitespace(errors, "tittle", "field.required");
	ValidationUtils.rejectIfEmptyOrWhitespace(errors, "description", "field.required");

	Prodcut prodcut = (Prodcut) target;

	if (prodcut.getPages() == 0) {
	    errors.rejectValue("pages", "field.required");
	}

    }

}
