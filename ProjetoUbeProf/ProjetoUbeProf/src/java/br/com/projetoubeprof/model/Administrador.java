/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoubeprof.model;

/**
 *
 * @author AlunoRemoto
 */
public class Administrador extends Usuario {
     private int idAdministrador;

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public Administrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public Administrador() {
    }
    
}
