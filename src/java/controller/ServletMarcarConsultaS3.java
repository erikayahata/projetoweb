/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DataSource;
import dao.EspecialidadeDAO;
import dao.RetornoAgendaMarcacaoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.AgendaMarcacao;


/**
 * Projeto da disciplina Programacao WEB 
 *     UFABC - 3o quadrimestre 2019
 *     Desenvolvido por Erika Yahata
 *     Professor Francisco Isidro
 *
 * @author eyahata
 */
public class ServletMarcarConsultaS3 extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String especialidade = request.getParameter("txtEspecialidade");
        String unidade = request.getParameter("txtUnidade");
        
        AgendaMarcacao incompleto = new AgendaMarcacao();
        incompleto.setEspecialidade(especialidade);
        incompleto.setUnidade(unidade);

        String pagina = "/pesquisaretornoerro.jsp";
        request.setAttribute("erroSTR","Erro."); 
        
        //System.out.println("especialidade:" +especialidade);
        //System.out.println("unidade:" +unidade);

        try{
            DataSource ds = new DataSource();

            RetornoAgendaMarcacaoDAO bothDAO = new RetornoAgendaMarcacaoDAO(ds);
            List<Object> res = bothDAO.read(incompleto);
            if (res != null && res.size() > 0){
                pagina = "/useragendaconsultamarcar.jsp";
                request.setAttribute("ListaOpcao", res);
            }
            else{
                pagina = "/useragendamentoshorario.jsp";
                //System.out.println("resize:" + res.size());
                request.setAttribute("erroSTR",especialidade+" - " + unidade +  " - Nenhuma agenda disponível");      
            }
            ds.getConnection().close();
        }
        catch(Exception ex){
            request.setAttribute("erroSTR","Erro ao recuperar");
        }

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
        dispatcher.forward(request, response);
    }

}