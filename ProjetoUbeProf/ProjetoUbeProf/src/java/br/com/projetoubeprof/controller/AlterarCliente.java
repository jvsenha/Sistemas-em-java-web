/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.projetoubeprof.controller;

import br.com.projetoubeprof.dao.ClienteDAOImpl;
import br.com.projetoubeprof.dao.GenericDAO;
import br.com.projetoubeprof.model.Cliente;
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
@WebServlet(name = "AlterarCliente", urlPatterns = {"/AlterarCliente"})
public class AlterarCliente extends HttpServlet {

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
           String nomeCliente = request.getParameter("nomeCliente");
            String emailCliente = request.getParameter("emailCliente");
            String senhaCliente = request.getParameter("senhaCliente");
            String loginCliente = request.getParameter("loginCliente");
            String telefoneCliente= request.getParameter("telefoneCliente");
            String enderecoCliente = request.getParameter("enderecoCliente");
            String cidadeCliente = request.getParameter("cidadeCliente");
            String cpfCliente = request.getParameter("cpfCliente");
            String cnpjCliente = request.getParameter("cnpjCliente");
           
             
            String mensagemCL= null;
            
            Cliente cliente = new Cliente(); 
            cliente.setLoginUsuario(loginCliente);
              cliente.setSenhaUsuario(senhaCliente);
              cliente.setNomeUsuario(nomeCliente);
              cliente.setEmailUsuario(emailCliente);
              cliente.setTelefoneUsuario(telefoneCliente);
              cliente.setCidadeCliente(cidadeCliente);
              cliente.setEnderecoCliente(enderecoCliente);
              cliente.setCidadeCliente(cidadeCliente);
              cliente.setCpfCliente(cpfCliente);
              cliente.setCnpjCliente(cnpjCliente);
                try {
                    GenericDAO dao = new ClienteDAOImpl();
                    if (dao.alterar(cliente)) {
                        mensagemCL = "Cliente alterado com sucesso.";
                    } else {
                        mensagemCL = "Problemas ao alterar dentista.";
                    }
                    request.setAttribute("mensagemCL", mensagemCL);
                    request.getRequestDispatcher("ListarAdm").forward(request, response);
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
