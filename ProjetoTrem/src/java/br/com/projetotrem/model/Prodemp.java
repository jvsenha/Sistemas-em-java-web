package br.com.projetotrem.model;

public class Prodemp {

    private Produto idProd;
    private Empresa idEmp;
    private String nomeProdEmp;
    private String tipoProdEmp;

    public Prodemp() {
    }

    public Prodemp(Produto idProd, Empresa idEmp, String nomeProdEmp, String tipoProdEmp) {
        this.idProd = idProd;
        this.idEmp = idEmp;
        this.nomeProdEmp = nomeProdEmp;
        this.tipoProdEmp = tipoProdEmp;
    }

    public Produto getIdProd() {
        return idProd;
    }

    public void setIdProd(Produto idProd) {
        this.idProd = idProd;
    }

    public Empresa getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(Empresa idEmp) {
        this.idEmp = idEmp;
    }

    public String getNomeProdEmp() {
        return nomeProdEmp;
    }

    public void setNomeProdEmp(String nomeProdEmp) {
        this.nomeProdEmp = nomeProdEmp;
    }

    public String getTipoProdEmp() {
        return tipoProdEmp;
    }

    public void setTipoProdEmp(String tipoProdEmp) {
        this.tipoProdEmp = tipoProdEmp;
    }

}
