/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoubeprof.controller;

import br.com.projetoubeprof.dao.ClienteDAOImpl;
import br.com.projetoubeprof.dao.ProfessorDAOImpl;
import br.com.projetoubeprof.model.Cliente;
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
 * @author AlunoRemoto
 */
@WebServlet(name = "LoginCliente", urlPatterns = {"/LoginCliente"})
public class LoginCliente extends HttpServlet {

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
            String loginCliente = request.getParameter("loginCliente");
            String senhaCliente = request.getParameter("senhaCliente");
            
            String mensagemCL = null;
            Integer usuario = null;
            String cidade = null ;
            Integer idcliente = null;
            if (!loginCliente.equals("") && !senhaCliente.equals("")) {

                ClienteDAOImpl dao = new ClienteDAOImpl();
                Cliente cliente = (Cliente) dao.logarCliente(loginCliente, senhaCliente);
                if (cliente != null) {
                    HttpSession sessao = request.getSession(true);
                    sessao.setAttribute("cliente", cliente);
                    request.setAttribute("login", cliente.getLoginUsuario());
                    request.setAttribute("senha", cliente.getSenhaUsuario());
                    request.setAttribute("cliente", cliente.getIdCliente());
                    request.setAttribute("nome", cliente.getNomeUsuario());
                    request.setAttribute("usuario", cliente.getIdUsuario());
                    mensagemCL = "Seja bem-vindo de volta " + cliente.getNomeUsuario()+" !";
                    cidade = cliente.getCidadeCliente();
                    usuario = cliente.getIdUsuario();
                    idcliente = cliente.getIdCliente();
                    sessao.setAttribute("mensagemCL", mensagemCL);
                    sessao.setAttribute("usuario", usuario);
                    sessao.setAttribute("cidade", cidade);
                    sessao.setAttribute("idcliente", idcliente);
                    ProfessorDAOImpl daoprof = new ProfessorDAOImpl();
                request.setAttribute("dadosprofessores", daoprof.listadadosprofessor());
                    request.getRequestDispatcher("homecliente.jsp").forward(request, response);
                } else {
                    mensagemCL = "Login ou senha invalido";
                    request.setAttribute("mensagemCL", mensagemCL);
                    request.getRequestDispatcher("cliente/logincliente.jsp").forward(request, response);
                }
            } else {
                mensagemCL = " É necessario digitar login e senha";
                request.setAttribute("mensagemCL", mensagemCL);
                request.getRequestDispatcher("cliente/logincliente.jsp").forward(request, response);
            }

        } catch (Exception e) {
            System.out.println("Problemas ao logar! Erro:" + e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the
    // + sign on the left to edit the code.">
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
