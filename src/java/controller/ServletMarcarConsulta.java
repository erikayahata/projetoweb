/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DataSource;
import dao.EspecialidadeDAO;
import dao.GenericDAO2;
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
public class ServletMarcarConsulta extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Usuario usuario = (Usuario)request.getSession().getAttribute("Usuario"); //verfica se user esta conectado
        
        String pagina="/login.jsp";
        if (usuario != null){
            pagina = "/useragendaconsultaespecialidade.jsp";
            try{
                DataSource ds = new DataSource();
                GenericDAO2 dao = new EspecialidadeDAO(ds);
                List<Object> lista = dao.read();
                System.out.println("passei aki");
            
                ds.getConnection().close();
                System.out.println("Tamanho da lista = " + lista.size());
                request.setAttribute("Lista", lista);

                RequestDispatcher dispatcher;
                dispatcher = getServletContext().getRequestDispatcher(pagina);
                dispatcher.forward(request, response);
            }
            catch(Exception ex){
                request.setAttribute("erroSTR", "Erro ao recuperar");
            }
        }
    }  
}


