
package br.com.projetotrem.model;

public class Termtrem {
    private int idTermtrem;
    private Trem idTrem;
    private String idTermdest;
    private String idTermsai;
    private Maquinista idMaq;
    private String vagaoTermtrem;
    private String tpcargaTermtrem;
    private String pesoTermtrem;
    private String linhaTermtrem;

    public Termtrem() {
    }

    public Termtrem(int idTermtrem) {
        this.idTermtrem = idTermtrem;
    }

    public Termtrem(int idTermtrem, Trem idTrem, String idTermdest, String idTermsai, Maquinista idMaq, String vagaoTermtrem, String tpcargaTermtrem, String pesoTermtrem, String linhaTermtrem) {
        this.idTermtrem = idTermtrem;
        this.idTrem = idTrem;
        this.idTermdest = idTermdest;
        this.idTermsai = idTermsai;
        this.idMaq = idMaq;
        this.vagaoTermtrem = vagaoTermtrem;
        this.tpcargaTermtrem = tpcargaTermtrem;
        this.pesoTermtrem = pesoTermtrem;
        this.linhaTermtrem = linhaTermtrem;
    }

    public int getIdTermtrem() {
        return idTermtrem;
    }

    public void setIdTermtrem(int idTermtrem) {
        this.idTermtrem = idTermtrem;
    }

    public Trem getIdTrem() {
        return idTrem;
    }

    public void setIdTrem(Trem idTrem) {
        this.idTrem = idTrem;
    }

    public String getIdTermdest() {
        return idTermdest;
    }

    public void setIdTermdest(String idTermdest) {
        this.idTermdest = idTermdest;
    }

    public String getIdTermsai() {
        return idTermsai;
    }

    public void setIdTermsai(String idTermsai) {
        this.idTermsai = idTermsai;
    }

    public Maquinista getIdMaq() {
        return idMaq;
    }

    public void setIdMaq(Maquinista idMaq) {
        this.idMaq = idMaq;
    }

    public String getVagaoTermtrem() {
        return vagaoTermtrem;
    }

    public void setVagaoTermtrem(String vagaoTermtrem) {
        this.vagaoTermtrem = vagaoTermtrem;
    }

    public String getTpcargaTermtrem() {
        return tpcargaTermtrem;
    }

    public void setTpcargaTermtrem(String tpcargaTermtrem) {
        this.tpcargaTermtrem = tpcargaTermtrem;
    }

    public String getPesoTermtrem() {
        return pesoTermtrem;
    }

    public void setPesoTermtrem(String pesoTermtrem) {
        this.pesoTermtrem = pesoTermtrem;
    }

    public String getLinhaTermtrem() {
        return linhaTermtrem;
    }

    public void setLinhaTermtrem(String linhaTermtrem) {
        this.linhaTermtrem = linhaTermtrem;
    }
    
}
