
package br.com.projetotrem.model;

public class Administrador extends Usuario {
    private int idAdmin;

    public Administrador() {
    }

    public Administrador(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }
    
    
}
