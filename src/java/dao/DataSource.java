/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Projeto da disciplina Programacao WEB 
 *     UFABC - 3o quadrimestre 2019
 *     Desenvolvido por Erika Yahata
 *     Professor Francisco Isidro
 *
 * @author eyahata
 */
public class DataSource {
    private String hostname;
    private String username;
    private String password;
    private String database;
    private Connection connection;
    
    public DataSource(){
        try{
            hostname = "localhost";
         //   database = "saude";
            database = "saude";
            username = "portal";
            password = "p0rt@l";
            String URL="jdbc:mysql://"+hostname+":3306/"+database+"?useTimezone=true&serverTimezone=America/Sao_Paulo";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connection = DriverManager.getConnection(URL,username,password);
            System.out.println("Datasource Connected");
        }
        catch(SQLException ex){
            System.out.println("ERRO ao Conectar - "+ex.getMessage());
        } 
    }

    
    public Connection getConnection(){
        return this.connection;
    }
    
    
}
