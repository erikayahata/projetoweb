/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DataSource;
import dao.UsuarioDAO;
import model.Usuario;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Endereco;

/**
 * Projeto da disciplina Programacao WEB 
 *     UFABC - 3o quadrimestre 2019
 *     Desenvolvido por Erika Yahata
 *     Professor Francisco Isidro
 *
 * @author eyahata
 */
public class ServletEfetivaCadastro extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // receber dados do formulário
        // criar um objeto usuario com estes dados mas que ainda não tem id
        // instanciar o datasource e o dao
        // gravar
        // dependendo do resultado vms trabalhar em qual pag retornar
        
        String pagina = "/userarea.jsp";
        //String pagina = "/login.jsp";
        String nome = request.getParameter("txtNome");
        String sobrenome = request.getParameter("txtSobrenome");
        int cpf = Integer.parseInt(request.getParameter("txtCpf"));
        String email = request.getParameter("txtEmail");
        String senha = request.getParameter("txtSenha");
        
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setSobrenome(sobrenome);
        usuario.setCpf(cpf);
        usuario.setEmail(email);
        usuario.setSenha(senha);
        usuario.setEnderecos(new ArrayList<Endereco>()); 

        // tratar endereços
        Endereco endC = new Endereco();
        endC.setCep(request.getParameter("txtCep"));
        endC.setTipo(0);
        endC.setTipoLogradouro(request.getParameter("txtTipo"));
        endC.setLogradouro(request.getParameter("txtLogradouro"));
        endC.setNumero(request.getParameter("txtNumero"));
        endC.setComplemento(request.getParameter("txtComplemento"));
        endC.setBairro(request.getParameter("txtBairro"));
        endC.setCidade(request.getParameter("txtCidade"));
        endC.setEstado(request.getParameter("txtEstado"));
            
        usuario.getEnderecos().add(endC);

        DataSource dataSource = new DataSource();
        UsuarioDAO usuarioDAO = new UsuarioDAO(dataSource);
        usuarioDAO.create(usuario);
        System.out.println(usuario);
        
        try{
            dataSource.getConnection().close();
        }
        catch(SQLException ex){
            System.out.println("Erro ao fechar conexao"+ex.getMessage()); 
            request.setAttribute("erroMSG","Erro ao criar nova conta de usuario");
            pagina = "/error.jsp";
        }
        // se criou user com sucesso vai para tela principal para user conectado
        if (usuario.getId() != 0){
            //System.out.println("passei no if do create user");
            request.getSession().setAttribute("Usuario",usuario);
            //System.out.println("Usuario: " + usuario);
        }
        
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
        dispatcher.forward(request, response);
        
    }


}
