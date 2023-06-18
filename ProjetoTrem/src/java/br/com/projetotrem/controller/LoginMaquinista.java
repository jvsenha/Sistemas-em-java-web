/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.projetotrem.controller;

import br.com.projetotrem.dao.MaquinistaDAOImpl;
import br.com.projetotrem.model.Maquinista;
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
 * @author Aluno
 */
@WebServlet(name = "LoginMaquinista", urlPatterns = {"/LoginMaquinista"})
public class LoginMaquinista extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
                String loginMaq = request.getParameter("loginMaq");
            String senhaMaq = request.getParameter("senhaMaq");
            
            String mensagem = null;
            Integer usuario = null;
            String cidade = null ;
            Integer idmaquinista = null;
            if (!loginMaq.equals("") && !senhaMaq.equals("")) {

                MaquinistaDAOImpl dao = new MaquinistaDAOImpl();
                Maquinista maquinista = (Maquinista) dao.logarMaq(loginMaq, senhaMaq);
                if (maquinista != null) {
                    HttpSession sessao = request.getSession(true);
                    sessao.setAttribute("maquinista", maquinista);
                    request.setAttribute("login", maquinista.getLoginUsuario());
                    request.setAttribute("senha", maquinista.getSenhaUsuario());
                    request.setAttribute("maquinista", maquinista.getIdMaq());
                    request.setAttribute("nome", maquinista.getNomeUsuario());
                    request.setAttribute("usuario", maquinista.getIdUsuario());
                    mensagem = "Seja bem-vindo de volta " + maquinista.getNomeUsuario()+" !";
                    cidade = maquinista.getCidadeUsuario();
                    usuario = maquinista.getIdUsuario();
                    idmaquinista = maquinista.getIdMaq();
                    sessao.setAttribute("mensagem", mensagem);
                    sessao.setAttribute("usuario", usuario);
                    sessao.setAttribute("cidade", cidade);
                    sessao.setAttribute("idmaquinista", maquinista);
                    request.getRequestDispatcher("maquinista/dashboard.jsp").forward(request, response);
                } else {
                    mensagem = "Login ou senha invalido";
                    request.setAttribute("mensagem", mensagem);
                    request.getRequestDispatcher("maquinista/logarmaquinista.jsp").forward(request, response);
                }
            } else {
                mensagem = " É necessario digitar login e senha";
                request.setAttribute("mensagem", mensagem);
                request.getRequestDispatcher("maquinista/logarmaquinista.jsp").forward(request, response);
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
