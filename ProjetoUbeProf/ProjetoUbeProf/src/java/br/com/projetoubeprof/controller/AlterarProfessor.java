/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.projetoubeprof.controller;

import br.com.projetoubeprof.dao.GenericDAO;
import br.com.projetoubeprof.dao.ProfessorDAOImpl;
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
 * @author joaos
 */
@WebServlet(name = "AlterarProfessor", urlPatterns = {"/AlterarProfessor"})
public class AlterarProfessor extends HttpServlet {

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
            try {
                GenericDAO dao = new ProfessorDAOImpl();
                Integer idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
                Integer idProfessor = Integer.parseInt(request.getParameter("idProfessor"));
                String nomeProfessor = request.getParameter("nomeProfessor");
                String emailProfessor = request.getParameter("emailProfessor");
                String senhaProfessor = request.getParameter("senhaProfessor");
                String loginProfessor = request.getParameter("loginProfessor");
                String telefoneProfessor = request.getParameter("telefoneProfessor");
                String cpfProfessor = request.getParameter("cpfProfessor");
                String cidadeProfessor = request.getParameter("cidadeProfessor");
                
                String menssagemP = null;
                
                Professor professor = new Professor();
                professor.setIdUsuario(idUsuario);
                professor.setIdProfessor(idProfessor);
                professor.setLoginUsuario(loginProfessor);
                professor.setSenhaUsuario(senhaProfessor);
                professor.setNomeUsuario(nomeProfessor);
                professor.setEmailUsuario(emailProfessor);
                professor.setTelefoneUsuario(telefoneProfessor);
                professor.setCidadeProfessor(cidadeProfessor);
                professor.setCpfProfessor(cpfProfessor);
                
                if (dao.alterar(professor)) {
                    menssagemP = "Professor alterado com sucesso.";
                } else {
                    menssagemP = "Problemas ao alterar Professor.";
                }
                request.setAttribute("menssagemP", menssagemP);
                request.setAttribute("usuario", professor.getIdUsuario());
                request.setAttribute("professor", professor.getIdProfessor());
                request.getRequestDispatcher("LoginProfessor").forward(request, response);
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
