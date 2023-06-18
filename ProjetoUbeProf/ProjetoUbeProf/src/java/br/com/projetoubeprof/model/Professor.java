
package br.com.projetoubeprof.model;


public class Professor extends Usuario {
 private int idProfessor;
 private String cidadeProfessor;
private String cpfProfessor;

    public Professor() {
    }

    public Professor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public Professor(int idProfessor, String cidadeProfessor, String cpfProfessor) {
        this.idProfessor = idProfessor;
        this.cidadeProfessor = cidadeProfessor;
        this.cpfProfessor = cpfProfessor;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getCidadeProfessor() {
        return cidadeProfessor;
    }

    public void setCidadeProfessor(String cidadeProfessor) {
        this.cidadeProfessor = cidadeProfessor;
    }

    public String getCpfProfessor() {
        return cpfProfessor;
    }

    public void setCpfProfessor(String cpfProfessor) {
        this.cpfProfessor = cpfProfessor;
    }

  

    
  


}
