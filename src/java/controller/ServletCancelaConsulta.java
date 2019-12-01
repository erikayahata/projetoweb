/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DataSource;
import dao.MarcarConsultaUnidadeDAO;
import dao.UsuarioDAO;
import model.Usuario;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.AgendaMarcacao;
import model.UserAgenda;

/**
 * Projeto da disciplina Programacao WEB 
 *     UFABC - 3o quadrimestre 2019
 *     Desenvolvido por Erika Yahata
 *     Professor Francisco Isidro
 *
 * @author eyahata
 */
public class ServletCancelaConsulta extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // receber dados do formulário
        // criar um objeto usuario com estes dados mas que ainda não tem id
        // instanciar o datasource e o dao
        // gravar
        // dependendo do resultado vms trabalhar em qual pag retornar
        
        System.out.println("Entrando Servlet Cancela Consulta");
        String pagina = "/userarea.jsp";
        
        Integer idusuario = Integer.parseInt(request.getParameter("iduser"));
        Integer idagenda = Integer.parseInt(request.getParameter("idagenda"));
       
        AgendaMarcacao agenda = new AgendaMarcacao();
        agenda.setIdagenda(idagenda);
        agenda.setStatus("livre");
        
        UserAgenda useragenda = new UserAgenda();
        useragenda.setIduser(idusuario);
        useragenda.setIdagenda(idagenda);
        
        DataSource dataSource = new DataSource();
        MarcarConsultaUnidadeDAO marcarconsultaDAO = new MarcarConsultaUnidadeDAO(dataSource);
        marcarconsultaDAO.update(agenda);

        marcarconsultaDAO.delete(useragenda);
       // System.out.println("passou pelo cancelamento no db");
        
        try{
            dataSource.getConnection().close();
        }
        catch(SQLException ex){
            System.out.println("Erro ao fechar conexao"+ex.getMessage()); 
            request.setAttribute("erroMSG","Erro ao cancelar consulta");
            pagina = "/pesquisaretornoerro.jsp";
        }
        // se criou user com sucesso vai para tela principal para user conectado
        // if (usuario.getId() != 0) request.getSession().setAttribute("Usuario",usuario);
        
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
        dispatcher.forward(request, response);
        
    }


}
