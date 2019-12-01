/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DataSource;
import dao.EspecialidadeDAO;
import dao.GenericDAO2;
import dao.UnidadeDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Especialidade;

/**
 * Projeto da disciplina Programacao WEB 
 *     UFABC - 3o quadrimestre 2019
 *     Desenvolvido por Erika Yahata
 *     Professor Francisco Isidro
 *
 * @author eyahata
 */
public class ServletBuscaEspecialidade extends HttpServlet {

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pagina;
        pagina = "/pesquisa.jsp";
        try{
            DataSource ds = new DataSource();
            GenericDAO2 dao = new EspecialidadeDAO(ds);
            List<Object> lista = dao.read();
            System.out.println("Entrando Servlet Busca Especialidade");
            
            GenericDAO2 uni = new UnidadeDAO(ds);
            List<Object> lista2 = uni.read();
            
            ds.getConnection().close();
            System.out.println("Tamanho da lista = " + lista.size());
            request.setAttribute("Lista", lista);
            
            System.out.println("Tamanho da lista uni = " + lista2.size());
            request.setAttribute("Lista2", lista2);
            
            RequestDispatcher dispatcher;
            dispatcher = getServletContext().getRequestDispatcher(pagina);
            dispatcher.forward(request, response);
        }
        catch(Exception ex){
            request.setAttribute("erroSTR", "Erro ao recuperar");
        }
    }
}
