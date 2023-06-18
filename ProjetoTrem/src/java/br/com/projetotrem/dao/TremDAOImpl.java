/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetotrem.dao;

import br.com.projetotrem.model.Empresa;
import br.com.projetotrem.model.Trem;
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
public class TremDAOImpl implements GenericDAO {

    private Connection conn;

    public TremDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        Trem trem = (Trem) object;
        ResultSet rs = null;
        PreparedStatement stmt = null;
        String sql = "insert into trem (nometrem, modelotrem, tpcombtrem, idemp)  values (?, ?, ?, ?);";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, trem.getNomeTrem());
            stmt.setString(2, trem.getModeloTrem());
            stmt.setString(3, trem.getTpcombTrem());
            stmt.setInt(4, trem.getIdEmpresa().getIdEmpresa());
            stmt.execute();
            return true;
        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar Trem! Erro: " + ex.getMessage());
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
        List<Object> trems = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select t.*, e.nomeemp from trem t, empresa e where e.idemp=t.idemp;";

        try {
            stmt = this.conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Trem trem = new Trem();

                trem.setIdEmpresa(new Empresa(rs.getString("nomeemp")));
                trem.setIdTrem(rs.getInt("idtrem"));
                trem.setModeloTrem(rs.getString("modelotrem"));
                trem.setNomeTrem(rs.getString("nometrem"));
                trem.setTpcombTrem(rs.getString("tpcombtrem"));

                trems.add(trem);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar Trems DAO " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro" + e.getMessage());
                e.printStackTrace();
            }
        }
        return trems;

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
    public List<Object> listartremadm (int idObject) {
        List<Object>  trems = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Trem trem = null;
        String sql = "select t.*, e.nomeemp from trem t, empresa e, admempresa ae where e.idemp=t.idemp and t.idemp=ae.idemp and ae.idusuario=?;";

        try {
            stmt = conn.prepareStatement(sql);
             stmt.setInt(1, idObject);
            rs = stmt.executeQuery();

            while (rs.next()) {
                 trem = new Trem();
         
                trem.setIdEmpresa(new Empresa(rs.getString("idemp")));
                trem.setIdTrem(rs.getInt("idtrem"));
                trem.setModeloTrem(rs.getString("modelotrem"));
                trem.setNomeTrem(rs.getString("nometrem"));
                trem.setTpcombTrem(rs.getString("tpcombtrem"));
    

                trems.add(trem);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar trems DAO " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro" + e.getMessage());
                e.printStackTrace();
            }
        }
        return trems;
    }
}
