/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoubeprof.dao;

import br.com.projetoubeprof.model.Administrador;
import br.com.projetoubeprof.model.Cliente;
import br.com.projetoubeprof.model.Usuario;
import br.com.projetoubeprof.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AlunoRemoto
 */
public class AdministradorDAOImpl implements GenericDAO {

    private Connection conn;

    public AdministradorDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    public Boolean inativar(Object object) throws SQLException {

        Administrador adminstrador = (Administrador) object;
        PreparedStatement stmt = null;
        String sql = "update usuario set statususuario = 0 where idusuario = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, adminstrador.getIdUsuario());
            stmt.executeUpdate();
            return true;

        } catch (Exception ex) {
            System.out.println("Problemas ao inativar Adminstrador! Erro: "
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

       Administrador adminstrador = (Administrador) object;
        PreparedStatement stmt = null;
        String sql = "update usuario set statususuario = 1 where idusuario = ?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, adminstrador.getIdUsuario());
            stmt.executeUpdate();
            return true;

        } catch (Exception ex) {
            System.out.println("Problemas ao inativar Adminstrador! Erro: "
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

    public Object logarAdministrador(String loginAdmin, String senhaAdmin) {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        Administrador administrador = null;
        String sql = "select a.*, u.* from administrador a, usuario u where u.idusuario = a.idusuario and u.tipousuario='administrador' and u.statususuario='1' and u.loginusuario = ? and u.senhausuario = ?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, loginAdmin);
            stmt.setString(2, senhaAdmin);
            rs = stmt.executeQuery();
            while (rs.next()) {

                administrador = new Administrador();
                administrador.setLoginUsuario(loginAdmin);
                administrador.setSenhaUsuario(senhaAdmin);
                 administrador.setNomeUsuario(rs.getString("nomeusuario"));
                administrador.setIdUsuario(rs.getInt("idusuario"));
                administrador.setIdAdministrador(rs.getInt("idadministrador"));

            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao encontrar cliente! Erro:" + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! ERRO: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return administrador;
    }

    @Override
    public Boolean cadastrar(Object object) {
        Administrador administrador = (Administrador) object;
        PreparedStatement stmt = null;
        String sql = "insert into administrador( idusuario) values (?);";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, new UsuarioDAOImpl().cadastrar(administrador));
            stmt.execute();
            return true;
        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar cliente! Erro: " + ex.getMessage());
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
        List<Object> adms = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select a.*, u.* from administrador a, usuario u where a.idusuario = u.idusuario;";

        try {
            stmt = this.conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Administrador administrador = new Administrador();

                administrador.setIdAdministrador(rs.getInt("idadministrador"));
                administrador.setIdUsuario(rs.getInt("idusuario"));
                administrador.setNomeUsuario(rs.getString("nomeusuario"));
                administrador.setEmailUsuario(rs.getString("emailusuario"));
                administrador.setTelefoneUsuario(rs.getString("telefoneusuario"));
                administrador.setStatusUsuario(rs.getInt("statususuario"));
                administrador.setTipoUsuario(rs.getString("tipousuario"));
                administrador.setLoginUsuario(rs.getString("loginusuario"));
                administrador.setSenhaUsuario(rs.getString("senhausuario"));

                adms.add(administrador);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar DadosProfessor DAO " + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro" + e.getMessage());
                e.printStackTrace();
            }
        }
        return adms;

    }
    public Object CarregarDados() {
        List<Object> adms = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select u.*, a.* from usuario u, administrador a where u.idusuario = a.idusuario and a.idusuario = ?;";

        try {
            stmt = this.conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Administrador administrador = new Administrador();

                administrador.setIdAdministrador(rs.getInt("idadministrador"));
                administrador.setIdUsuario(rs.getInt("idusuario"));
                administrador.setNomeUsuario(rs.getString("nomeusuario"));
                administrador.setEmailUsuario(rs.getString("emailusuario"));
                administrador.setTelefoneUsuario(rs.getString("telefoneusuario"));
                administrador.setStatusUsuario(rs.getInt("statususuario"));
                administrador.setTipoUsuario(rs.getString("tipousuario"));
                administrador.setLoginUsuario(rs.getString("loginusuario"));
                administrador.setSenhaUsuario(rs.getString("senhausuario"));

                adms.add(administrador);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar DadosProfessor DAO " + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro" + e.getMessage());
                e.printStackTrace();
            }
        }
        return adms;

    }

    @Override
    public Boolean excluir(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object carregar(int idObject) {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Administrador administrador = null;
        String sql = "select u.*, a.* from usuario u, administrador a where u.idusuario = a.idusuario and u.idusuario= ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                administrador = new Administrador();
                administrador.setIdUsuario(rs.getInt("idusuario"));
                administrador.setIdAdministrador(rs.getInt("idadministrador"));
                administrador.setNomeUsuario(rs.getString("nomeusuario"));
                administrador.setLoginUsuario(rs.getString("loginusuario"));
                administrador.setTipoUsuario(rs.getString("tipousuario"));
                administrador.setTelefoneUsuario(rs.getString("telefoneusuario"));
                administrador.setEmailUsuario(rs.getString("emailusuario"));
                administrador.setSenhaUsuario(rs.getString("senhausuario"));
                administrador.setStatusUsuario(rs.getInt("statususuario"));
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao carregar AdministradorDAOImpl! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro: " + e.getMessage());
                e.printStackTrace();
            }
        }
        return administrador;

    }

    @Override
    public Boolean alterar(Object object) {
        Administrador administrador = (Administrador) object;
        PreparedStatement stmt = null;

        String sql = "update usuario set nomeusuario = ?, emailusuario = ?, senhausuario=?, loginusuario=?, telefoneusuario=? where idusuario =?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, administrador.getNomeUsuario());
            stmt.setString(2, administrador.getEmailUsuario());
            stmt.setString(3, administrador.getSenhaUsuario());
            stmt.setString(4, administrador.getLoginUsuario());
            stmt.setString(5, administrador.getTelefoneUsuario());
            stmt.setInt(6, administrador.getIdUsuario());
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

}
