/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoubeprof.controller;

import br.com.projetoubeprof.dao.AreaDAOImpl;
import br.com.projetoubeprof.dao.CursoDAOImpl;
import br.com.projetoubeprof.dao.CursoProfessorDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author joaos
 */
@WebServlet(name = "ListarCursoProfessor", urlPatterns = {"/ListarCursoProfessor"})
public class ListarCursoProfessor extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          int idArea =  Integer.parseInt(request.getParameter("idArea"));
          int idProfessor = Integer.parseInt(request.getParameter("idProfessor"));
          
          try{
              AreaDAOImpl daoarea = new AreaDAOImpl();
            request.setAttribute("areas", daoarea.listar());
              CursoDAOImpl dao = new CursoDAOImpl();
              request.setAttribute("cursos", dao.listarCA(idArea));
              CursoProfessorDAOImpl daocp = new CursoProfessorDAOImpl();
              request.setAttribute ("cursoprofessores", daocp.listarCp(idProfessor));
            request.getRequestDispatcher("professor/cadastrarareacurso.jsp").forward(request, response);
          } catch (Exception e) {
                System.out.println("Problemas ao carregar Curso Erro: " + e.getMessage());
                e.printStackTrace();

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
