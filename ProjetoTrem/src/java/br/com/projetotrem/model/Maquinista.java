
package br.com.projetotrem.model;


public class Maquinista extends Usuario{
    private int idMaq;
    private Empresa idEmp;

    public Maquinista() {
    }

    public Maquinista(int idMaq) {
        this.idMaq = idMaq;
    }

    public Maquinista(int idMaq, Empresa idEmp) {
        this.idMaq = idMaq;
        this.idEmp = idEmp;
    }

    public int getIdMaq() {
        return idMaq;
    }

    public void setIdMaq(int idMaq) {
        this.idMaq = idMaq;
    }

    public Empresa getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(Empresa idEmp) {
        this.idEmp = idEmp;
    }
    
    
}
