package br.com.casadocodigo.loja.controller;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.casadocodigo.loja.dao.ProductDAO;
import br.com.casadocodigo.loja.models.BookType;
import br.com.casadocodigo.loja.models.Prodcut;

@Controller
@Transactional
@RequestMapping("/produtos")
public class ProductsController {

    /*
     * @InitBinder protected void initBinder(WebDataBinder binder) {
     * binder.setValidator(new ProductValidator()); }
     */

    @Autowired
    private ProductDAO productDAO;

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView save(@Valid Prodcut product, BindingResult bindingResult,
	    RedirectAttributes redirectAttributes) {
	if (bindingResult.hasErrors()) {
	    return form(product);
	}
	System.out.println("Cadastrando produtos");
	productDAO.save(product);

	redirectAttributes.addFlashAttribute("sucesso", "Produto adicionado com sucesso");
	return new ModelAndView("redirect:produtos");
    }

    @RequestMapping(value = "/form")
    public ModelAndView form(Prodcut product) {
	ModelAndView modelAndView = new ModelAndView("produtos/form");
	modelAndView.addObject("types", BookType.values());
	return modelAndView;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView list() {
	ModelAndView modelAndView = new ModelAndView("produtos/list");
	modelAndView.addObject("products", productDAO.list());
	return modelAndView;
    }

}
