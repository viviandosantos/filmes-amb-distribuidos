/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.filmes.control;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

import br.unisantos.filmes.model.Filme;

/**
 *
 * @author Ciro Cirne Trindade
 */
@ManagedBean
@RequestScoped
public class FilmeBean {
	
    private Filme filme = new Filme();
    
    public FilmeBean() {
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }


    public String calcularNota() {        
        filme.setNota((filme.getRoteiro() + filme.getTrilha() + filme.getInterpretacao()) / 3);
        return "/nota";
    }
    
    public String[] getListaDeFilmes() {
        String[] filmes = { "Vice", "Nasce uma Estrela", 
                            "Bohemian Rhapsody", "Pantera Negra",
                            "Roma", "Green Book - O Guia" };
        return filmes;
    }
        
    public List<SelectItem> getListaDeAvaliacoes() {
        List<SelectItem> avals = new ArrayList<>();
        avals.add(new SelectItem(10, "Excelente"));
        avals.add(new SelectItem(7.5f, "Bom"));
        avals.add(new SelectItem(5, "Razoável"));
        avals.add(new SelectItem(1, "Ruim"));
        return avals;
    }

}
