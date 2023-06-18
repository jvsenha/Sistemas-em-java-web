/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.projetoubeprof.controller;

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
 * @author Aluno
 */
@WebServlet(name = "FiltrosPesquisa", urlPatterns = {"/FiltrosPesquisa"})
public class FiltrosPesquisa extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            int numFiltro = Integer.parseInt(request.getParameter("numFiltro"));
              String nomeCurso =  request.getParameter("nomeCurso");
              String cidade =  request.getParameter("cidade");
            String mensagemfiltro = null;
            try{
          if(numFiltro==1){
                CursoProfessorDAOImpl daocp = new CursoProfessorDAOImpl();
              request.setAttribute("cursos", daocp.ListarFiltro1(nomeCurso,cidade));
              request.setAttribute("nomeCurso", nomeCurso);
              request.setAttribute("cidade", cidade);
             request.getRequestDispatcher("cliente/buscacliente.jsp").forward(request, response);
          }
          if(numFiltro==2){
                CursoProfessorDAOImpl daocp = new CursoProfessorDAOImpl();
              request.setAttribute("cursos", daocp.ListarFiltro2(nomeCurso));
              request.setAttribute("nomeCurso", nomeCurso);
             request.getRequestDispatcher("cliente/buscacliente.jsp").forward(request, response);
          }
          if(numFiltro==3){
                CursoProfessorDAOImpl daocp = new CursoProfessorDAOImpl();
              request.setAttribute("cursos", daocp.ListarFiltro3(nomeCurso));
                 request.setAttribute("nomeCurso", nomeCurso);
             request.getRequestDispatcher("cliente/buscacliente.jsp").forward(request, response);
          }
          else{
                CursoProfessorDAOImpl daocp = new CursoProfessorDAOImpl();
              request.setAttribute("cursos", daocp.ListarBusca(nomeCurso));
                 request.setAttribute("nomeCurso", nomeCurso);
             request.getRequestDispatcher("cliente/buscacliente.jsp").forward(request, response);
          }
            } catch (Exception e) {
                    System.out.println("Problemas no Servlet ao alterar usuário! Erro: "
                            + e.getMessage());
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
