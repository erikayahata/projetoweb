/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import model.Unidade;

/**
 * Projeto da disciplina Programacao WEB 
 *     UFABC - 3o quadrimestre 2019
 *     Desenvolvido por Erika Yahata
 *     Professor Francisco Isidro
 *
 * @author eyahata
 */
public class UnidadeDAO implements GenericDAO2{
    
    DataSource dataSource;
    
    public UnidadeDAO(DataSource dataSource){
        this.dataSource = dataSource;
    }
    
    public void create(Object o){
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }
    public List<Object> read(){
         List<Object> result = null;
        try{
            String sql = "SELECT nome FROM unidadeatendimento order by nome";
            PreparedStatement stm = dataSource.getConnection().prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            result = new ArrayList<>();
            while (rs.next()){
                Unidade u= new Unidade();
                u.setUnidade(rs.getString("nome")); // aqui é o nome da coluna na tablea
                result.add(u);
            }
            rs.close();
            stm.close();
        }
        catch(Exception ex){
            System.out.println("UNIDADEDAO.READ - erro ao recuperar");
            System.out.println(ex.getMessage());
        }
        return result;
    }
                
    public void update(Object o){
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void delete(Object o){
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
