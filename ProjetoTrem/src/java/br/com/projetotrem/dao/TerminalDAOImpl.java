/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetotrem.dao;

import br.com.projetotrem.model.Terminal;
import br.com.projetotrem.model.Terminal;
import br.com.projetotrem.model.Produto;
import br.com.projetotrem.model.Terminal;
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
public class TerminalDAOImpl implements GenericDAO {
    
    private Connection conn;

   public TerminalDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        Terminal terminal = (Terminal) object;
      PreparedStatement stmt = null;
       String sql = " insert into terminal ( nometerm, longterm, latterm) values (?,?,?) RETURNING idterm;";
        try{
         stmt = conn.prepareStatement(sql);
         stmt.setString(1, terminal.getNomeTerm());
         stmt.setString(2, terminal.getLongTerm());
         stmt.setString(3, terminal.getLatTerm());
         stmt.execute();    
         
          return true;
        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar Terminal! Erro: " + ex.getMessage());
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
         List<Object> terminais = new ArrayList<>();
         
         String sql="select t.* from terminal t;";
         
         try{
         stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Terminal terminal = new Terminal();
                terminal.setIdTerm(rs.getInt("idterm"));
                terminal.setNomeTerm(rs.getString("nometerm"));
                terminal.setLongTerm(rs.getString("longterm"));
                terminal.setLatTerm(rs.getString("latterm"));
                terminais.add(terminal);
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
        return terminais;
    }


    @Override
    public Boolean excluir(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object carregar(int idObject) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Terminal terminal = null;
        String sql = "select t.* from terminal t;";
    
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                terminal = new Terminal();
                terminal.setIdTerm(rs.getInt("IdTerm"));
                terminal.setNomeTerm(rs.getString("NomeTrem"));
                terminal.setLongTerm(rs.getString("LongTerm"));
                terminal.setLatTerm(rs.getString("LatTerm"));
               
               }
        } catch (SQLException ex) {
            System.out.println("Problemas ao carregar TerminalDAOImpl! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro: " + e.getMessage());
                e.printStackTrace();
            }
        }
        return terminal;

    }

    @Override
    public Boolean alterar(Object object) {
        Terminal terminal = (Terminal) object;
        PreparedStatement stmt = null;

        String sql = "update terminal set nometerm = ?, longterm = ?, latTerm = ? where idterm = ?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, terminal.getNomeTerm());
            stmt.setString(2, terminal.getLongTerm());
            stmt.setString(3, terminal.getLatTerm());
            stmt.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            System.out.println("Problemas ao alterar TerminalDAOImpl! Erro" + ex.getMessage());
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os perâmetros de conexão! Erro" + ex.getMessage());
            }
        }
    }
}
