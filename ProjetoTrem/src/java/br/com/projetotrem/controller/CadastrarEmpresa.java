/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.projetotrem.controller;

import br.com.projetotrem.dao.EmpresaDAOImpl;
import br.com.projetotrem.dao.GenericDAO;
import br.com.projetotrem.model.Empresa;
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
@WebServlet(name = "CadastrarEmpresa", urlPatterns = {"/CadastrarEmpresa"})
public class CadastrarEmpresa extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            String telefoneEmp = request.getParameter("telefoneEmp");
            String nomeEmp = request.getParameter("nomeEmp");
            String razaosocEmp = request.getParameter("razaosocEmp");
            String cnpjEmp = request.getParameter("cnpjEmp");
            String emailEmp= request.getParameter("emailEmp");
            String ruaEmp = request.getParameter("ruaEmp");
            String cepEmp = request.getParameter("cepEmp");
            String bairroEmp = request.getParameter("bairroEmp");
            String municipioEmp = request.getParameter("municipioEmp");
            String ufEmp = request.getParameter("ufEmp");
            String menssagem= null;
              
              Empresa empresa = new Empresa();
              empresa.setTelefoneEmp(telefoneEmp);
              empresa.setNomeEmp(nomeEmp);
              empresa.setRazaosocEmp(razaosocEmp);
              empresa.setCnpjEmp(cnpjEmp);
              empresa.setEmailEmp(emailEmp);
              empresa.setRuaEmp(ruaEmp);
              empresa.setCepEmp(cepEmp);
              empresa.setBairroEmp(bairroEmp);
              empresa.setMunicipioEmp(municipioEmp);
              empresa.setUfEmp(ufEmp);
    
               try {
                    EmpresaDAOImpl dao = new EmpresaDAOImpl();
                    if (dao.cadastrar(empresa)) {
                        menssagem = "Empresa cadastrado com sucesso!";
                        request.setAttribute("menssagem", menssagem);
                    request.getRequestDispatcher("adm/cadastrarempresa.jsp").forward(request, response);
              
                    } else {
                        menssagem = "Problemas ao cadastrar Empresa. "
                                + "Verifique os dados informados e tente novamente!";
                     request.setAttribute("menssagem", menssagem);
                    request.getRequestDispatcher("dashboard.jsp").forward(request, response);
              
                    }
                      } catch (Exception ex) {
                    System.out.println("Problemas no Servlet ao cadastar Empresa! Erro: "
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
