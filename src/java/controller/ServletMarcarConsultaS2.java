/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DataSource;
import dao.RetornoEspecialidadeDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Especialidade;
import model.Usuario;


/**
 * Projeto da disciplina Programacao WEB 
 *     UFABC - 3o quadrimestre 2019
 *     Desenvolvido por Erika Yahata
 *     Professor Francisco Isidro
 *
 * @author eyahata
 */
public class ServletMarcarConsultaS2 extends HttpServlet {

    @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        System.out.println("Entrando no servlet marcarconsulta2");
            
        String especialidade = request.getParameter("txtEspecialidade");
        
        String pagina = "/pesquisaretornoerro.jsp";
        
        System.out.println("especialidade:" + especialidade);
        
        Usuario usuario = (Usuario)request.getSession().getAttribute("Usuario");
        
        Especialidade espec = (Especialidade)request.getSession().getAttribute("Especialidade");
        
        //System.out.println("usuario:" + usuario);
        //System.out.println("lista espec:" + espec);
        
        if (especialidade.equals("nulo")){
                request.setAttribute("erroSTR","Escolha uma especialidade."); 
            }
        else{
            Especialidade incompleto = new Especialidade();
            incompleto.setEspecialidade(especialidade);
            
            try{
                DataSource ds = new DataSource();
                System.out.println("passei aki 01");

                RetornoEspecialidadeDAO bothDAO = new RetornoEspecialidadeDAO(ds);
                List<Object> res = bothDAO.read(incompleto);
                if (res != null && res.size() > 0){
                    pagina = "/useragendaconsultaunidade.jsp";
                    request.setAttribute("ListaUnidade", res);
                    request.setAttribute("Especialidade", especialidade);
                }
                else{
                    pagina = "/useragendamentoshorario.jsp";
                    //System.out.println("resize:" + res.size());
                    request.setAttribute("erroSTR",especialidade+" - Nenhuma unidade encontrada."); 
                }
                ds.getConnection().close();
            }
            catch(Exception ex){
                request.setAttribute("erroSTR", "Erro ao recuperar");
            }
            
        }

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
        dispatcher.forward(request, response);
    }

}