package br.com.projetotrem.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.projetotrem.dao.GenericDAO;
import br.com.projetotrem.dao.MaquinistaDAOImpl;
import br.com.projetotrem.model.Empresa;
import br.com.projetotrem.model.Maquinista;
import br.com.projetotrem.util.Conversoes;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author joaos
 */
@WebServlet(name = "CadastrarMaquinista", urlPatterns = {"/CadastrarMaquinista"})
public class CadastrarMaquinista extends HttpServlet {

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
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {

            Integer idEmp = Integer.parseInt(request.getParameter("idEmp"));
            String nomemaquinista = request.getParameter("nomemaquinista");
            String telmaquinista = request.getParameter("telmaquinista");
            String loginmaquinista = request.getParameter("loginmaquinista");
            String senhamaquinista = request.getParameter("senhamaquinista");
            Date nascmaquinista = Conversoes.converterData(request.getParameter("nascmaquinista"));
            String rgmaquinista = request.getParameter("rgmaquinista");
            String cidademaquinista = request.getParameter("cidademaquinista");
            String tipomaquinista = ("maquinista");
            Integer statusmaquinista = 1;
            String menssagem = null;

            Maquinista maquinista = new Maquinista();
            maquinista.setIdEmp(new Empresa(idEmp));
            maquinista.setNomeUsuario(nomemaquinista);
            maquinista.setTelUsuario(telmaquinista);
            maquinista.setLoginUsuario(loginmaquinista);
            maquinista.setSenhaUsuario(senhamaquinista);
            maquinista.setNascUsuario(nascmaquinista);
            maquinista.setTipoUsuario(tipomaquinista);
            maquinista.setCidadeUsuario(cidademaquinista);
            maquinista.setRgUsuario(rgmaquinista);
            maquinista.setStatusUsuario(statusmaquinista);

            try {
                GenericDAO dao = new MaquinistaDAOImpl();

                if (dao.cadastrar(maquinista)) {
                    menssagem = "inistrador cadastrado com sucesso!";
                    request.setAttribute("menssagem", menssagem);
                    request.getRequestDispatcher("DadosMaq").forward(request, response);
                } else {
                    menssagem = "Problemas ao cadastrar Maquinista. "
                            + "Verifique os dados informados e tente novamente!";
                    request.setAttribute("menssagem", menssagem);
                    request.getRequestDispatcher("indexnova.jsp").forward(request, response);

                }
            } catch (Exception ex) {
                System.out.println("Problemas no Servlet ao cadastar ! Erro: "
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(CadastrarMaquinista.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(CadastrarMaquinista.class.getName()).log(Level.SEVERE, null, ex);
        }
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
