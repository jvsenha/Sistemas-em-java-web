/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoubeprof.dao;

import br.com.projetoubeprof.model.Area;
import br.com.projetoubeprof.model.Curso;
import br.com.projetoubeprof.model.CursoProfessor;
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
public class CursoProfessorDAOImpl implements GenericDAO {

    private Connection conn;

    public CursoProfessorDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        CursoProfessor cursoprofessor = (CursoProfessor) object;
        PreparedStatement stmt = null;
        String sql = "insert into cursoprofessor(idcurso, idprofessor) values (?,?);";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, cursoprofessor.getIdCurso().getIdCurso());
            stmt.setInt(2, cursoprofessor.getIdProfessor().getIdProfessor());
            stmt.execute();
            return true;

        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar CursoProfessor! Erro: " + ex.getMessage());
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

    public List<Object> listarCp(int idObject) {
        List<Object> cursoprofessores = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        CursoProfessor cursoprofessor = null;
        String sql = "select c.idcurso, c.idprofessor, cu.nomecurso from cursoprofessor c, professor p, curso cu where c.idprofessor=p.idprofessor and c.idcurso=cu.idcurso and p.idprofessor=?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();

            while (rs.next()) {
                cursoprofessor = new CursoProfessor();

                cursoprofessor.setIdProfessor(new Professor(rs.getInt("idprofessor")));
                cursoprofessor.setIdCurso(new Curso(rs.getInt("idcurso")));
              
                cursoprofessor.setNomeCurso(rs.getString("nomecurso"));

                cursoprofessores.add(cursoprofessor);
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
        return cursoprofessores;
    }

    public List<Object> cursoprofessores(int idObject) {
        List<Object> cursosProf = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        CursoProfessor curso_professor = null;
        String sql = "select c.nomecurso from curso c, cursoprofessor cp, professor p, usuario u where c.idcurso=cp.idcurso and cp.idprofessor=p.idprofessor and p.idusuario= u.idusuario and p.idusuario=?;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();

            while (rs.next()) {
                curso_professor = new CursoProfessor();
                curso_professor.setNomeCurso(rs.getString("nomeCurso"));

                cursosProf.add(curso_professor);
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
        return cursosProf;
    }

    @Override
    public Boolean excluir(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object carregar(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean alterar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public List<Object> ListarBusca(String nameObject)  {  
        List<Object>  cursos = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        CursoProfessor cursoprofessor = null;
        String sql = "select c.nomecurso, u.nomeusuario, p.cidadeprofessor, avg(a.notaavaliacao) as avprofessor\n" +
"from curso c, usuario u, professor p, avalia a, cursoprofessor cu\n" +
"where c.idcurso=cu.idcurso and cu.idprofessor=p.idprofessor and a.idprofessor=p.idprofessor and p.idusuario=u.idusuario and c.nomecurso=?  GROUP BY c.nomecurso, u.nomeusuario, p.cidadeprofessor HAVING avg(a.notaavaliacao) >= 0;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, nameObject);
            rs = stmt.executeQuery();

            while (rs.next()) {
                cursoprofessor = new CursoProfessor();
                cursoprofessor.setNomeCurso(rs.getString("nomecurso"));
                cursoprofessor.setNomeProfessor(rs.getString("nomeusuario"));
                cursoprofessor.setCidadeProfessor(rs.getString("cidadeprofessor"));
                cursoprofessor.setAvProfessor(rs.getDouble("avprofessor"));
                cursos.add(cursoprofessor);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar cursos DAO " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro" + e.getMessage());
                e.printStackTrace();
            }
        }
        return cursos;
    }
     public List<Object> ListarFiltro1(String nameObject, String cidadeObject )  {  
        List<Object>  cursos = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        CursoProfessor cursoprofessor = null;
        String sql = "select c.nomecurso, u.nomeusuario, p.cidadeprofessor, avg(a.notaavaliacao) as avprofessor from curso c, cliente cl, usuario u, professor p, avalia a, cursoprofessor cu where c.idcurso=cu.idcurso and cu.idprofessor=p.idprofessor and a.idprofessor=p.idprofessor and p.idusuario=u.idusuario  and cl.cidadecliente=p.cidadeprofessor and c.nomecurso=? and cl.cidadecliente=?    GROUP BY c.nomecurso, u.nomeusuario, p.cidadeprofessor ;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, nameObject);
            stmt.setString(2, cidadeObject);
            rs = stmt.executeQuery();

            while (rs.next()) {
                cursoprofessor = new CursoProfessor();
                cursoprofessor.setNomeCurso(rs.getString("nomecurso"));
                cursoprofessor.setNomeProfessor(rs.getString("nomeusuario"));
                cursoprofessor.setCidadeProfessor(rs.getString("cidadeprofessor"));
                cursoprofessor.setAvProfessor(rs.getDouble("avprofessor"));
                cursos.add(cursoprofessor);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar cursos DAO " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro" + e.getMessage());
                e.printStackTrace();
            }
        }
        return cursos;
    }
     public List<Object> ListarFiltro2(String nameObject)  {  
        List<Object>  cursos = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        CursoProfessor cursoprofessor = null;
        String sql = "select c.nomecurso, u.nomeusuario, p.cidadeprofessor, avg(a.notaavaliacao) as avprofessor\n" +
"from curso c, usuario u, professor p, avalia a, cursoprofessor cu\n" +
"where c.idcurso=cu.idcurso and cu.idprofessor=p.idprofessor and a.idprofessor=p.idprofessor and p.idusuario=u.idusuario and c.nomecurso=?   GROUP BY c.nomecurso, u.nomeusuario, p.cidadeprofessor HAVING avg(a.notaavaliacao) >= 3;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, nameObject);
            rs = stmt.executeQuery();

            while (rs.next()) {
                cursoprofessor = new CursoProfessor();
                cursoprofessor.setNomeCurso(rs.getString("nomecurso"));
                cursoprofessor.setNomeProfessor(rs.getString("nomeusuario"));
                cursoprofessor.setCidadeProfessor(rs.getString("cidadeprofessor"));
                cursoprofessor.setAvProfessor(rs.getDouble("avprofessor"));
                cursos.add(cursoprofessor);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar cursos DAO " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro" + e.getMessage());
                e.printStackTrace();
            }
        }
        return cursos;
    }
     public List<Object> ListarFiltro3(String nameObject)  {  
        List<Object>  cursos = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        CursoProfessor cursoprofessor = null;
        String sql = "select c.nomecurso, u.nomeusuario, p.cidadeprofessor, avg(a.notaavaliacao) as avprofessor\n" +
"from curso c, usuario u, professor p, avalia a, cursoprofessor cu\n" +
"where c.idcurso=cu.idcurso and cu.idprofessor=p.idprofessor and a.idprofessor=p.idprofessor and p.idusuario=u.idusuario and c.nomecurso=?  GROUP BY c.nomecurso, u.nomeusuario, p.cidadeprofessor HAVING avg(a.notaavaliacao) = 5;";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, nameObject);
            rs = stmt.executeQuery();

            while (rs.next()) {
                cursoprofessor = new CursoProfessor();
                cursoprofessor.setNomeCurso(rs.getString("nomecurso"));
                cursoprofessor.setNomeProfessor(rs.getString("nomeusuario"));
                cursoprofessor.setCidadeProfessor(rs.getString("cidadeprofessor"));
                cursoprofessor.setAvProfessor(rs.getDouble("avprofessor"));
                cursos.add(cursoprofessor);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar cursos DAO " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro" + e.getMessage());
                e.printStackTrace();
            }
        }
        return cursos;
    }
}
