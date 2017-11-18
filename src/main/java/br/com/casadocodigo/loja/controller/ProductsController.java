package br.com.casadocodigo.loja.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.casadocodigo.loja.dao.ProductDAO;
import br.com.casadocodigo.loja.models.Prodcut;

@Controller
@Transactional
public class ProductsController {

    @Autowired
    private ProductDAO productDAO;

    @RequestMapping("/produtos")
    public String save(Prodcut product) {
	System.out.println("Cadastrando produtos");
	productDAO.save(product);
	return "produtos/ok";
    }

    @RequestMapping("/produtos/form")
    public String form() {
	return "produtos/form";
    }

}
