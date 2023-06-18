
package br.com.projetotrem.model;

public class Terminal {
    private int idTerm;
    private String nomeTerm;
    private String longTerm;
    private String latTerm;

    public Terminal() {
    }

    public Terminal(int idTerm) {
        this.idTerm = idTerm;
    }

    public Terminal(int idTerm, String nomeTerm, String longTerm, String latTerm) {
        this.idTerm = idTerm;
        this.nomeTerm = nomeTerm;
        this.longTerm = longTerm;
        this.latTerm = latTerm;
    }

    public int getIdTerm() {
        return idTerm;
    }

    public void setIdTerm(int idTerm) {
        this.idTerm = idTerm;
    }

    public String getNomeTerm() {
        return nomeTerm;
    }

    public void setNomeTerm(String nomeTerm) {
        this.nomeTerm = nomeTerm;
    }

    public String getLongTerm() {
        return longTerm;
    }

    public void setLongTerm(String longTerm) {
        this.longTerm = longTerm;
    }

    public String getLatTerm() {
        return latTerm;
    }

    public void setLatTerm(String latTerm) {
        this.latTerm = latTerm;
    }
    
}
