package br.com.casadocodigo.loja.conf;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {

	return new Class[] { SecurityConfiguration.class, AppWebConfiguration.class, JPAConfiguration.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

	return new Class[] {};
    }

    @Override
    protected String[] getServletMappings() {
	/**
	 * Aqui onde voce diz qual eh o padrao de endereco que vai ser delegado para o
	 * Servlet do Spring MVC
	 */
	return new String[] { "/" };
    }

}
