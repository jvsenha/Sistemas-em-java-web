/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoubeprof.model;

/**
 *
 * @author AlunoRemoto
 */
public class Area {
     private int idArea;
     private String nomeArea;

    public Area() {
    }

    public Area(int idArea) {
        this.idArea = idArea;
    }

    public Area(int idArea, String nomeArea) {
        this.idArea = idArea;
        this.nomeArea = nomeArea;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getNomeArea() {
        return nomeArea;
    }

    public void setNomeArea(String nomeArea) {
        this.nomeArea = nomeArea;
    }
     
}
