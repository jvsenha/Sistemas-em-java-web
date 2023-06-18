/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetoubeprof.dao;

import br.com.projetoubeprof.model.Area;
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
public class AreaDAOImpl  {
     private Connection conn;

    public AreaDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
     public Boolean cadastrar(Object object) {
        Area area = (Area) object;
        ResultSet rs = null;
        PreparedStatement stmt = null;

        String sql = "insert into area (nomearea) values (?);";
               try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, area.getNomeArea());
            stmt.execute();
            return true;

        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar Area! Erro: " + ex.getMessage());
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
          public List<Object> listar() {

        List<Object> areas = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "select * from area order by idarea;";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                
                Area area = new Area();   
                area.setIdArea(rs.getInt("idarea"));
                area.setNomeArea(rs.getString("nomearea"));

                areas.add(area);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Area! Erro:" + ex.getMessage());
            ex.printStackTrace();

        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro" + e.getMessage());
                e.printStackTrace();
            }
        }
        return areas;
    }
         
}
    
