package br.com.casadocodigo.loja.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Prodcut {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tittle;
    @Lob
    private String description;
    private int pages;

    @ElementCollection
    private List<Price> prices = new ArrayList<Price>();

    public String getTittle() {
	return tittle;
    }

    public void setTittle(String tittle) {
	this.tittle = tittle;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public int getPages() {
	return pages;
    }

    public void setPages(int pages) {
	this.pages = pages;
    }

    public List<Price> getPrices() {
	return prices;
    }

    public void setPrices(List<Price> prices) {
	this.prices = prices;
    }
}
