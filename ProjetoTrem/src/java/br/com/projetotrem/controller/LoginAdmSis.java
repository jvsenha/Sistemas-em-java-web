/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetotrem.controller;

import br.com.projetotrem.dao.AdministradorDAOImpl;
import br.com.projetotrem.model.Administrador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author joaos
 */
@WebServlet(name = "LoginAdmSis", urlPatterns = {"/LoginAdmSis"})
public class LoginAdmSis extends HttpServlet {

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
             String loginAdmsis = request.getParameter("loginAdmsis");
            String senhaAdmsis = request.getParameter("senhaAdmsis");
            
            String mensagem = null;
            Integer usuario = null;
            String cidade = null ;
            Integer idadministrador = null;
            if (!loginAdmsis.equals("") && !senhaAdmsis.equals("")) {

                AdministradorDAOImpl dao = new AdministradorDAOImpl();
                Administrador administrador = (Administrador) dao.logarAdmSis(loginAdmsis, senhaAdmsis);
                if (administrador != null) {
                    HttpSession sessao = request.getSession(true);
                    sessao.setAttribute("administrador", administrador);
                    request.setAttribute("login", administrador.getLoginUsuario());
                    request.setAttribute("senha", administrador.getSenhaUsuario());
                    request.setAttribute("administrador", administrador.getIdAdmin());
                    request.setAttribute("nome", administrador.getNomeUsuario());
                    request.setAttribute("usuario", administrador.getIdUsuario());
                    mensagem = "Seja bem-vindo de volta " + administrador.getNomeUsuario()+" !";
                    cidade = administrador.getCidadeUsuario();
                    usuario = administrador.getIdUsuario();
                    idadministrador = administrador.getIdAdmin();
                    sessao.setAttribute("mensagem", mensagem);
                    sessao.setAttribute("usuario", usuario);
                    sessao.setAttribute("cidade", cidade);
                    sessao.setAttribute("idadministrador", idadministrador);
                    request.getRequestDispatcher("adm/dashboard.jsp").forward(request, response);
                } else {
                    mensagem = "Login ou senha invalido";
                    request.setAttribute("mensagem", mensagem);
                    request.getRequestDispatcher("adm/logaradm.jsp").forward(request, response);
                }
            } else {
                mensagem = " É necessario digitar login e senha";
                request.setAttribute("mensagem", mensagem);
                request.getRequestDispatcher("adm/logaradm.jsp").forward(request, response);
            }

        } catch (Exception e) {
            System.out.println("Problemas ao logar! Erro:" + e.getMessage());
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
