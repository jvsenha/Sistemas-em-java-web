/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.projetoubeprof.controller;

import br.com.projetoubeprof.dao.AdministradorDAOImpl;
import br.com.projetoubeprof.dao.AreaDAOImpl;
import br.com.projetoubeprof.model.Administrador;
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
@WebServlet(name = "LoginAdm", urlPatterns = {"/LoginAdm"})
public class LoginAdm extends HttpServlet {

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

            String loginAdmin = request.getParameter("loginAdmin");
            String senhaAdmin = request.getParameter("senhaAdmin");
            String mensagemadm = null;
            Integer usuario= null;

            if (!loginAdmin.equals("") && !senhaAdmin.equals("")) {

                AdministradorDAOImpl dao = new AdministradorDAOImpl();
                Administrador administrador = (Administrador) dao.logarAdministrador(loginAdmin, senhaAdmin);
                if (administrador != null) {
                    HttpSession sessao = request.getSession(true);
                    sessao.setAttribute("administrador", administrador);
                    request.setAttribute("login", administrador.getLoginUsuario());
                    request.setAttribute("senha", administrador.getSenhaUsuario());
                    request.setAttribute("administrador", administrador.getIdAdministrador());
                    request.setAttribute("nomeadmin", administrador.getNomeUsuario());
                    request.setAttribute("usuario", administrador.getIdUsuario());
                 
                    usuario = administrador.getIdUsuario();
                    loginAdmin = administrador.getLoginUsuario();
                    senhaAdmin = administrador.getSenhaUsuario();
                      mensagemadm = "Seja bem-vindo de volta " + administrador.getNomeUsuario()+" !";
                    sessao.setAttribute("mensagemadm", mensagemadm);
                    sessao.setAttribute("usuario", usuario);
                    sessao.setAttribute("loginAdmin", loginAdmin);
                    sessao.setAttribute("senhaAdmin", senhaAdmin);
                   AreaDAOImpl area = new AreaDAOImpl();
                   request.setAttribute("areas", area.listar());
                   
                    request.getRequestDispatcher("homeadm.jsp").forward(request, response);
                } else {
                    mensagemadm = "Login ou senha invalido";
                    request.setAttribute("mensagemadm", mensagemadm);
                    request.getRequestDispatcher("adm/loginadmin.jsp").forward(request, response);
                }
            } else {
                mensagemadm = " É necessario digitar login e senha";
                request.setAttribute("mensagemadm", mensagemadm);
                request.getRequestDispatcher("adm/loginadmin.jsp").forward(request, response);
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
