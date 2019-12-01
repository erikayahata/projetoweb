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
public class RetornoUnidadeDAO implements GenericDAO{
    
    DataSource dataSource;
    
    public RetornoUnidadeDAO(DataSource dataSource){
        this.dataSource = dataSource;
    }
    
    public void create(Object o){
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }
    public List<Object> read(Object o){
        try{
            if (o instanceof Unidade){
                Unidade incompleto3 = (Unidade)o;
                String sql = "SELECT e.especialidade FROM especialidade e, unidadeatendimento u,  especialidadeatendimento ea where u.nome = ?  and ea.idunidadeatendimento = u.idunidadeatendimento  and e.idespecialidade = ea.idespecialidade" ;
                PreparedStatement stm = dataSource.getConnection().prepareStatement(sql);
                stm.setString(1,incompleto3.getUnidade());
                ResultSet rs = stm.executeQuery();
                
                ArrayList<Object> result = new ArrayList<Object>();
                while (rs.next()){
                    Especialidade especialidade = new Especialidade();
                    especialidade.setEspecialidade(rs.getString("especialidade"));

                    result.add(especialidade);
                }          
                rs.close();
                stm.close();  
                return result;
            }
        }
        catch(Exception ex){
            System.out.println("ESPECIALIDADE.READ - erro ao recuperar");
            System.out.println(ex.getMessage());
        }
        return null;
    }

                
    public void update(Object o){
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void delete(Object o){
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
