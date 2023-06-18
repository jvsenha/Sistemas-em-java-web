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
public class Curso {
    private int idCurso;
    private String nomeCurso;
    private Area areaCurso;

    public Curso() {
    }

    public Curso(int idCurso) {
        this.idCurso = idCurso;
    }

    public Curso(int idCurso, String nomeCurso, Area areaCurso) {
        this.idCurso = idCurso;
        this.nomeCurso = nomeCurso;
        this.areaCurso = areaCurso;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Area getAreaCurso() {
        return areaCurso;
    }

    public void setAreaCurso(Area areaCurso) {
        this.areaCurso = areaCurso;
    }

  



}
