package br.com.casadocodigo.loja.conf;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {

	return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

	return new Class[] { AppWebConfiguration.class, JPAConfiguration.class, AmazonConfiguration.class };
    }

    @Override
    protected String[] getServletMappings() {
	/**
	 * Aqui onde voce diz qual eh o padrao de endereco que vai ser delegado para o
	 * Servlet do Spring MVC
	 */
	return new String[] { "/" };
    }

    @Override
    protected void customizeRegistration(Dynamic registration) {
	registration.setMultipartConfig(new MultipartConfigElement(""));
    }

}
