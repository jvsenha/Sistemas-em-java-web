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
public class Cliente extends Usuario {
 private int idCliente;
 private String enderecoCliente;
 private String cidadeCliente;
 private String cpfCliente;
 private String cnpjCliente;

    public Cliente() {
    }

    public Cliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente(int idCliente, String enderecoCliente, String cidadeCliente, String cpfCliente, String cnpjCliente) {
        this.idCliente = idCliente;
        this.enderecoCliente = enderecoCliente;
        this.cidadeCliente = cidadeCliente;
        this.cpfCliente = cpfCliente;
        this.cnpjCliente = cnpjCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getCidadeCliente() {
        return cidadeCliente;
    }

    public void setCidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getCnpjCliente() {
        return cnpjCliente;
    }

    public void setCnpjCliente(String cnpjCliente) {
        this.cnpjCliente = cnpjCliente;
    }

  

    
   

   
}
