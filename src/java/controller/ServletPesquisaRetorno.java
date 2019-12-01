/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DataSource;
import dao.EspecialidadeDAO;
import dao.RetornoEspecUnidDAO;
import dao.RetornoEspecialidadeDAO;
import dao.RetornoUnidadeDAO;
import dao.UnidadeDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.EspecUnid;
import model.Especialidade;
import model.Unidade;


/**
 * Projeto da disciplina Programacao WEB 
 *     UFABC - 3o quadrimestre 2019
 *     Desenvolvido por Erika Yahata
 *     Professor Francisco Isidro
 *
 * @author eyahata
 */
public class ServletPesquisaRetorno extends HttpServlet {

    @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String especialidade = request.getParameter("txtEspecialidade");
        String unidade = request.getParameter("txtUnidade");
        
        EspecUnid incompleto = new EspecUnid();
        incompleto.setEspecialidade(especialidade);
        incompleto.setUnidade(unidade);
        
        Especialidade incompleto2 = new Especialidade();
        incompleto2.setEspecialidade(especialidade);
        
        Unidade incompleto3 = new Unidade();
        incompleto3.setUnidade(unidade);

        String pagina = "/pesquisaretornoerro.jsp";
        request.setAttribute("erroSTR","Escolha uma especialidade ou uma unidade ou ambas para pesquisa."); 
        
        //System.out.println("especialidade:" +especialidade);
        //System.out.println("Unidade:" +unidade);

        try{
            DataSource ds = new DataSource();
            System.out.println("passei aki 01");
            /* escolheu especialidade e unidade */
            if (!"nulo".equals(especialidade) && !"nulo".equals(unidade)){
                System.out.println("passei aki em nonulo");
                RetornoEspecUnidDAO bothDAO = new RetornoEspecUnidDAO(ds);
                List<Object> listaespecunid = bothDAO.read(incompleto);
                
                if (listaespecunid != null && listaespecunid.size() > 0){
                    System.out.println("achei em nonulo");
                    pagina = "/pesquisaretornoespecunid.jsp";
                    request.setAttribute("ListaEspecUnid", listaespecunid);
                    request.getSession().setAttribute("Especialidade",incompleto2);
                }
                else{
                    pagina = "/pesquisaretornoerro.jsp";
                    //System.out.println("resize:" + listaespecunid.size());
                    request.setAttribute("erroSTR","Esta unidade não atende a especialidade pesquisada.");      
                }
            }
            else{
                /*escolheu unidade, retornar todas especialidades */
                if ("nulo".equals(especialidade) && !"nulo".equals(unidade)){
                    RetornoUnidadeDAO bothDAO = new RetornoUnidadeDAO(ds);
                    List<Object> res = bothDAO.read(incompleto3);
                    if (res != null && res.size() > 0){
                        pagina = "/pesquisaretornoespecialidade.jsp";
                        request.setAttribute("ListaEspecialidade", res);
                        request.getSession().setAttribute("Unidade",incompleto3);
                    }
                    else{
                        pagina = "/pesquisaretornoerro.jsp";
                        System.out.println("passei aki 04");
                        System.out.println("resize:" + res.size());
                        request.setAttribute("erroSTR","Unidade sem especialidades cadastradas.");      
                    }
                }
                else{
                    /* escolheu especialidade, retornar todas unidades */
                    if (!"nulo".equals(especialidade) && "nulo".equals(unidade)){
                        RetornoEspecialidadeDAO bothDAO = new RetornoEspecialidadeDAO(ds);
                        List<Object> res = bothDAO.read(incompleto2);
                        if (res != null && res.size() > 0){
                            pagina = "/pesquisaretornounidade.jsp";
                            request.setAttribute("ListaUnidade", res);
                            request.getSession().setAttribute("Especialidade",incompleto2);
                        }
                        else{
                            pagina = "/pesquisaretornoerro.jsp";
                            System.out.println("resize:" + res.size());
                            request.setAttribute("erroSTR","Nenhuma unidade encontrada para "+especialidade);      
                        }
                    }
                }    
            }
            ds.getConnection().close();
        }
        catch(Exception ex){
            request.setAttribute("erroSTR", "Erro ao recuperar");
        }

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
        dispatcher.forward(request, response);
    }

}