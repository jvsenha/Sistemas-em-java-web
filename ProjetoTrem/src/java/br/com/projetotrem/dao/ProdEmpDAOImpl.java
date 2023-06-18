/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetotrem.dao;

import br.com.projetotrem.model.Empresa;
import br.com.projetotrem.model.Prodemp;
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
public class ProdEmpDAOImpl implements GenericDAO {

    private Connection conn;

    public ProdEmpDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        Prodemp prodemp = (Prodemp) object;
        PreparedStatement stmt = null;

        String sql = "insert into prodemp (idemp, idprod) values (?,?) RETURNING idprod;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, prodemp.getIdEmp().getIdEmpresa());
            stmt.setInt(2, prodemp.getIdProd().getIdProd());
            stmt.execute();
            return true;
        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar Prodemp! Erro: " + ex.getMessage());
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    public List<Object> listarPE (int idObject) {
        List<Object> prodemps = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Prodemp prodemp = null;
        String sql = "select pe.*,p.* from prodemp pe, produto p, admempresa ae where pe.idprod=p.idprod and pe.idemp=ae.idemp and ae.idusuario=?;";

        try {
            stmt = conn.prepareStatement(sql);
  stmt.setInt(1, idObject);
            rs = stmt.executeQuery();

            while (rs.next()) {
                prodemp = new Prodemp();

                prodemp.setIdProd(new Produto(rs.getInt("idprod")));
                prodemp.setIdEmp(new Empresa(rs.getInt("idemp")));
                prodemp.setNomeProdEmp(rs.getString("nomeprod")); 
                prodemp.setTipoProdEmp(rs.getString("tipoprod")); 

                prodemps.add(prodemp);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar prods DAO " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro" + e.getMessage());
                e.printStackTrace();
            }
        }
        return prodemps;
    }
}
