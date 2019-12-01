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
import model.AgendaMarcacao;

/**
 * Projeto da disciplina Programacao WEB 
 *     UFABC - 3o quadrimestre 2019
 *     Desenvolvido por Erika Yahata
 *     Professor Francisco Isidro
 *
 * @author eyahata
 */
public class RetornoAgendaMarcacaoDAO {
    
    DataSource dataSource;
    
    public RetornoAgendaMarcacaoDAO(DataSource dataSource){
        this.dataSource = dataSource;
    }
    
    public void create(Object o){
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }
    public List<Object> read(Object o){
        System.out.println("chamei");
        try{
            //System.out.println("trazer horarios");
            if (o instanceof AgendaMarcacao){
                AgendaMarcacao incompleto = (AgendaMarcacao)o;
                String sql = "SELECT m.nome, date_format(a.data,\"%d/%m/%Y\") data, a.horario, a.idagenda FROM agendamarcacao a, especialidade e , unidadeatendimento u, medico m where e.especialidade = ? and u.nome = ? and a.idespecialidade = e.idespecialidade and a.idunidadeatendimento = u.idunidadeatendimento and m.idmedico = a.idmedico and a.status = 'livre' order by data,horario" ;
                PreparedStatement stm = dataSource.getConnection().prepareStatement(sql);
                stm.setString(1,incompleto.getEspecialidade());
                stm.setString(2,incompleto.getUnidade());
                ResultSet rs = stm.executeQuery();
                
                ArrayList<Object> result = new ArrayList<Object>();
                while (rs.next()){
                    AgendaMarcacao agenda = new AgendaMarcacao();
                    agenda.setMedico(rs.getString("nome"));
                    agenda.setData(rs.getString("data"));
                    agenda.setHorario(rs.getString("horario"));
                    agenda.setIdagenda(rs.getInt("idagenda"));
                    result.add(agenda);
                }          
                rs.close();
                stm.close();  
                return result;
            }
        }
        catch(Exception ex){
            System.out.println("AGENDA.READ - erro ao recuperar");
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

