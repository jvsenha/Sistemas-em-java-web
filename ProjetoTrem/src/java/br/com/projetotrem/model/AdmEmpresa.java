/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetotrem.model;

/**
 *
 * @author Aluno
 */
public class AdmEmpresa extends Usuario {

    private int idAdmEmpresa;
    private Empresa idEmp;

    public AdmEmpresa() {
    }

    public AdmEmpresa(int idAdmEmpresa) {
        this.idAdmEmpresa = idAdmEmpresa;
    }

    public AdmEmpresa(int idAdmEmpresa, Empresa idEmp) {
        this.idAdmEmpresa = idAdmEmpresa;
        this.idEmp = idEmp;
    }

    public int getIdAdmEmpresa() {
        return idAdmEmpresa;
    }

    public void setIdAdmEmpresa(int idAdmEmpresa) {
        this.idAdmEmpresa = idAdmEmpresa;
    }

    public Empresa getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(Empresa idEmp) {
        this.idEmp = idEmp;
    }

    
    
    
    
    
}
