/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.projetoubeprof.controller;

import br.com.projetoubeprof.dao.AdministradorDAOImpl;
import br.com.projetoubeprof.dao.GenericDAO;
import br.com.projetoubeprof.model.Administrador;
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
@WebServlet(name = "AlterarAdm", urlPatterns = {"/AlterarAdm"})
public class AlterarAdm extends HttpServlet {

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
            try {
                GenericDAO dao = new AdministradorDAOImpl();
                Integer idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
                Integer idAdministrador = Integer.parseInt(request.getParameter("idAdministrador"));
                String nomeAdmin = request.getParameter("nomeadmin");
                String emailAdmin = request.getParameter("emailadmin");
                String senhaAdmin = request.getParameter("senhaadmin");
                String loginAdmin = request.getParameter("loginadmin");
                String telefoneAdmin = request.getParameter("telefoneadmin");

                String mensagemadm = null;

                Administrador administrador = new Administrador();
                administrador.setIdUsuario(idUsuario);
                administrador.setIdAdministrador(idAdministrador);
                administrador.setLoginUsuario(loginAdmin);
                administrador.setSenhaUsuario(senhaAdmin);
                administrador.setNomeUsuario(nomeAdmin);
                administrador.setEmailUsuario(emailAdmin);
                administrador.setTelefoneUsuario(telefoneAdmin);

                if (dao.alterar(administrador)) {
                    mensagemadm = "Administrador alterado com sucesso.";
                } else {
                    mensagemadm = "Problemas ao alterar dentista.";
                }
                request.setAttribute("mensagem", mensagemadm);
                request.setAttribute("usuario", administrador.getIdUsuario());
                request.setAttribute("administrador", administrador.getIdAdministrador());
                request.getRequestDispatcher("homeadm.jsp").forward(request, response);
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
