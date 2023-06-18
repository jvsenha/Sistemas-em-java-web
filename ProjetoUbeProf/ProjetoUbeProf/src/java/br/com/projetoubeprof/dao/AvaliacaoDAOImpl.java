/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetoubeprof.dao;

import br.com.projetoubeprof.model.Avaliacao;
import br.com.projetoubeprof.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaos
 */
public class AvaliacaoDAOImpl {

    private Connection conn;

    public AvaliacaoDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

      public Boolean cadastrar(Object object){
        Avaliacao avaliacao = (Avaliacao) object;
        ResultSet rs = null;
        PreparedStatement stmt = null;

        String sql = "insert into avalia (comentarioavaliacao, nomecliente, idcliente, idprofessor, notaavaliacao) values (?, ?, ?, ?, ?);";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, avaliacao.getComentarioAvaliacao());
            stmt.setString(2, avaliacao.getClienteAvaliacao());
            stmt.setInt(3, avaliacao.getIdCliente());
            stmt.setInt(4, avaliacao.getIdProfessor());
            stmt.setInt(5, avaliacao.getNotaAvaliacao());
            
            stmt.execute();
            return true;
        } catch (Exception ex) {

            System.out.println("Problemas ao cadastrar DenunciaDAO! Erro: " + ex.getMessage());
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
     
       public List<Object> listar(int idObject) {
        List<Object>  avaliacoes = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Avaliacao avaliacao = null;
        String sql = "select a.* from avalia a, usuario u, professor p, cliente c where a.idprofessor=p.idprofessor and a.idcliente=c.idcliente and c.idusuario=u.idusuario and p.idusuario=?;";

        try {
            stmt = conn.prepareStatement(sql);
             stmt.setInt(1, idObject);
            rs = stmt.executeQuery();

            while (rs.next()) {
                 avaliacao = new Avaliacao();
                 avaliacao.setIdAvaliacao(rs.getInt("idavaliacao"));
                avaliacao.setIdCliente(rs.getInt("idcliente"));
                avaliacao.setIdProfessor(rs.getInt("idprofessor"));
                avaliacao.setClienteAvaliacao(rs.getString("nomecliente"));
                avaliacao.setComentarioAvaliacao(rs.getString("comentarioavaliacao"));
                avaliacao.setNotaAvaliacao(rs.getInt("notaavaliacao"));
    

                avaliacoes.add(avaliacao);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar Avaliação DAO " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro" + e.getMessage());
                e.printStackTrace();
            }
        }
        return avaliacoes;
    }
      
} 
