/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DataSource;
import dao.UserConsultaAgendadaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UserAgenda;
import model.Usuario;

/**
 * Projeto da disciplina Programacao WEB 
 *     UFABC - 3o quadrimestre 2019
 *     Desenvolvido por Erika Yahata
 *     Professor Francisco Isidro
 *
 * @author eyahata
 */

public class ServletGerenciarAgenda extends HttpServlet {
    @Override
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("Entrando DAO select consulta");
        Integer iduser = Integer.parseInt(request.getParameter("iduser"));
        //System.out.println("ID user: "+iduser);
        UserAgenda incompleto = new UserAgenda();
        incompleto.setIduser(iduser);
        String pagina = "/error.jsp";

        try{
            
            System.out.println("Chamar DAO select consulta");
            
            DataSource ds = new DataSource();
            UserConsultaAgendadaDAO consultaDAO = new UserConsultaAgendadaDAO(ds);
            List<Object> res = consultaDAO.read(incompleto);
            

            System.out.println("Tamanho da lista = " + res.size());
            pagina = "/userconsultaagendada.jsp";
            
            //if (res != null && res.size() > 0){
                //pagina = "/userconsultaagendada.jsp";
                //request.getSession().setAttribute("Usuario", res.get(0)); 
                request.setAttribute("Lista", res);
            //}
            //else{
                System.out.println("resize:" + res.size());
                //request.setAttribute("Lista","Nenhuma consulta Agendada");      
            //}
            ds.getConnection().close();
        }
        catch(Exception ex){
            request.setAttribute("erroSTR", "Erro ao recuperar");
        }
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
        dispatcher.forward(request, response);
    }
}
