/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoubeprof.controller;

import br.com.projetoubeprof.dao.CursoProfessorDAOImpl;
import br.com.projetoubeprof.model.Curso;
import br.com.projetoubeprof.model.CursoProfessor;
import br.com.projetoubeprof.model.Professor;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AlunoRemoto
 */
@WebServlet(name = "CadastrarCursoProfessor", urlPatterns = {"/CadastrarCursoProfessor"})
public class CadastrarCursoProfessor extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=ISO-8859-1");
        try (PrintWriter out = response.getWriter()) {
            
          int idArea =  Integer.parseInt(request.getParameter("idArea"));  
          int idCurso = Integer.parseInt(request.getParameter("idCurso"));
          int idProfessor = Integer.parseInt(request.getParameter("idProfessor"));
          String menssagemP = null;
          
          
          
          CursoProfessor cursoprofessor = new CursoProfessor();
             cursoprofessor.setIdCurso(new Curso (idCurso));
             cursoprofessor.setIdProfessor(new Professor (idProfessor));
             
             
             try{
                 CursoProfessorDAOImpl dao = new CursoProfessorDAOImpl();
                    if (dao.cadastrar(cursoprofessor)) {
                        menssagemP = "Curso cadastrado com sucesso!";
                        request.setAttribute("menssagemP", menssagemP);
                    request.getRequestDispatcher("/ListarCursoProfessor?idArea="+idArea+"&idProfessor"+idProfessor).forward(request, response);
              
                    } else  {
                        menssagemP = "Problemas ao cadastrar Curso do Professor. "
                                + "Verifique os se o curso ja esta cadastrado e tente novamente!";
                     request.setAttribute("menssagemP", menssagemP);
                    request.getRequestDispatcher("/ListarCursoProfessor?idArea="+idArea+"&idProfessor"+idProfessor).forward(request, response);
              
                    }
             }catch (Exception ex) {
                    System.out.println("Problemas no Servlet ao cadastar Cliente! Erro: "
                            + ex.getMessage());
                }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
