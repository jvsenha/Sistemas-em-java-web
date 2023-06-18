/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetoubeprof.model;

/**
 *
 * @author joaos
 */
public class CursoProfessor {
   private Curso idCurso;
   private Professor idProfessor;
   private String nomeCurso;
   private String nomeProfessor;
   private String cidadeProfessor;
   private Double avProfessor;
           
    public CursoProfessor() {
    }

    public CursoProfessor(Curso idCurso) {
        this.idCurso = idCurso;
    }

    public CursoProfessor(Professor idProfessor) {
        this.idProfessor = idProfessor;
    }

    public CursoProfessor(Curso idCurso, Professor idProfessor, String nomeCurso, String nomeProfessor, String cidadeProfessor, Double avProfessor) {
        this.idCurso = idCurso;
        this.idProfessor = idProfessor;
        this.nomeCurso = nomeCurso;
        this.nomeProfessor = nomeProfessor;
        this.cidadeProfessor = cidadeProfessor;
        this.avProfessor = avProfessor;
    }

    public Curso getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Curso idCurso) {
        this.idCurso = idCurso;
    }

    public Professor getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Professor idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getCidadeProfessor() {
        return cidadeProfessor;
    }

    public void setCidadeProfessor(String cidadeProfessor) {
        this.cidadeProfessor = cidadeProfessor;
    }

    public Double getAvProfessor() {
        return avProfessor;
    }

    public void setAvProfessor(Double avProfessor) {
        this.avProfessor = avProfessor;
    }

   
}
