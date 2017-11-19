package br.com.casadocodigo.loja.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.casadocodigo.loja.models.Prodcut;

@Repository
public class ProductDAO {

    @PersistenceContext
    private EntityManager manager;

    public void save(Prodcut product) {
	manager.persist(product);

    }

    public List<Prodcut> list() {
	return manager.createQuery("select distinct(p) from Prodcut p join fetch p.prices", Prodcut.class)
		.getResultList();
	// return manager.createQuery("select p from Prodcut p join p.prices",
	// Prodcut.class).getResultList();
    }

}
