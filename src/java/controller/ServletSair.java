/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Projeto da disciplina Programacao WEB 
 *     UFABC - 3o quadrimestre 2019
 *     Desenvolvido por Erika Yahata
 *     Professor Francisco Isidro
 *
 * @author eyahata
 */
public class ServletSair extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html");  
              
            response.setHeader("Cache-Control", "no-cache, no-store");
            response.setHeader("Pragma", "no-cache");
        
            request.getSession().invalidate();
            //response.sendRedirect(request.getContextPath() + "/index.jsp");
        response.sendRedirect(request.getContextPath());
           // HttpSession session=request.getSession();  
           // session.invalidate();  
            
          // RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
           //dispatcher.forward(request, response);
          // dispatcher.forward(request, response);
    }



}
