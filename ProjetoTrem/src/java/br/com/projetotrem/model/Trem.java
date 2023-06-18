
package br.com.projetotrem.model;

public class Trem {
    private int idTrem;
    private String nomeTrem;
    private String modeloTrem;
    private String tpcombTrem;
    private Empresa idEmpresa;

    public Trem() {
    }

    public Trem(int idTrem) {
        this.idTrem = idTrem;
    }

    public Trem(int idTrem, String nomeTrem, String modeloTrem, String tpcombTrem, Empresa idEmpresa) {
        this.idTrem = idTrem;
        this.nomeTrem = nomeTrem;
        this.modeloTrem = modeloTrem;
        this.tpcombTrem = tpcombTrem;
        this.idEmpresa = idEmpresa;
    }

    public int getIdTrem() {
        return idTrem;
    }

    public void setIdTrem(int idTrem) {
        this.idTrem = idTrem;
    }

    public String getNomeTrem() {
        return nomeTrem;
    }

    public void setNomeTrem(String nomeTrem) {
        this.nomeTrem = nomeTrem;
    }

    public String getModeloTrem() {
        return modeloTrem;
    }

    public void setModeloTrem(String modeloTrem) {
        this.modeloTrem = modeloTrem;
    }

    public String getTpcombTrem() {
        return tpcombTrem;
    }

    public void setTpcombTrem(String tpcombTrem) {
        this.tpcombTrem = tpcombTrem;
    }

    public Empresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Empresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    
}
