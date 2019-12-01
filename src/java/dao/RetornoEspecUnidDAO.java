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
import model.EspecUnid;
import model.Unidade;

/**
 * Projeto da disciplina Programacao WEB 
 *     UFABC - 3o quadrimestre 2019
 *     Desenvolvido por Erika Yahata
 *     Professor Francisco Isidro
 *
 * @author eyahata
 */
public class RetornoEspecUnidDAO implements GenericDAO{
    
    DataSource dataSource;
    
    public RetornoEspecUnidDAO(DataSource dataSource){
        this.dataSource = dataSource;
    }
    
    public void create(Object o){
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }
    public List<Object> read(Object o){
        try{
            //System.out.println("especunid " + o);
            if (o instanceof EspecUnid){
                EspecUnid incompleto = (EspecUnid)o;
                String sql = "SELECT nome, logradouro, numero, cidade, estado, cep FROM unidadeatendimento u, especialidade e , especialidadeatendimento ea where u.nome = ? and e.especialidade = ? and e.idespecialidade = ea.idespecialidade and u.idunidadeatendimento = ea.idunidadeatendimento" ;
                PreparedStatement stm = dataSource.getConnection().prepareStatement(sql);
                stm.setString(1,incompleto.getUnidade());
                stm.setString(2,incompleto.getEspecialidade());
                ResultSet rs = stm.executeQuery();
                
                ArrayList<Object> result = new ArrayList<Object>();
                while (rs.next()){
                    Unidade unidade = new Unidade();
                    unidade.setUnidade(rs.getString("nome"));
                    unidade.setLogradouro(rs.getString("logradouro"));
                    unidade.setNumero(rs.getString("numero"));
                    unidade.setCidade(rs.getString("cidade"));
                    unidade.setEstado(rs.getString("estado"));
                    unidade.setCep(rs.getInt("cep"));

                    result.add(unidade);
                }          
                rs.close();
                stm.close();  
                return result;
            }
        }
        catch(Exception ex){
            System.out.println("ESPECUNIDDAO.READ - erro ao recuperar");
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
