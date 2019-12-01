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
public class ServletMarcarConsultaS4 extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // receber dados do formulário
        // criar um objeto usuario com estes dados mas que ainda não tem id
        // instanciar o datasource e o dao
        // gravar
        // dependendo do resultado vms trabalhar em qual pag retornar
        
        System.out.println("Entrando servlet marcar consulta step 4");
        String pagina = "/useragendamentosucesso.jsp";
        Integer idagenda = Integer.parseInt(request.getParameter("consulta"));
        Integer idusuario = Integer.parseInt(request.getParameter("iduser"));                 
        
        //System.out.println("S4 - idagenda: "+idagenda);
        //System.out.println("S4 - idusuario: "+idusuario);
        
        AgendaMarcacao agenda = new AgendaMarcacao();
        agenda.setIdagenda(idagenda);
        agenda.setStatus("agendado");
        
        UserAgenda useragenda = new UserAgenda();
        useragenda.setIduser(idusuario);
        useragenda.setIdagenda(idagenda);
        
        DataSource dataSource = new DataSource();
        MarcarConsultaUnidadeDAO marcarconsultaDAO = new MarcarConsultaUnidadeDAO(dataSource);
        marcarconsultaDAO.update(agenda);
        marcarconsultaDAO.create(useragenda);
        System.out.println("passou pelo agendamento no db");
        
        try{
            dataSource.getConnection().close();
        }
        catch(SQLException ex){
            System.out.println("Erro ao fechar conexao"+ex.getMessage()); 
            request.setAttribute("erroMSG","Erro ao agendar consulta");
            pagina = "/pesquisaretornoerro.jsp";
        }
        // se criou user com sucesso vai para tela principal para user conectado
        // if (usuario.getId() != 0) request.getSession().setAttribute("Usuario",usuario);
        
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
        dispatcher.forward(request, response);
        
    }


}
