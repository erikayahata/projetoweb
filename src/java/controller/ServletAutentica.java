/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import dao.DataSource;
import dao.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;


/**
 * Projeto da disciplina Programacao WEB 
 *     UFABC - 3o quadrimestre 2019
 *     Desenvolvido por Erika Yahata
 *     Professor Francisco Isidro
 *
 * @author eyahata
 */
public class ServletAutentica extends HttpServlet {

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
       /* processRequest(request, response); */
        /* usando as infos de email e senha passadas pelo login.jsp */
        String email = request.getParameter("txtEmail");
        String senha = request.getParameter("txtSenha");
        Usuario incompleto = new Usuario();
        incompleto.setEmail(email);
        incompleto.setSenha(senha);
        String pagina = "/error.jsp";
        
        
        try{
            DataSource ds = new DataSource();
            UsuarioDAO userDAO = new UsuarioDAO(ds);
            List<Object> res = userDAO.read(incompleto);

            System.out.println("Tamanho da lista = " + res.size());
            
            if (res != null && res.size() > 0){
                System.out.println("lista res: "+ res);
                pagina = "/userarea.jsp";
                request.getSession().setAttribute("Usuario", res.get(0)); 
                //request.setAttribute("Lista2", res);
                
            }
            else{
                System.out.println("resize:" + res.size());
                request.setAttribute("erroSTR","Usuario / Senha Invalidos");      
            }
            ds.getConnection().close();
        }
        catch(Exception ex){
            request.setAttribute("erroSTR", "Erro ao recuperar");
        }

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
        dispatcher.forward(request, response);
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String pagina;
        pagina = "/pesquisa.jsp";

        RequestDispatcher dispatcher;
        dispatcher = getServletContext().getRequestDispatcher(pagina);
        dispatcher.forward(request, response);
    }
}
