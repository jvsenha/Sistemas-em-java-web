/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.projetotrem.dao;

/**
 *
 * @author Aluno
 */
public interface GenericDAO {
   
    
    public Boolean cadastrar(Object object);

    public  Object listar();

    public Boolean excluir(int idObject);

    public Object carregar(int idObject);

    public Boolean alterar(Object object);

}


