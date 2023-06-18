/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * @author AlunoRemoto
 */
@WebServlet(name = "CadastrarCliente", urlPatterns = {"/CadastrarCliente"})
public class CadastrarCliente extends HttpServlet {

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
            String nomeCliente = request.getParameter("nomeCliente");
            String emailCliente = request.getParameter("emailCliente");
            String senhaCliente = request.getParameter("senhaCliente");
            String loginCliente = request.getParameter("loginCliente");
            String telefoneCliente= request.getParameter("telefoneCliente");
            String enderecoCliente = request.getParameter("enderecoCliente");
            String cidadeCliente = request.getParameter("cidadeCliente");
            String cpfCliente = request.getParameter("cpfCliente");
            String cnpjCliente = request.getParameter("cnpjCliente");
            String tipoUsuario = "cliente";
            Integer statusUsuario = 1;
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
              cliente.setTipoUsuario(tipoUsuario);
              cliente.setStatusUsuario(statusUsuario);
    
               try {
                    GenericDAO dao = new ClienteDAOImpl();
                    if (dao.cadastrar(cliente)) {
                        mensagemCL = "Cliente cadastrado com sucesso!";
                        request.setAttribute("mensagemCL", mensagemCL);
                    request.getRequestDispatcher("/cliente/logincliente.jsp").forward(request, response);
              
                    } else {
                        mensagemCL = "Problemas ao cadastrar Cliente. "
                                + "Verifique os dados informados e tente novamente!";
                     request.setAttribute("mensagemCL", mensagemCL);
                    request.getRequestDispatcher("/cliente/logincliente.jsp").forward(request, response);
              
                    }
                      } catch (Exception ex) {
                    System.out.println("Problemas no Servlet ao cadastar Cliente! Erro: "
                            + ex.getMessage());
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
