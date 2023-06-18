
package br.com.projetotrem.model;


public class Empresa {
   private int idEmpresa;
   private String telefoneEmp;
   private String nomeEmp;
   private String razaosocEmp;
   private String cnpjEmp;
   private String emailEmp;
   private String ruaEmp;
   private String cepEmp;
   private String bairroEmp;
   private String municipioEmp;
   private String ufEmp;
   

    public Empresa() {
    }

    public Empresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Empresa(String nomeEmp) {
        this.nomeEmp = nomeEmp;
    }

    public Empresa(int idEmpresa, String telefoneEmp, String nomeEmp, String razaosocEmp, String cnpjEmp, String emailEmp, String ruaEmp, String cepEmp, String bairroEmp, String municipioEmp, String ufEmp) {
        this.idEmpresa = idEmpresa;
        this.telefoneEmp = telefoneEmp;
        this.nomeEmp = nomeEmp;
        this.razaosocEmp = razaosocEmp;
        this.cnpjEmp = cnpjEmp;
        this.emailEmp = emailEmp;
        this.ruaEmp = ruaEmp;
        this.cepEmp = cepEmp;
        this.bairroEmp = bairroEmp;
        this.municipioEmp = municipioEmp;
        this.ufEmp = ufEmp;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getTelefoneEmp() {
        return telefoneEmp;
    }

    public void setTelefoneEmp(String telefoneEmp) {
        this.telefoneEmp = telefoneEmp;
    }

    public String getNomeEmp() {
        return nomeEmp;
    }

    public void setNomeEmp(String nomeEmp) {
        this.nomeEmp = nomeEmp;
    }

    public String getRazaosocEmp() {
        return razaosocEmp;
    }

    public void setRazaosocEmp(String razaosocEmp) {
        this.razaosocEmp = razaosocEmp;
    }

    public String getCnpjEmp() {
        return cnpjEmp;
    }

    public void setCnpjEmp(String cnpjEmp) {
        this.cnpjEmp = cnpjEmp;
    }

    public String getEmailEmp() {
        return emailEmp;
    }

    public void setEmailEmp(String emailEmp) {
        this.emailEmp = emailEmp;
    }

    public String getRuaEmp() {
        return ruaEmp;
    }

    public void setRuaEmp(String ruaEmp) {
        this.ruaEmp = ruaEmp;
    }

    public String getCepEmp() {
        return cepEmp;
    }

    public void setCepEmp(String cepEmp) {
        this.cepEmp = cepEmp;
    }

    public String getBairroEmp() {
        return bairroEmp;
    }

    public void setBairroEmp(String bairroEmp) {
        this.bairroEmp = bairroEmp;
    }

    public String getMunicipioEmp() {
        return municipioEmp;
    }

    public void setMunicipioEmp(String municipioEmp) {
        this.municipioEmp = municipioEmp;
    }

    public String getUfEmp() {
        return ufEmp;
    }

    public void setUfEmp(String ufEmp) {
        this.ufEmp = ufEmp;
    }

}
