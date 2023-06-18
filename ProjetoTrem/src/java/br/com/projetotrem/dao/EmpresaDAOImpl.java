/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetotrem.dao;

import br.com.projetotrem.model.Empresa;
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
public class EmpresaDAOImpl implements GenericDAO {

    private Connection conn;

    public EmpresaDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        Empresa empresa = (Empresa) object;
        ResultSet rs = null;
        PreparedStatement stmt = null;
          String sql = "insert into empresa (telefoneemp, nomeemp, razaosocemp, cnpjemp, emailemp, ruaemp, cepemp, bairroemp, municipioemp, ufemp) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)RETURNING idemp ; ";
          try{
         stmt = conn.prepareStatement(sql);
         stmt.setString(1, empresa.getTelefoneEmp());
         stmt.setString(2, empresa.getNomeEmp());
         stmt.setString(3, empresa.getRazaosocEmp());
         stmt.setString(4, empresa.getCnpjEmp());
         stmt.setString(5, empresa.getEmailEmp());
         stmt.setString(6, empresa.getRuaEmp());
         stmt.setString(7, empresa.getCepEmp());
         stmt.setString(8, empresa.getBairroEmp());
         stmt.setString(9, empresa.getMunicipioEmp());
         stmt.setString(10, empresa.getUfEmp());
         stmt.execute();
          return true;
          
        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar Empresa! Erro: " + ex.getMessage());
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
        List<Object> empresas = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select e.* from empresa e;";

        try {
            stmt = this.conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Empresa empresa = new Empresa();

                empresa.setIdEmpresa(rs.getInt("idemp"));
                empresa.setTelefoneEmp(rs.getString("telefoneemp"));
                empresa.setNomeEmp(rs.getString("nomeemp"));
                empresa.setRazaosocEmp(rs.getString("razaosocemp"));
                empresa.setCnpjEmp(rs.getString("cnpjemp"));
                empresa.setEmailEmp(rs.getString("emailemp"));
                
               
                empresas.add(empresa);
            }
        }  catch (SQLException ex) {
            System.out.println("Erro ao listar insumos DAO " + ex.getMessage());
            ex.printStackTrace();
        }  finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro" + e.getMessage());
                e.printStackTrace();
            }
        }
        return empresas;

    }

    @Override
    public Boolean excluir(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object carregar(int idObject) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Empresa empresa = null;
        String sql = "select m.*, u.* from empresa e, maquinista m, usuario u where e.idemp = m.idemp and u.idusuario = m.idusuario;";
    
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                empresa = new Empresa();
                empresa.setIdEmpresa(rs.getInt("idempresa"));
                empresa.setTelefoneEmp(rs.getString("telefoneemp"));
                empresa.setNomeEmp(rs.getString("nomeemp"));
                empresa.setRazaosocEmp(rs.getString("razaosocemp"));
                empresa.setCnpjEmp(rs.getString("cnpjemp"));
                empresa.setEmailEmp(rs.getString("emailemp"));
                
               }
        } catch (SQLException ex) {
            System.out.println("Problemas ao carregar EmpresaDAOImpl! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro: " + e.getMessage());
                e.printStackTrace();
            }
        }
        return empresa;

    }
    

    @Override
    public Boolean alterar(Object object) {
       Empresa empresa = (Empresa) object;
        PreparedStatement stmt = null;

        String sql = "update empresa set telefoneemp = ?, nomeemp = ?, razaosocemp = ?, cnpjemp = ?, emailemp = ?, produtoemp = ? where idempresa =?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, empresa.getTelefoneEmp());
            stmt.setString(2, empresa.getNomeEmp());
            stmt.setString(3, empresa.getRazaosocEmp());
            stmt.setString(4, empresa.getCnpjEmp());
            stmt.setString(5, empresa.getEmailEmp());
            stmt.setInt(6, empresa.getIdEmpresa());
            stmt.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            System.out.println("Problemas ao alterar EmpresaDAOImpl! Erro" + ex.getMessage());
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
