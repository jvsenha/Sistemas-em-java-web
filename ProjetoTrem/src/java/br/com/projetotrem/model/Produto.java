
package br.com.projetotrem.model;

public class Produto {
   private int idProd;
   private String nomeProd;
   private String tipoProd;

    public Produto() {
    }

    public Produto(int idProd) {
        this.idProd = idProd;
    }

    public Produto(int idProd, String nomeProd, String tipoProd) {
        this.idProd = idProd;
        this.nomeProd = nomeProd;
        this.tipoProd = tipoProd;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public String getTipoProd() {
        return tipoProd;
    }

    public void setTipoProd(String tipoProd) {
        this.tipoProd = tipoProd;
    }
   
}
