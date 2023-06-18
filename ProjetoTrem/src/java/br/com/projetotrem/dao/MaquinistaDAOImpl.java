/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package br.com.projetotrem.dao;




import br.com.projetotrem.model.Administrador;
import br.com.projetotrem.model.Empresa;
import br.com.projetotrem.model.Maquinista;
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
public class MaquinistaDAOImpl implements GenericDAO{



   
    private Connection conn;



   public MaquinistaDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
    
    @Override
    public Boolean cadastrar(Object object) {
       Maquinista maquinista = (Maquinista) object;
        PreparedStatement stmt = null;



       String sql = " insert into maquinista ( idemp, idusuario) values (?,?) RETURNING idmaq;";
       
        try{
         stmt = conn.prepareStatement(sql);
         stmt.setInt(1, maquinista.getIdEmp().getIdEmpresa());
         stmt.setInt(2,  new UsuarioDAOImpl().cadastrar(maquinista));
         stmt.execute();    
         
          return true;
        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar Maquinista! Erro: " + ex.getMessage());
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
        List<Object> maquinistas = new ArrayList<>();
        String sql = "select u.*,m.* from usuario u, maquinista m where u.idusuario = m.idusuario and m.idusuario =?;";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Maquinista maquinista = new Maquinista();

                maquinista.setIdEmp(new Empresa(rs.getInt("idEmp")));
                maquinista.setIdUsuario(rs.getInt("idUsuario"));
                maquinista.setNomeUsuario(rs.getString("nomeUsuario"));
                maquinista.setTelUsuario(rs.getString("telUsuario"));
                maquinista.setLoginUsuario(rs.getString("loginUsuario"));
                maquinista.setSenhaUsuario(rs.getString("senhaUsuario"));
                maquinista.setNascUsuario(rs.getDate("nascUsuario"));
                maquinista.setRgUsuario(rs.getString("rgUsuario"));
                maquinista.setStatusUsuario(rs.getInt("statusUsuario"));
                maquinista.setTipoUsuario(rs.getString("tipoUsuario"));
                maquinista.setCidadeUsuario(rs.getString("cidadeUsuario"));

            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao carregar MaquinistaDAOImpl! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro: " + e.getMessage());
                e.printStackTrace();
            }
        }
        return maquinistas;

    }



   @Override
    public Boolean excluir(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



   @Override
   public Object carregar(int idObject) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Maquinista maquinista = null;
        String sql = "select u.*,m.* from usuario u, maquinista m where u.idusuario = m.idusuario and m.idusuario =?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            while (rs.next()) {

                maquinista = new Maquinista();

                maquinista.setIdEmp(new Empresa(rs.getInt("idEmp")));
                maquinista.setIdUsuario(rs.getInt("idUsuario"));
                maquinista.setNomeUsuario(rs.getString("nomeUsuario"));
                maquinista.setTelUsuario(rs.getString("telUsuario"));
                maquinista.setLoginUsuario(rs.getString("loginUsuario"));
                maquinista.setSenhaUsuario(rs.getString("senhaUsuario"));
                maquinista.setNascUsuario(rs.getDate("nascUsuario"));
                maquinista.setRgUsuario(rs.getString("rgUsuario"));
                maquinista.setStatusUsuario(rs.getInt("statusUsuario"));
                maquinista.setTipoUsuario(rs.getString("tipoUsuario"));
                maquinista.setCidadeUsuario(rs.getString("cidadeUsuario"));

            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao carregar MaquinistaDAOImpl! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro: " + e.getMessage());
                e.printStackTrace();
            }
        }
        return maquinista;

    }



   @Override
    public Boolean alterar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public Object logarMaq(String loginUsuario, String senhaUsuario) {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        Maquinista maquinista = null;
        String sql = "select m.*, u.* from maquinista m, usuario u where u.idusuario =  m.idusuario and u.tipousuario='maquinista' and u.statususuario='1' and loginusuario = ? and senhausuario =?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, loginUsuario);
            stmt.setString(2, senhaUsuario);
            rs = stmt.executeQuery();
            while (rs.next()) {

                maquinista = new Maquinista();
                maquinista.setLoginUsuario(loginUsuario);
                maquinista.setSenhaUsuario(senhaUsuario);
                maquinista.setNomeUsuario(rs.getString("nomeUsuario"));
                maquinista.setIdUsuario(rs.getInt("idusuario"));
                maquinista.setIdMaq(rs.getInt("idmaq"));
                maquinista.setCidadeUsuario(rs.getString("cidadeusuario"));

            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao encontrar maquinista! Erro:" + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! ERRO: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return maquinista;
    }
      public List<Object> maqempresa(int idObject) {
        List<Object> maqemps = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Maquinista maq_emp = null;
        String sql = "select u.* from maquinista m, empresa e, usuario u, admempresa ae where m.idemp=ae.idemp and m.idusuario=u.idusuario and ae.idusuario=? group by u.idusuario;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();

            while (rs.next()) {
                maq_emp = new Maquinista ();
                 maq_emp.setIdUsuario(rs.getInt("idusuario"));
                maq_emp.setNomeUsuario(rs.getString("nomeusuario"));
                maq_emp.setTelUsuario(rs.getString("telusuario"));
                maq_emp.setLoginUsuario(rs.getString("loginusuario"));
                maq_emp.setSenhaUsuario(rs.getString("senhausuario"));
                maq_emp.setNascUsuario(rs.getDate("nascusuario"));
                maq_emp.setRgUsuario(rs.getString("rgusuario"));
                maq_emp.setStatusUsuario(rs.getInt("statususuario"));
                maq_emp.setTipoUsuario(rs.getString("tipousuario"));
                maq_emp.setCidadeUsuario(rs.getString("cidadeusuario"));

                maqemps.add(maq_emp);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar Avaliação DAO " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro" + e.getMessage());
                e.printStackTrace();
            }
        }
        return maqemps;
    }
}