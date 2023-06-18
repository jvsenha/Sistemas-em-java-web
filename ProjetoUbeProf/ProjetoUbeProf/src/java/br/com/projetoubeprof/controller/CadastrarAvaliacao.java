/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.projetoubeprof.controller;

import br.com.projetoubeprof.dao.AvaliacaoDAOImpl;
import br.com.projetoubeprof.model.Avaliacao;
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
@WebServlet(name = "CadastrarAvaliacao", urlPatterns = {"/CadastrarAvaliacao"})
public class CadastrarAvaliacao extends HttpServlet {

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
          
            String comentarioAvaliacao = request.getParameter("comentarioAvaliacao");
            String clienteAvaliacao = request.getParameter("clienteAvaliacao");
            int idProfessor = Integer.parseInt(request.getParameter("idProfessor"));
            int idCliente = Integer.parseInt(request.getParameter("idCliente"));
            int notaAvaliacao = Integer.parseInt(request.getParameter("notaAvaliacao"));
            String mensagemCL = null;
            
            Avaliacao avaliacao = new Avaliacao();
            
            
            avaliacao.setIdCliente(idCliente);
            avaliacao.setIdProfessor(idProfessor);
            avaliacao.setComentarioAvaliacao(comentarioAvaliacao);
            avaliacao.setNotaAvaliacao(notaAvaliacao);
            avaliacao.setClienteAvaliacao(clienteAvaliacao);

                   try {
                    AvaliacaoDAOImpl dao = new AvaliacaoDAOImpl();
                    if (dao.cadastrar(avaliacao)) {
                        mensagemCL = "Avaliação cadastrada com sucesso!";
                        request.setAttribute("mensagemCL", mensagemCL);
                    request.getRequestDispatcher("/CerregarHomeCliente").forward(request, response);
              
                    } else {
                        mensagemCL = "Problemas ao cadastrar Avaliação. "
                                + "Verifique os dados informados e tente novamente!";
                     request.setAttribute("mensagemCL", mensagemCL);
                    request.getRequestDispatcher("/AvaliarProfessor").forward(request, response);
              
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
