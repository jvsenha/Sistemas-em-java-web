/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetotrem.controller;

import br.com.projetotrem.dao.AdministradorEmpDAOImpl;
import br.com.projetotrem.model.AdmEmpresa;
import br.com.projetotrem.model.Administrador;
import br.com.projetotrem.model.Empresa;
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
@WebServlet(name = "LoginAdmEmp", urlPatterns = {"/LoginAdmEmp"})
public class LoginAdmEmp extends HttpServlet {

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
            
            String loginAdmemp = request.getParameter("loginAdmemp");
            String senhaAdmemp = request.getParameter("senhaAdmemp");

            String mensagem = null;
            Integer usuario = null;
            String cidade = null;
            Integer idAdmEmp = null;
            Integer idemp = null;
            
            if (!loginAdmemp.equals("") && !senhaAdmemp.equals("")) {

                AdministradorEmpDAOImpl dao = new AdministradorEmpDAOImpl();
                AdmEmpresa admempresa = (AdmEmpresa) dao.logarAdmEmp(loginAdmemp, senhaAdmemp);
                if (admempresa != null) {
                    HttpSession sessao = request.getSession(true);
                     sessao.setAttribute("admempresa", admempresa);
                    request.setAttribute("login", admempresa.getLoginUsuario());
                    request.setAttribute("senha", admempresa.getSenhaUsuario());
                    request.setAttribute("admempresa", admempresa.getIdAdmEmpresa());
                    request.setAttribute("nomeadmemp", admempresa.getNomeUsuario());
                    request.setAttribute("usuario", admempresa.getIdUsuario());
                    request.setAttribute("idemp", admempresa.getIdEmp().getIdEmpresa());

                    mensagem = "Seja bem-vindo de volta " + admempresa.getNomeUsuario() + " !";
                    cidade = admempresa.getCidadeUsuario();
                    usuario = admempresa.getIdUsuario();
                    idAdmEmp = admempresa.getIdAdmEmpresa();
                    idemp = admempresa.getIdEmp().getIdEmpresa();
                    sessao.setAttribute("mensagem", mensagem);
                    sessao.setAttribute("usuario", usuario);
                    sessao.setAttribute("cidade", cidade);
                    sessao.setAttribute("idAdmEmp", idAdmEmp);
                    sessao.setAttribute("idemp", idemp);
                    request.getRequestDispatcher("admemp/dashboardadmemp.jsp").forward(request, response);
                } else {
                    mensagem = "Login ou senha invalido";
                    request.setAttribute("mensagem", mensagem);
                    request.getRequestDispatcher("admemp/logaradmemp.jsp").forward(request, response);
                }
            } else {
                mensagem = " É necessario digitar login e senha";
                request.setAttribute("mensagem", mensagem);
                request.getRequestDispatcher("admemp/logaradmemp.jsp").forward(request, response);
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
