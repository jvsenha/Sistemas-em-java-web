package br.com.projetoubeprof.controller;

import br.com.projetoubeprof.dao.GenericDAO;
import br.com.projetoubeprof.dao.ProfessorDAOImpl;
import br.com.projetoubeprof.model.Professor;
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
@WebServlet(name = "CadastrarProfessor", urlPatterns = {"/CadastrarProfessor"})
public class CadastrarProfessor extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=ISO-8859-1");
        try ( PrintWriter out = response.getWriter()) {

            String nomeProfessor = request.getParameter("nomeProfessor");
            String emailProfessor = request.getParameter("emailProfessor");
            String senhaProfessor = request.getParameter("senhaProfessor");
            String loginProfessor = request.getParameter("loginProfessor");
            String telefoneProfessor = request.getParameter("telefoneProfessor");
            String cpfProfessor = request.getParameter("cpfProfessor");
            String cidadeProfessor = request.getParameter("cidadeProfessor");
            String tipoUsuario = "professor";
            Integer statusUsuario = 1;
            String menssagemP = null;

            Professor professor = new Professor();
            professor.setLoginUsuario(loginProfessor);
            professor.setSenhaUsuario(senhaProfessor);
            professor.setNomeUsuario(nomeProfessor);
            professor.setEmailUsuario(emailProfessor);
            professor.setTelefoneUsuario(telefoneProfessor);
            professor.setCidadeProfessor(cidadeProfessor);
            professor.setCpfProfessor(cpfProfessor);
            professor.setTipoUsuario(tipoUsuario);
            professor.setStatusUsuario(statusUsuario);

            try {
                    GenericDAO dao = new ProfessorDAOImpl();
                    if (dao.cadastrar(professor)) {
                        menssagemP = "Professor cadastrado com sucesso!";
                        request.setAttribute("menssagemP", menssagemP);
                    request.getRequestDispatcher("/professor/loginprofessor.jsp").forward(request, response);
              
                    } else {
                        menssagemP = "Problemas ao cadastrar Professor. "
                                + "Verifique os dados informados e tente novamente!";
                     request.setAttribute("menssagemP", menssagemP);
                    request.getRequestDispatcher("/professor/loginprofessor.jsp").forward(request, response);
              
                    }
                      } catch (Exception ex) {
                    System.out.println("Problemas no Servlet ao cadastar Professor! Erro: "
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
