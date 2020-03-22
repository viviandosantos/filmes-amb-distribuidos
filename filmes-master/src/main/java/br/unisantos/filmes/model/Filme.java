/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.filmes.model;

/**
 *
 * @author Ciro Cirne Trindade
 */
public class Filme {

    private String avaliador;
    private String titulo;
    private Float roteiro;
    private Float trilha;
    private Float interpretacao;
    private Float nota;
    private Boolean recomendo;

    public Filme() {
    }

    public String getAvaliador() {
        return avaliador;
    }

    public void setAvaliador(String avaliador) {
        this.avaliador = avaliador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public Float getRoteiro() {
        return roteiro;
    }

    public void setRoteiro(Float roteiro) {
        this.roteiro = roteiro;
    }

    public Float getTrilha() {
        return trilha;
    }

    public void setTrilha(Float trilha) {
        this.trilha = trilha;
    }

    public Float getInterpretacao() {
        return interpretacao;
    }

    public void setInterpretacao(Float interpretacao) {
        this.interpretacao = interpretacao;
    }

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }

    public Boolean getRecomendo() {
        return recomendo;
    }

    public void setRecomendo(Boolean recomendo) {
        this.recomendo = recomendo;
    }

}
