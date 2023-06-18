/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoubeprof.dao;

import br.com.projetoubeprof.model.Cliente;
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
public class ClienteDAOImpl implements GenericDAO {

    private Connection conn;

    public ClienteDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
    
    public Boolean inativar(Object object) throws SQLException {

        Cliente cliente = (Cliente) object;
        PreparedStatement stmt = null;
        String sql = "update usuario set statususuario = 0 where idusuario = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, cliente.getIdUsuario() );
            stmt.executeUpdate();
            return true;

        } catch (Exception ex) {
            System.out.println("Problemas ao inativar Cleinte! Erro: "
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

        Cliente cliente = (Cliente) object;
        PreparedStatement stmt = null;
        String sql = "update usuario set statususuario = 1 where idusuario = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, cliente.getIdUsuario() );
            stmt.executeUpdate();
            return true;

        } catch (Exception ex) {
            System.out.println("Problemas ao ativar Cleinte! Erro: "
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
        List<Object>  clientes = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select c.idcliente, c.enderecocliente,c.cidadecliente, c.cpfcliente, c.cnpjcliente, u.* from usuario u, cliente c where u.idusuario = c.idusuario";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idcliente"));
                cliente.setIdUsuario(rs.getInt("idusuario"));
                cliente.setNomeUsuario(rs.getString("nomeusuario"));
                cliente.setEnderecoCliente(rs.getString("enderecocliente"));
                cliente.setEmailUsuario(rs.getString("emailusuario"));
                cliente.setSenhaUsuario(rs.getString("senhausuario"));
                cliente.setLoginUsuario(rs.getString("loginusuario"));
                cliente.setStatusUsuario(rs.getInt("statususuario"));
                cliente.setTelefoneUsuario(rs.getString("telefoneusuario"));
                cliente.setTipoUsuario(rs.getString("tipousuario"));
                cliente.setCidadeCliente(rs.getString("cidadecliente"));
                cliente.setCpfCliente(rs.getString("cpfcliente"));
                cliente.setCnpjCliente(rs.getString("cnpjcliente"));

                clientes.add(cliente);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar clientes DAO " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro" + e.getMessage());
                e.printStackTrace();
            }
        }
        return clientes;
    }

    @Override
    public Object carregar(int idObject) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Cliente cliente = null;
        String sql = "select u.*, cl.* from usuario u, cliente cl where u.idusuario = cl.idusuario and u.idusuario = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            while (rs.next()) {

                cliente = new Cliente();

                cliente.setIdUsuario(rs.getInt("idUsuario"));
                cliente.setIdCliente(rs.getInt("idCliente"));
                 cliente.setIdUsuario(rs.getInt("idUsuario"));
                cliente.setNomeUsuario(rs.getString("nomeUsuario"));
                cliente.setLoginUsuario(rs.getString("loginUsuario"));
                cliente.setEnderecoCliente(rs.getString("enderecoCliente"));
                cliente.setTipoUsuario(rs.getString("tipoUsuario"));
                cliente.setTelefoneUsuario(rs.getString("telefoneUsuario"));
                cliente.setEmailUsuario(rs.getString("emailUsuario"));
                cliente.setSenhaUsuario(rs.getString("senhaUsuario"));
                cliente.setCidadeCliente(rs.getString("cidadeCliente"));
                cliente.setStatusUsuario(rs.getInt("statusUsuario"));
                cliente.setCpfCliente(rs.getString("cpfCliente"));
                cliente.setCnpjCliente(rs.getString("cnpjCliente"));
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao carregar ClienteDAOImpl! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro: " + e.getMessage());
                e.printStackTrace();
            }
        }
        return cliente;

    }

    @Override
    public Boolean alterar(Object object) {
        Cliente cliente = (Cliente) object;
        PreparedStatement stmt = null;
        String sql = "update cliente set cpfcliente = ?, enderecocliente = ?, cidadecliente = ?, cnpjcliente = ? where idusuario = ?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cliente.getCpfCliente());
            stmt.setString(2, cliente.getEnderecoCliente());
            stmt.setString(3, cliente.getCidadeCliente());
            stmt.setString(4, cliente.getCnpjCliente());
            stmt.setInt(5, new UsuarioDAOImpl().cadastrar(cliente));
            if (new UsuarioDAOImpl().alterar(cliente)) {
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
        Cliente cliente = (Cliente) object;
        PreparedStatement stmt = null;
        String sql = "insert into Cliente( cpfcliente, enderecocliente, cidadecliente, cnpjcliente, idusuario) values ( ?,?,?,?,?);";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cliente.getCpfCliente());
            stmt.setString(2, cliente.getEnderecoCliente());
            stmt.setString(3, cliente.getCidadeCliente());
            stmt.setString(4, cliente.getCnpjCliente());
            stmt.setInt(5, new UsuarioDAOImpl().cadastrar(cliente));
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

    public Object logarCliente(String loginCliente, String senhaCliente) {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        Cliente cliente = null;
        String sql = "select c.*, u.* from cliente c, usuario u where u.idusuario = c.idusuario and u.tipousuario='cliente' and u.statususuario='1' and loginusuario = ? and senhausuario = ?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, loginCliente);
            stmt.setString(2, senhaCliente);
            rs = stmt.executeQuery();
            while (rs.next()) {

                cliente = new Cliente();
                cliente.setLoginUsuario(loginCliente);
                cliente.setSenhaUsuario(senhaCliente);
                cliente.setNomeUsuario(rs.getString("nomeUsuario"));
                cliente.setIdUsuario(rs.getInt("idusuario"));
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setCidadeCliente(rs.getString("cidadecliente"));

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
        return cliente;
    }
@Override
    public Boolean excluir(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
        // Tools | Templates.
    }
}
