/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoubeprof.dao;

import br.com.projetoubeprof.model.Cliente;
import br.com.projetoubeprof.model.Professor;
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
public class ProfessorDAOImpl implements GenericDAO {

    private Connection conn;

    public ProfessorDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    public Boolean inativar(Object object) throws SQLException {

        Professor professor = (Professor) object;
        PreparedStatement stmt = null;
        String sql = "update usuario set statususuario = 0 where idusuario = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, professor.getIdUsuario());
            stmt.executeUpdate();
            return true;

        } catch (Exception ex) {
            System.out.println("Problemas ao inativar Professor! Erro: "
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

       Professor professor = (Professor) object;
        PreparedStatement stmt = null;
        String sql = "update usuario set statususuario = 1 where idusuario = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, professor.getIdUsuario());
            stmt.executeUpdate();
            return true;

        } catch (Exception ex) {
            System.out.println("Problemas ao ativar Professor! Erro: "
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
    public List<Object> listar() {
        List<Object> professores = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select p.*, u.* from professor p, usuario u where p.idusuario = u.idusuario;";

        try {
            stmt = this.conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Professor professor = new Professor();

                professor.setIdProfessor(rs.getInt("idProfessor"));
                professor.setIdUsuario(rs.getInt("idUsuario"));
                professor.setNomeUsuario(rs.getString("nomeUsuario"));
                professor.setEmailUsuario(rs.getString("emailUsuario"));
                professor.setTelefoneUsuario(rs.getString("telefoneUsuario"));
                professor.setCidadeProfessor(rs.getString("cidadeProfessor"));
                professor.setStatusUsuario(rs.getInt("statusUsuario"));
                professor.setTipoUsuario(rs.getString("tipoUsuario"));
                professor.setCpfProfessor(rs.getString("cpfProfessor"));
                professor.setLoginUsuario(rs.getString("loginUsuario"));
                professor.setSenhaUsuario(rs.getString("senhaUsuario"));

                professores.add(professor);
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
        return professores;

    }
    public List<Object> listadadosprofessor() {
        List<Object> dadosprofessores = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select p.*, u.* from professor p, usuario u where p.idusuario = u.idusuario and statususuario='1';";

        try {
            stmt = this.conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Professor professor = new Professor();

                professor.setIdProfessor(rs.getInt("idProfessor"));
                professor.setIdUsuario(rs.getInt("idUsuario"));
                professor.setNomeUsuario(rs.getString("nomeUsuario"));
                professor.setEmailUsuario(rs.getString("emailUsuario"));
                professor.setTelefoneUsuario(rs.getString("telefoneUsuario"));
                professor.setCidadeProfessor(rs.getString("cidadeProfessor"));
                professor.setStatusUsuario(rs.getInt("statusUsuario"));
                professor.setTipoUsuario(rs.getString("tipoUsuario"));
                professor.setCpfProfessor(rs.getString("cpfProfessor"));
                professor.setLoginUsuario(rs.getString("loginUsuario"));
                professor.setSenhaUsuario(rs.getString("senhaUsuario"));

                dadosprofessores.add(professor);
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
        return dadosprofessores;

    }

    @Override
    public Boolean excluir(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
        // Tools | Templates.
    }

    @Override
    public Object carregar(int idObject) {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        Professor professor = null;
        String sql = "select u.*, p.* from usuario u, professor p where u.idusuario = p.idusuario and u.idusuario = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();

            while (rs.next()) {
                professor = new Professor();
                professor.setIdUsuario(rs.getInt("idusuario"));
                professor.setIdProfessor(rs.getInt("idprofessor"));
                professor.setNomeUsuario(rs.getString("nomeusuario"));
                professor.setLoginUsuario(rs.getString("loginusuario"));
                professor.setTipoUsuario(rs.getString("tipousuario"));
                professor.setTelefoneUsuario(rs.getString("telefoneusuario"));
                professor.setEmailUsuario(rs.getString("emailusuario"));
                professor.setSenhaUsuario(rs.getString("senhausuario"));
                professor.setStatusUsuario(rs.getInt("statususuario"));
                professor.setCpfProfessor(rs.getString("cpfprofessor"));
                professor.setCidadeProfessor(rs.getString("cidadeprofessor"));
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao carregar FornecedorDAO! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro: " + e.getMessage());
                e.printStackTrace();
            }
        }
        return professor;
    }

    @Override
    public Boolean alterar(Object object) {
        Professor professor = (Professor) object;
        PreparedStatement stmt = null;
        String sql = "update professor set cpfprofessor = ?,  cidadeprofessor = ? where idusuario = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, professor.getCpfProfessor());
            stmt.setString(2, professor.getCidadeProfessor());
            stmt.setInt(3, professor.getIdUsuario());
            if (new UsuarioDAOImpl().alterar(professor)) {
                stmt.executeUpdate();
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            System.out.println("Problemas ao alterar paciente!Erro: " + ex.getMessage());
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

    @Override
    public Boolean cadastrar(Object object) {
        Professor professor = (Professor) object;
        PreparedStatement stmt = null;

        String sql = "insert into professor( cidadeprofessor, cpfprofessor, idusuario) values (?, ?, ?) RETURNING idprofessor;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, professor.getCidadeProfessor());
            stmt.setString(2, professor.getCpfProfessor());
            stmt.setInt(3, new UsuarioDAOImpl().cadastrar(professor));
            stmt.execute();

            return true;
        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar Professor! Erro: " + ex.getMessage());
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

    public Object logarProfessor(String loginProfessor, String senhaProfessor) {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        Professor professor = null;
        String sql = "select u.*, p.* from usuario u, professor p where u.idusuario = p.idusuario and  u.tipousuario = 'professor' and u.statususuario='1' and loginusuario = ? and senhausuario = ?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, loginProfessor);
            stmt.setString(2, senhaProfessor);
            rs = stmt.executeQuery();
            while (rs.next()) {

                professor = new Professor();
                professor.setLoginUsuario(loginProfessor);
                professor.setSenhaUsuario(senhaProfessor);
                  professor.setNomeUsuario(rs.getString("nomeusuario"));
                professor.setIdUsuario(rs.getInt("idusuario"));
                professor.setIdProfessor(rs.getInt("idprofessor"));
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao encontrar professor! Erro:" + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! ERRO: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return professor;
    }

}
