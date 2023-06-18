/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetoubeprof.dao;


import br.com.projetoubeprof.model.Area;
import br.com.projetoubeprof.model.Curso;
import br.com.projetoubeprof.util.ConnectionFactory;
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
public class CursoDAOImpl implements GenericDAO {

    private Connection conn;

public CursoDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
         Curso curso = (Curso) object;
        PreparedStatement stmt = null;
        String sql = "insert into curso(idarea, nomecurso) values (?,?);";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, curso.getAreaCurso().getIdArea());
            stmt.setString(2, curso.getNomeCurso());
            stmt.execute();
            return true;

        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar Curso! Erro: " + ex.getMessage());
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


    public List<Object> listarCA(int idObject)  {  
        List<Object>  cursos = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Curso curso = null;
        String sql = "select c.*, a.*  from curso c, area a where c.idarea=a.idarea and c.idarea=?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();

            while (rs.next()) {
                curso = new Curso();
                curso.setIdCurso(rs.getInt("idcurso"));
                curso.setAreaCurso(new Area(rs.getInt ("idarea")));
                curso.setNomeCurso(rs.getString("nomecurso"));
           
                cursos.add(curso);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar cursos DAO " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro" + e.getMessage());
                e.printStackTrace();
            }
        }
        return cursos;
    }
    @Override
    public List<Object> listar()  {  
        List<Object>  cursos = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select c.*, a.*  from curso c, area a where c.idarea=a.idarea";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Curso curso = new Curso();
                curso.setIdCurso(rs.getInt("idcurso"));
                curso.setAreaCurso(new Area(rs.getInt ("idarea")));
                curso.setNomeCurso(rs.getString("nomecurso"));
           
                cursos.add(curso);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar cursos DAO " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro" + e.getMessage());
                e.printStackTrace();
            }
        }
        return cursos;
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
    
     public Object listarcursoarea()  {  
        List<Object>  cursos = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select c.* from curso c, area a where c.idarea=a.idarea and a.idarea =?;";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Curso curso = new Curso();
                curso.setIdCurso(rs.getInt("idcurso"));
                curso.setAreaCurso(new Area(rs.getInt ("idarea")));
                curso.setNomeCurso(rs.getString("nomecurso"));
           
                cursos.add(curso);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar cursos DAO " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro" + e.getMessage());
                e.printStackTrace();
            }
        }
        return cursos;
    }

}
