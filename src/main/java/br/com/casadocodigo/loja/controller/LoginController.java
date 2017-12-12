package br.com.casadocodigo.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.casadocodigo.loja.dao.UserDAO;

@Controller
@RequestMapping("/auth")
public class LoginController {
    @Autowired
    private UserDAO userDAO;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public ModelAndView registration(Model model) {
	ModelAndView modelAndView = new ModelAndView("auth/registration");
	return modelAndView;
    }

}
