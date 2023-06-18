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
public class ProfessorArea {
  private Area idArea;
private Professor idProfessor;  

    public ProfessorArea() {
    }

    public ProfessorArea(Area idArea) {
        this.idArea = idArea;
    }

    public ProfessorArea(Area idArea, Professor idProfessor) {
        this.idArea = idArea;
        this.idProfessor = idProfessor;
    }

    public Area getIdArea() {
        return idArea;
    }

    public void setIdArea(Area idArea) {
        this.idArea = idArea;
    }

    public Professor getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Professor idProfessor) {
        this.idProfessor = idProfessor;
    }
}
