/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Especialidade;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Projeto da disciplina Programacao WEB 
 *     UFABC - 3o quadrimestre 2019
 *     Desenvolvido por Erika Yahata
 *     Professor Francisco Isidro
 *
 * @author eyahata
 */
public class EspecialidadeDAO implements GenericDAO2{
    
    DataSource dataSource;
    
    public EspecialidadeDAO(DataSource dataSource){
        this.dataSource = dataSource;
    }
    
    public void create(Object o){
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }
    public List<Object> read(){
         List<Object> result = null;
        try{
            String sql = "SELECT * FROM especialidade order by especialidade";
            PreparedStatement stm = dataSource.getConnection().prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            result = new ArrayList<>();
            while (rs.next()){
                Especialidade e= new Especialidade();
                e.setEspecialidade(rs.getString("especialidade")); // aqui é o nome da coluna na tablea
                result.add(e);
            }
            rs.close();
            stm.close();
        }
        catch(Exception ex){
            System.out.println("ESPECIALIDADEDAO.READ - erro ao recuperar");
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
