/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetotrem.dao;

import br.com.projetotrem.model.Produto;
import br.com.projetotrem.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ProdutoDAOImpl implements GenericDAO{



   
    private Connection conn;

   public ProdutoDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
      Produto produto = (Produto) object;
      PreparedStatement stmt = null;
       String sql = " insert into produto ( nomeprod, tipoprod) values (?,?) RETURNING idprod;";
        try{
         stmt = conn.prepareStatement(sql);
         stmt.setString(1, produto.getNomeProd());
         stmt.setString(2, produto.getTipoProd() );
         stmt.execute();    
         
          return true;
        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar produtos! Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar a conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }



       }
              }

    @Override
    public Object listar() {
      PreparedStatement stmt= null;
         ResultSet rs = null;
         List<Object> produtos = new ArrayList<>();
         
         String sql="select p.* from produto p;";
         
         try{
         stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto();
                produto.setIdProd(rs.getInt("idprod"));
                produto.setNomeProd(rs.getString("nomeprod"));
                produto.setTipoProd(rs.getString("tipoprod"));
                produtos.add(produto);
            }
         }
         catch (SQLException ex) {
            System.out.println("Problemas ao listar produtos!\n ERROR: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar parametros da conexao!\n ERROR: " + ex.getMessage());
                ex.printStackTrace();
            }

        }
        return produtos;
    }

    @Override
    public Boolean excluir(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object carregar(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean alterar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
