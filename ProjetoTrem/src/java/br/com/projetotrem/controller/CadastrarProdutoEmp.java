/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.projetotrem.controller;

import br.com.projetotrem.dao.ProdEmpDAOImpl;
import br.com.projetotrem.dao.ProdutoDAOImpl;
import br.com.projetotrem.model.Empresa;
import br.com.projetotrem.model.Prodemp;
import br.com.projetotrem.model.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aluno
 */
@WebServlet(name = "CadastrarProdutoEmp", urlPatterns = {"/CadastrarProdutoEmp"})
public class CadastrarProdutoEmp extends HttpServlet {

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
            int idProd = Integer.parseInt(request.getParameter("idProd"));
            int idEmp = Integer.parseInt(request.getParameter("idEmp"));
            
            
            String menssagem = null;

            Prodemp prodemp = new Prodemp();
             prodemp.setIdProd(new Produto(idProd));
             prodemp.setIdEmp(new Empresa(idEmp));
             
             
    
               try {
                    ProdEmpDAOImpl dao = new ProdEmpDAOImpl();
                    if (dao.cadastrar(prodemp)) {
                        menssagem = "Produto cadastrado com sucesso!";
                        request.setAttribute("menssagem", menssagem);
                    request.getRequestDispatcher("ListarPro").forward(request, response);
              
                    } else {
                        menssagem = "Problemas ao cadastrar Produto. "
                                + "Verifique os dados informados e tente novamente!";
                     request.setAttribute("menssagem", menssagem);
                    request.getRequestDispatcher("index.jsp").forward(request, response);
              
                    }
                      } catch (Exception ex) {
                    System.out.println("Problemas no Servlet ao cadastar Produto! Erro: "
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
