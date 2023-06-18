/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoubeprof.dao;

import br.com.projetoubeprof.model.Usuario;
import br.com.projetoubeprof.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author AlunoRemoto
 */
public class UsuarioDAOImpl {

    private Connection conn;

    public UsuarioDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    public Integer cadastrar(Usuario usuario) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Integer idUsuario = null;
        String sql = "insert into usuario(nomeusuario, emailusuario, senhausuario, loginusuario, telefoneusuario, tipousuario, statususuario )values (?, ?, ?, ?, ?, ?, ?) returning idusuario;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getNomeUsuario());
            stmt.setString(2, usuario.getEmailUsuario());
            stmt.setString(3, usuario.getSenhaUsuario());
            stmt.setString(4, usuario.getLoginUsuario());
            stmt.setString(5, usuario.getTelefoneUsuario());
            stmt.setString(6, usuario.getTipoUsuario());
            stmt.setInt(7, usuario.getStatusUsuario());
            rs = stmt.executeQuery();

            if (rs.next()) {
                idUsuario = rs.getInt("idusuario");
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao cadastrar Usuario! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return idUsuario;
    }

    public Object listar() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    public Boolean excluir(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    public Object carregar(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    public Boolean alterar(Usuario usuario) {
        PreparedStatement stmt = null;

        String sql = "update usuario set nomeusuario = ?, emailusuario = ?, senhausuario=?, loginusuario=?, telefoneusuario=? where idusuario =?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getNomeUsuario());
            stmt.setString(2, usuario.getEmailUsuario());
            stmt.setString(3, usuario.getSenhaUsuario());
            stmt.setString(4, usuario.getLoginUsuario());
            stmt.setString(5, usuario.getTelefoneUsuario());
            stmt.setInt(6, usuario.getIdUsuario());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Problemas ao alterar UsuarioDAO! Erro" + ex.getMessage());
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os perâmetros de conexão! Erro" + ex.getMessage());
            }
        }

    }
    public Boolean inativar(Object object) throws SQLException {

        Usuario usuario = (Usuario) object;
        PreparedStatement stmt = null;
        String sql = "update usuario set statususuario = 0 where idusuario = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, usuario.getIdUsuario());
            stmt.executeUpdate();
            return true;

        } catch (Exception ex) {
            System.out.println("Problemas ao inativar FornecedorDAO! Erro: "
                    + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro: "
                        + e.getMessage());
                e.printStackTrace();
            }
        }

    } 
    public Boolean ativar(Object object) throws SQLException {

        Usuario usuario = (Usuario) object;
        PreparedStatement stmt = null;
        String sql = "update usuario set statususuario = 1 where idusuario = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, usuario.getIdUsuario());
            stmt.executeUpdate();
            return true;

        } catch (Exception ex) {
            System.out.println("Problemas ao ativar FornecedorDAO! Erro: "
                    + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro: "
                        + e.getMessage());
                e.printStackTrace();
            }
        }

    }

    public Boolean cadastrar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }
}
