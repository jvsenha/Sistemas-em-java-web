/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetotrem.dao;

import br.com.projetotrem.model.Administrador;
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
    @Override
    public Boolean cadastrar(Object object) {
        Administrador administrador = (Administrador) object;
        PreparedStatement stmt = null;

        String sql = "insert into administrador (idusuario) values (?) RETURNING idadmin;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, new UsuarioDAOImpl().cadastrar(administrador));
            stmt.execute();
            return true;
        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar Administrador! Erro: " + ex.getMessage());
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
    public List<Object> listar() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Object> administradores = new ArrayList<>();

        String sql = "select u.*,a.* from usuario u, administrador a where u.idusuario = a.idusuario order by idadmin;";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Administrador administrador = new Administrador();

                administrador.setIdAdmin(rs.getInt("idAdmin"));
                administrador.setIdUsuario(rs.getInt("idUsuario"));
                administrador.setNomeUsuario(rs.getString("nomeUsuario"));
                administrador.setTelUsuario(rs.getString("telUsuario"));
                administrador.setLoginUsuario(rs.getString("loginUsuario"));
                administrador.setSenhaUsuario(rs.getString("senhaUsuario"));
                administrador.setNascUsuario(rs.getDate("nascUsuario"));
                administrador.setRgUsuario(rs.getString("rgUsuario"));
                administrador.setStatusUsuario(rs.getInt("statusUsuario"));
                administrador.setTipoUsuario(rs.getString("tipoUsuario"));
                administrador.setCidadeUsuario(rs.getString("cidadeUsuario"));
                administradores.add(administrador);
            }

        } catch (SQLException ex) {
            System.out.println("Problemas ao listar administrador!\n ERROR: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar parametros da conexao!\n ERROR: " + ex.getMessage());
                ex.printStackTrace();
            }

        }
        return administradores;
    }
    public List<Object> listarativos() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Object> administradores = new ArrayList<>();

        String sql = "select u.*,a.* from usuario u, administrador a where u.idusuario = a.idusuario and u.statususuario=1 order by idadmin;";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Administrador administrador = new Administrador();

                administrador.setIdAdmin(rs.getInt("idAdmin"));
                administrador.setIdUsuario(rs.getInt("idUsuario"));
                administrador.setNomeUsuario(rs.getString("nomeUsuario"));
                administrador.setTelUsuario(rs.getString("telUsuario"));
                administrador.setLoginUsuario(rs.getString("loginUsuario"));
                administrador.setSenhaUsuario(rs.getString("senhaUsuario"));
                administrador.setNascUsuario(rs.getDate("nascUsuario"));
                administrador.setRgUsuario(rs.getString("rgUsuario"));
                administrador.setStatusUsuario(rs.getInt("statusUsuario"));
                administrador.setTipoUsuario(rs.getString("tipoUsuario"));
                administrador.setCidadeUsuario(rs.getString("cidadeUsuario"));
                administradores.add(administrador);
            }

        } catch (SQLException ex) {
            System.out.println("Problemas ao listar administrador!\n ERROR: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar parametros da conexao!\n ERROR: " + ex.getMessage());
                ex.printStackTrace();
            }

        }
        return administradores;
    }
    
    public List<Object> listarinativos() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Object> administradores = new ArrayList<>();

        String sql = "select u.*,a.* from usuario u, administrador a where u.idusuario = a.idusuario and u.statususuario=0 order by idadmin;";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Administrador administrador = new Administrador();

                administrador.setIdAdmin(rs.getInt("idAdmin"));
                administrador.setIdUsuario(rs.getInt("idUsuario"));
                administrador.setNomeUsuario(rs.getString("nomeUsuario"));
                administrador.setTelUsuario(rs.getString("telUsuario"));
                administrador.setLoginUsuario(rs.getString("loginUsuario"));
                administrador.setSenhaUsuario(rs.getString("senhaUsuario"));
                administrador.setNascUsuario(rs.getDate("nascUsuario"));
                administrador.setRgUsuario(rs.getString("rgUsuario"));
                administrador.setStatusUsuario(rs.getInt("statusUsuario"));
                administrador.setTipoUsuario(rs.getString("tipoUsuario"));
                administrador.setCidadeUsuario(rs.getString("cidadeUsuario"));
                administradores.add(administrador);
            }

        } catch (SQLException ex) {
            System.out.println("Problemas ao listar administrador!\n ERROR: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar parametros da conexao!\n ERROR: " + ex.getMessage());
                ex.printStackTrace();
            }

        }
        return administradores;
    }
    public List<Object> listardesativos() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Object> administradores = new ArrayList<>();

        String sql = "select u.*,a.* from usuario u, administrador a where u.idusuario = a.idusuario and u.statususuario=3 order by idadmin;";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Administrador administrador = new Administrador();

                administrador.setIdAdmin(rs.getInt("idAdmin"));
                administrador.setIdUsuario(rs.getInt("idUsuario"));
                administrador.setNomeUsuario(rs.getString("nomeUsuario"));
                administrador.setTelUsuario(rs.getString("telUsuario"));
                administrador.setLoginUsuario(rs.getString("loginUsuario"));
                administrador.setSenhaUsuario(rs.getString("senhaUsuario"));
                administrador.setNascUsuario(rs.getDate("nascUsuario"));
                administrador.setRgUsuario(rs.getString("rgUsuario"));
                administrador.setStatusUsuario(rs.getInt("statusUsuario"));
                administrador.setTipoUsuario(rs.getString("tipoUsuario"));
                administrador.setCidadeUsuario(rs.getString("cidadeUsuario"));
                administradores.add(administrador);
            }

        } catch (SQLException ex) {
            System.out.println("Problemas ao listar administrador!\n ERROR: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar parametros da conexao!\n ERROR: " + ex.getMessage());
                ex.printStackTrace();
            }

        }
        return administradores;
    }

    @Override
    public Boolean excluir(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object carregar(int idObject) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Administrador administrador = null;
        String sql = "select u.*,a.* from usuario u, administrador a where u.idusuario = a.idusuario and a.idusuario =?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            while (rs.next()) {

                administrador = new Administrador();

                administrador.setIdAdmin(rs.getInt("idAdmin"));
                administrador.setIdUsuario(rs.getInt("idUsuario"));
                administrador.setNomeUsuario(rs.getString("nomeUsuario"));
                administrador.setTelUsuario(rs.getString("telUsuario"));
                administrador.setLoginUsuario(rs.getString("loginUsuario"));
                administrador.setSenhaUsuario(rs.getString("senhaUsuario"));
                administrador.setNascUsuario(rs.getDate("nascUsuario"));
                administrador.setRgUsuario(rs.getString("rgUsuario"));
                administrador.setStatusUsuario(rs.getInt("statusUsuario"));
                administrador.setTipoUsuario(rs.getString("tipoUsuario"));
                administrador.setCidadeUsuario(rs.getString("cidadeUsuario"));

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


       public Boolean alterar(Administrador administrador) {
        PreparedStatement stmt = null;
        String sql = "update administrador set where idusuario = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            
            stmt.setInt(2, new UsuarioDAOImpl().cadastrar(administrador));

            stmt.executeUpdate();
            return true;

        } catch (Exception ex) {
            System.out.println("Problemas ao alterar Administrador!Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro: " + e.getMessage());
                e.printStackTrace();
            }

        }
    
    }

    public Boolean inativar(Object object) throws SQLException {

        Administrador administrador = (Administrador) object;
        PreparedStatement stmt = null;
        String sql = "update usuario set statususuario = 3 where idusuario = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, administrador.getIdUsuario());
            stmt.executeUpdate();
            return true;

        } catch (Exception ex) {
            System.out.println("Problemas ao inativar Administrador! Erro: "
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

         Administrador administrador = (Administrador) object;
        PreparedStatement stmt = null;
        String sql = "update usuario set statususuario = 1 where idusuario = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, administrador.getIdUsuario());
            stmt.executeUpdate();
            return true;

        } catch (Exception ex) {
            System.out.println("Problemas ao ativar Administrador! Erro: "
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

    @Override
    public Boolean alterar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     public Object logarAdmSis(String loginUsuario, String senhaUsuario) {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        Administrador administrador = null;
        String sql = "select ads.*, u.* from administrador ads, usuario u where u.idusuario = ads.idusuario and u.tipousuario='admsis' and u.statususuario='1' and loginusuario = ? and senhausuario =?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, loginUsuario);
            stmt.setString(2, senhaUsuario);
            rs = stmt.executeQuery();
            while (rs.next()) {

                administrador = new Administrador();
                administrador.setLoginUsuario(loginUsuario);
                administrador.setSenhaUsuario(senhaUsuario);
                administrador.setNomeUsuario(rs.getString("nomeUsuario"));
                administrador.setIdUsuario(rs.getInt("idusuario"));
                administrador.setIdAdmin(rs.getInt("idadmin"));
                administrador.setCidadeUsuario(rs.getString("cidadeusuario"));

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
}
