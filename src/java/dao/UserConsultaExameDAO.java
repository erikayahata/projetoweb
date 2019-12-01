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
import model.Exame;


/**
 * Projeto da disciplina Programacao WEB 
 *     UFABC - 3o quadrimestre 2019
 *     Desenvolvido por Erika Yahata
 *     Professor Francisco Isidro
 *
 * @author eyahata
 */
public class UserConsultaExameDAO implements GenericDAO{
    
    DataSource dataSource;
    
    public UserConsultaExameDAO(DataSource dataSource){
        this.dataSource = dataSource;
    }
    
    public void create(Object o){
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }
    public List<Object> read(Object o){
        try{
            if (o instanceof Exame){
                // System.out.println("entrei select consulta exame " );
                Exame incompleto = (Exame)o;
                String sql = "select idexame, idusuario, descricao, date_format(data,\"%d/%m/%Y\") data, path from exame where idusuario = ? order by data";
                PreparedStatement stm = dataSource.getConnection().prepareStatement(sql);
                stm.setInt(1,incompleto.getIdusuario());
                ResultSet rs = stm.executeQuery();
                
                ArrayList<Object> result = new ArrayList<Object>();
                while (rs.next()){
                    Exame exm = new Exame();
                    exm.setIdexame(rs.getInt("idexame"));
                    exm.setIdusuario(rs.getInt("idusuario"));
                    exm.setDescricao(rs.getString("descricao"));
                    exm.setData(rs.getString("data"));
                    exm.setPath(rs.getString("path"));

                    result.add(exm);
                }          
                rs.close();
                stm.close();  
                return result;
            }
        }
        catch(Exception ex){
            System.out.println("USEREXAME.READ - erro ao recuperar");
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
