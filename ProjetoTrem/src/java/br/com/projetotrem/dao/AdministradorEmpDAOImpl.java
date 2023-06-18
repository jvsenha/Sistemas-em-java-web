/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetotrem.dao;

import br.com.projetotrem.model.AdmEmpresa;
import br.com.projetotrem.model.Administrador;
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
public class AdministradorEmpDAOImpl implements GenericDAO {

    private Connection conn;

    public AdministradorEmpDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        AdmEmpresa administradorEmp = (AdmEmpresa) object;
        PreparedStatement stmt = null;

        String sql = " insert into admempresa ( idemp, idusuario) values (?, ?) RETURNING idadmemp;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, administradorEmp.getIdEmp().getIdEmpresa());
            stmt.setInt(2, new UsuarioDAOImpl().cadastrar(administradorEmp));
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
    public Object listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Object> listarinativos() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Object> administradoresEmp = new ArrayList<>();

        String sql = "select u.*, ae.* from usuario u, admempresa ae where u.idusuario = ae.idusuario and u.statususuario=0 order by idadmemp;";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                AdmEmpresa admempresa = new AdmEmpresa();

                admempresa.setIdEmp(new Empresa(rs.getInt("idemp")));
                admempresa.setIdAdmEmpresa(rs.getInt("idadmemp"));
                admempresa.setIdUsuario(rs.getInt("idUsuario"));
                admempresa.setNomeUsuario(rs.getString("nomeUsuario"));
                admempresa.setTelUsuario(rs.getString("telUsuario"));
                admempresa.setLoginUsuario(rs.getString("loginUsuario"));
                admempresa.setSenhaUsuario(rs.getString("senhaUsuario"));
                admempresa.setNascUsuario(rs.getDate("nascUsuario"));
                admempresa.setRgUsuario(rs.getString("rgUsuario"));
                admempresa.setStatusUsuario(rs.getInt("statusUsuario"));
                admempresa.setTipoUsuario(rs.getString("tipoUsuario"));
                admempresa.setCidadeUsuario(rs.getString("cidadeUsuario"));
                administradoresEmp.add(admempresa);
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
        return administradoresEmp;
    }

    @Override
    public Boolean excluir(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object carregar(int idObject) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        AdmEmpresa administradoremp = null;
        String sql = "select u.*,ae.* from usuario u, admempresa ae where u.idusuario = ae.idusuario and ae.idusuario =?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            while (rs.next()) {

                administradoremp = new AdmEmpresa();

                administradoremp.setIdEmp(new Empresa(rs.getInt("idemp")));
                administradoremp.setIdAdmEmpresa(rs.getInt("idadmemp"));
                administradoremp.setIdUsuario(rs.getInt("idusuario"));
                administradoremp.setNomeUsuario(rs.getString("nomeusuario"));
                administradoremp.setTelUsuario(rs.getString("telusuario"));
                administradoremp.setLoginUsuario(rs.getString("loginusuario"));
                administradoremp.setSenhaUsuario(rs.getString("senhausuario"));
                administradoremp.setNascUsuario(rs.getDate("nascusuario"));
                administradoremp.setRgUsuario(rs.getString("rgusuario"));
                administradoremp.setStatusUsuario(rs.getInt("statususuario"));
                administradoremp.setTipoUsuario(rs.getString("tipousuario"));
                administradoremp.setCidadeUsuario(rs.getString("cidadeusuario"));

            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao carregar AdministradorEmpDAOImpl! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro: " + e.getMessage());
                e.printStackTrace();
            }
        }
        return administradoremp;

    }



    @Override
    public Boolean alterar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Boolean inativar(Object object) throws SQLException {

        AdmEmpresa administradorEmp = (AdmEmpresa) object;
        PreparedStatement stmt = null;
        String sql = "update usuario set statususuario = 0 where idusuario = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, administradorEmp.getIdUsuario());
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

        AdmEmpresa administradorEmp = (AdmEmpresa) object;
        PreparedStatement stmt = null;
        String sql = "update usuario set statususuario = 1 where idusuario = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, administradorEmp.getIdUsuario());
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

    public Object logarAdmEmp(String loginUsuario, String senhaUsuario) {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        AdmEmpresa admempresa = null;
        String sql = "select a.*, u.* from admempresa a, usuario u where u.idusuario = a.idusuario and u.tipousuario='admemp' and u.statususuario='1' and u.loginusuario = ? and u.senhausuario = ?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, loginUsuario);
            stmt.setString(2, senhaUsuario);
            rs = stmt.executeQuery();
            while (rs.next()) {

                admempresa = new AdmEmpresa();
                admempresa.setLoginUsuario(loginUsuario);
                admempresa.setSenhaUsuario(senhaUsuario);
                admempresa.setNomeUsuario(rs.getString("nomeusuario"));
                admempresa.setIdUsuario(rs.getInt("idusuario"));
                admempresa.setIdAdmEmpresa(rs.getInt("idadmemp"));
                admempresa.setIdEmp(new Empresa(rs.getInt("idemp")));
                admempresa.setCidadeUsuario(rs.getString("cidadeusuario"));

            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao encontrar Adm Empresa! Erro:" + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! ERRO: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return admempresa;
    }
}
