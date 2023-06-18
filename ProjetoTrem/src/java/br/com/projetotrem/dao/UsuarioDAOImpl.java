/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetotrem.dao;


import br.com.projetotrem.model.Usuario;
import br.com.projetotrem.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Aluno
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
        String sql = "insert into usuario (nomeusuario, telusuario, loginusuario, senhausuario, nascusuario, rgusuario, statususuario, tipousuario, cidadeusuario) values ( ?, ?, ?, ?, ?, ?, ?, ?, ?) returning idusuario;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getNomeUsuario());
            stmt.setString(2, usuario.getTelUsuario());
            stmt.setString(3, usuario.getLoginUsuario());
            stmt.setString(4, usuario.getSenhaUsuario());
            stmt.setDate(5, new java.sql.Date(usuario.getNascUsuario().getTime()));
            stmt.setString(6, usuario.getRgUsuario());
            stmt.setInt(7, usuario.getStatusUsuario());
            stmt.setString(8, usuario.getTipoUsuario());
            stmt.setString(9, usuario.getCidadeUsuario());
            
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

        String sql = "update usuario set nomeusuario = ?, emailusuario = ?, senhausuario=?, loginusuario=?, telefoneusuario=?, cidadeusuario=?, statususuario = ? where idusuario =?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getNomeUsuario());
            stmt.setString(2, usuario.getTelUsuario());
            stmt.setString(3, usuario.getLoginUsuario());
            stmt.setString(4, usuario.getSenhaUsuario());
            stmt.setDate(5, new java.sql.Date(usuario.getNascUsuario().getTime()));
            stmt.setString(6, usuario.getRgUsuario());
            stmt.setInt(7, usuario.getStatusUsuario());
            stmt.setString(8, usuario.getTipoUsuario());
            stmt.setString(9, usuario.getCidadeUsuario());
            stmt.setInt(10, usuario.getStatusUsuario());
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

}
        


