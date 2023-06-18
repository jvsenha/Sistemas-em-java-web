/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoubeprof.controller;

import br.com.projetoubeprof.dao.ProfessorDAOImpl;
import br.com.projetoubeprof.model.Professor;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LoginProfessor", urlPatterns = {"/LoginProfessor"})
public class LoginProfessor extends HttpServlet {

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

            String loginProfessor = request.getParameter("loginProfessor");
            String senhaProfessor = request.getParameter("senhaProfessor");
            String menssagemP = null;
         
            if (!loginProfessor.equals("") && !senhaProfessor.equals("")) {
                ProfessorDAOImpl dao = new ProfessorDAOImpl();
                Professor professor = (Professor) dao.logarProfessor(loginProfessor, senhaProfessor);
                
                if (professor != null) {
                    HttpSession sessao = request.getSession(true);
                    sessao.setAttribute("professor", professor);
                    request.setAttribute("login", professor.getLoginUsuario());
                    request.setAttribute("senha", professor.getSenhaUsuario());
                    request.setAttribute("professor", professor.getIdProfessor());
                    request.setAttribute("nomeprof", professor.getNomeUsuario());
                    request.setAttribute("usuario", professor.getIdUsuario());
                    sessao.setAttribute("menssagemP", menssagemP);
                     ProfessorDAOImpl daoprofessor = new ProfessorDAOImpl();
                      loginProfessor = professor.getLoginUsuario();
                    senhaProfessor = professor.getSenhaUsuario();
                   request.setAttribute("professor", daoprofessor.carregar(professor.getIdUsuario()));
                   sessao.setAttribute("loginProfessor", loginProfessor);
                    sessao.setAttribute("senhaProfessor", senhaProfessor);
                    menssagemP = "Seja bem-vindo de volta " + professor.getNomeUsuario()+" !";
                    request.setAttribute("menssagemP", menssagemP);
                    request.getRequestDispatcher("homeprofessor.jsp").forward(request, response);
                } else {
                    menssagemP = "Login ou senha invalido";
                    request.setAttribute("menssagemP", menssagemP);
                    request.getRequestDispatcher("professor/loginprofessor.jsp").forward(request, response);
                }
            } else {
                menssagemP = " É necessario digitar login e senha";
                request.setAttribute("menssagemP", menssagemP);
                request.getRequestDispatcher("professor/loginprofessor.jsp").forward(request, response);
            }

        } catch (Exception e) {
            System.out.println("Problemas ao logar! Erro: " + e.getMessage());
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
