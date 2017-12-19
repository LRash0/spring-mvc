package br.com.casadocodigo.loja.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.casadocodigo.loja.dao.UserDAO;
import br.com.casadocodigo.loja.models.User;

@Controller
@Transactional
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private UserDAO userDAO;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView register() {
	ModelAndView modelAndView = new ModelAndView("register/register");
	modelAndView.addObject("user", new User());
	return modelAndView;

    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String save(User user) {
	userDAO.save(user);
	return "hello-world";
    }

}
