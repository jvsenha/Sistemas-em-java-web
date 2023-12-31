/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.projetotrem.controller;

import br.com.projetotrem.dao.GenericDAO;
import br.com.projetotrem.dao.TremDAOImpl;
import br.com.projetotrem.model.Empresa;
import br.com.projetotrem.model.Trem;
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
@WebServlet(name = "CadastrarTrem", urlPatterns = {"/CadastrarTrem"})
public class CadastrarTrem extends HttpServlet {

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
            Integer idEmpresa = Integer.parseInt(request.getParameter("idEmpresa"));
            String nomeTrem = request.getParameter("nomeTrem");
            String modeloTrem = request.getParameter("modeloTrem");
            String tpcombTrem = request.getParameter("tpcombTrem");
            String menssagem = null;

            Trem trem = new Trem();
             trem.setIdEmpresa(new Empresa(idEmpresa));
             trem.setNomeTrem(nomeTrem);
             trem.setModeloTrem(modeloTrem);
             trem.setTpcombTrem(tpcombTrem);
             
    
               try {
                    GenericDAO dao = new TremDAOImpl();
                    if (dao.cadastrar(trem)) {
                        menssagem = "Trem cadastrado com sucesso!";
                        request.setAttribute("menssagem", menssagem);
                    request.getRequestDispatcher("admemp/cadastratrem.jsp").forward(request, response);
              
                    } else {
                        menssagem = "Problemas ao cadastrar Area. "
                                + "Verifique os dados informados e tente novamente!";
                     request.setAttribute("menssagem", menssagem);
                    request.getRequestDispatcher("index.jsp").forward(request, response);
              
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
