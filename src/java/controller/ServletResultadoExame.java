/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DataSource;
import dao.UserConsultaExameDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Exame;

/**
 * Projeto da disciplina Programacao WEB 
 *     UFABC - 3o quadrimestre 2019
 *     Desenvolvido por Erika Yahata
 *     Professor Francisco Isidro
 *
 * @author eyahata
 */

public class ServletResultadoExame extends HttpServlet {
    @Override
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("Entrando Servlet Resultado Exame");
        Integer iduser = Integer.parseInt(request.getParameter("iduser"));
        System.out.println("ID user: "+iduser);
        Exame incompleto = new Exame();
        incompleto.setIdusuario(iduser);
        String pagina = "/error.jsp";
        
        try{
            
            System.out.println("Chamar DAO select exame");
            
            DataSource ds = new DataSource();
            UserConsultaExameDAO exameDAO = new UserConsultaExameDAO(ds);
            List<Object> res = exameDAO.read(incompleto);

            System.out.println("Tamanho da lista = " + res.size());
            
           /* if (res != null && res.size() > 0){
                System.out.println("entrei em nonulo"); */
                pagina = "/userexame.jsp";
                //request.getSession().setAttribute("Usuario", res.get(0)); 
                request.setAttribute("Lista", res);
           /* }
            else{
                System.out.println("sem historico");
                System.out.println("resize:" + res.size());
                request.setAttribute("Lista","Sem historico"); 
                pagina = "/userhistorico.jsp";
            }*/
            ds.getConnection().close();
        }
        catch(Exception ex){
            request.setAttribute("erroSTR", "Erro ao recuperar");
        }
        System.out.println("Saindo Servlet Resultado Exame ");
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
        dispatcher.forward(request, response);

    }
}
