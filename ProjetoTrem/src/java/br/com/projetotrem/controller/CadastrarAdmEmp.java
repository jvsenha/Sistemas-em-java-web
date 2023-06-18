package br.com.projetotrem.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import br.com.projetotrem.dao.AdministradorDAOImpl;
import br.com.projetotrem.dao.AdministradorEmpDAOImpl;
import br.com.projetotrem.dao.GenericDAO;
import br.com.projetotrem.model.AdmEmpresa;
import br.com.projetotrem.model.Empresa;
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
@WebServlet(name = "CadastrarAdmEmp", urlPatterns = {"/CadastrarAdmEmp"})
public class CadastrarAdmEmp extends HttpServlet {

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
            String nomeAdmempresa = request.getParameter("nomeAdmempresa");
            String telAdmempresa = request.getParameter("telAdmempresa");
            String loginAdmempresa = request.getParameter("loginAdmempresa");
            String senhaAdmempresa = request.getParameter("senhaAdmempresa");
            Date nascAdmempresa = Conversoes.converterData(request.getParameter("nascAdmempresa"));
            String rgAdmempresa = request.getParameter("rgAdmempresa");
            String cidadeAdmempresa = request.getParameter("cidadeAdmempresa");
            String tipoAdmempresa = ("admemp");
            Integer statusAdmempresa = 0;
            String menssagem = null;

            AdmEmpresa administradorEmp = new AdmEmpresa();
            administradorEmp.setIdEmp(new Empresa(idEmp));
            administradorEmp.setNomeUsuario(nomeAdmempresa);
            administradorEmp.setTelUsuario(telAdmempresa);
            administradorEmp.setLoginUsuario(loginAdmempresa);
            administradorEmp.setSenhaUsuario(senhaAdmempresa);
            administradorEmp.setNascUsuario(nascAdmempresa);
            administradorEmp.setTipoUsuario(tipoAdmempresa);
            administradorEmp.setCidadeUsuario(cidadeAdmempresa);
            administradorEmp.setRgUsuario(rgAdmempresa);
            administradorEmp.setStatusUsuario(statusAdmempresa);

            try {
                AdministradorEmpDAOImpl dao = new AdministradorEmpDAOImpl();

                if (dao.cadastrar(administradorEmp)) {
                    menssagem = "Administrador cadastrado com sucesso!";
                    request.setAttribute("menssagem", menssagem);
                    request.getRequestDispatcher("admemp/logaradmemp.jsp").forward(request, response);
                } else {
                    menssagem = "Problemas ao cadastrar Adm. "
                            + "Verifique os dados informados e tente novamente!";
                    request.setAttribute("menssagem", menssagem);
                    request.getRequestDispatcher("indexnova.jsp").forward(request, response);

                }
            } catch (Exception ex) {
                System.out.println("Problemas no Servlet ao cadastar Adm! Erro: "
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
            Logger.getLogger(CadastrarAdmSis.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(CadastrarAdmSis.class.getName()).log(Level.SEVERE, null, ex);
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
