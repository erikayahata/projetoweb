/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import model.AgendaMarcacao;
import model.Especialidade;
import model.Unidade;
import model.UserAgenda;
import model.Usuario;

/**
 * Projeto da disciplina Programacao WEB 
 *     UFABC - 3o quadrimestre 2019
 *     Desenvolvido por Erika Yahata
 *     Professor Francisco Isidro
 *
 * @author eyahata
 */
public class MarcarConsultaUnidadeDAO implements GenericDAO{
    
    DataSource dataSource;
    
    public MarcarConsultaUnidadeDAO(DataSource dataSource){
        this.dataSource = dataSource;
    }
    
    public void create(Object o){
        try{
            if (o instanceof UserAgenda){
                UserAgenda agenda = (UserAgenda)o;
                String SQL = "INSERT INTO useragenda VALUES (?, ?, 'agendada')";
                PreparedStatement stm = dataSource.getConnection().prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
                stm.setInt(1, agenda.getIduser());
                stm.setInt(2, agenda.getIdagenda());

                int res = stm.executeUpdate();
                if (res !=0){
                    ResultSet rs = stm.getGeneratedKeys();
                    if (rs.next()){
                        agenda.setIduser(rs.getInt(1));
                    }
                    rs.close();  
                }
                stm.close();
            }
            else{
                throw new RuntimeException("Invalid User Model Object");
            }
            
        }
        catch(SQLException ex){
            System.out.println("Erro no agendamento da consulta."+ex.getMessage());
        }               
        
    }
    public List<Object> read(Object o){
        try{
            System.out.println("passei try da especialidade trazer unidade");
            if (o instanceof Especialidade){
                //System.out.println("passei try da especialidade trazer unidade 2");
                Especialidade incompleto = (Especialidade)o;
                String sql = "SELECT u.nome FROM unidadeatendimento u, especialidade e , especialidadeatendimento ea  where e.especialidade = ? and e.idespecialidade = ea.idespecialidade and u.idunidadeatendimento = ea.idunidadeatendimento order by u.nome" ;
                PreparedStatement stm = dataSource.getConnection().prepareStatement(sql);
                stm.setString(1,incompleto.getEspecialidade());
                ResultSet rs = stm.executeQuery();
                
                ArrayList<Object> result = new ArrayList<Object>();
                while (rs.next()){
                    Unidade unidade = new Unidade();
                    unidade.setUnidade(rs.getString("nome"));
                    result.add(unidade);
                }          
                rs.close();
                stm.close();  
                return result;
            }
        }
        catch(Exception ex){
            System.out.println("UNIDADE.READ - erro ao recuperar");
            System.out.println(ex.getMessage());
        }
        return null;
    }

                
    public void update(Object o){
        try{
            if (o instanceof AgendaMarcacao){
                AgendaMarcacao marcacao = (AgendaMarcacao)o;
                String SQL = "UPDATE agendamarcacao SET status = ?  WHERE idagenda = ?";
                //PreparedStatement stm = dataSource.getConnection().prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
                PreparedStatement stm = dataSource.getConnection().prepareStatement(SQL);
                stm.setString(1, marcacao.getStatus());
                stm.setInt(2, marcacao.getIdagenda());

                int res = stm.executeUpdate();
                /**if (res !=0){
                    ResultSet rs = stm.getGeneratedKeys();
                    if (rs.next()){
                        agenda.setIduser(rs.getInt(1));
                    }
                    rs.close();  
                } **/
                stm.close();
            }
            else{
                throw new RuntimeException("Invalid User Model Object");
            }
            
        }
        catch(SQLException ex){
            System.out.println("Erro no agendamento da consulta."+ex.getMessage());
        }      
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void delete(Object o){
        try{
            if (o instanceof UserAgenda){
                UserAgenda agenda = (UserAgenda)o;
                String SQL = "DELETE FROM useragenda WHERE idagenda = ? and idusuario = ?";
                //PreparedStatement stm = dataSource.getConnection().prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
                PreparedStatement stm = dataSource.getConnection().prepareStatement(SQL);
                stm.setInt(1, agenda.getIdagenda());
                stm.setInt(2, agenda.getIduser());
                
                //System.out.println("passou do delete");
                int res = stm.executeUpdate();
                
                //System.out.println("passou do res");
                
                /**if (res !=0){
                    ResultSet rs = stm.getGeneratedKeys();
                    if (rs.next()){
                        agenda.setIduser(rs.getInt(1));
                    }
                    rs.close();  
                } **/
                stm.close();
            }
            else{
                throw new RuntimeException("Invalid User Model Object");
            }
            
        }
        catch(SQLException ex){
            System.out.println("Erro no cancelamento da consulta."+ex.getMessage());
        }  
    }
}
