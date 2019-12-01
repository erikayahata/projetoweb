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
import model.UserAgenda;

/**
 * Projeto da disciplina Programacao WEB 
 *     UFABC - 3o quadrimestre 2019
 *     Desenvolvido por Erika Yahata
 *     Professor Francisco Isidro
 *
 * @author eyahata
 */
public class UserConsultaHistoricoDAO {
    
    DataSource dataSource;
    
    public UserConsultaHistoricoDAO(DataSource dataSource){
        this.dataSource = dataSource;
    }
    
    public void create(Object o){
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }
    public List<Object> read(Object o){
        //System.out.println("chamei historico");
        try{
            //System.out.println("trazer historico");
            if (o instanceof UserAgenda){
                //System.out.println("passei try");
                UserAgenda incompleto = (UserAgenda)o;
                String sql = "select date_format(a.data,\"%d/%m/%Y\") data, a.horario horario, m.nome medico , u.nome unidade, e.especialidade especialidade, ua.status status\n" +
                                " from agendamarcacao a, medico m, unidadeatendimento u, especialidade e, useragenda ua\n" +
                                " where ua.idusuario = ?\n" +
                                " and ua.status <> 'agendada'\n" +
                                " and a.idagenda = ua.idagenda\n" +
                                " and m.idmedico = a.idmedico\n" +
                                " and u.idunidadeatendimento = a.idunidadeatendimento\n" +
                                " and e.idespecialidade = a.idespecialidade\n" +
                                " order by data,horario";
                PreparedStatement stm = dataSource.getConnection().prepareStatement(sql);
                stm.setInt(1,incompleto.getIduser());
                ResultSet rs = stm.executeQuery();
                
                ArrayList<Object> result = new ArrayList<Object>();
                while (rs.next()){
                    AgendaMarcacao agenda = new AgendaMarcacao();
                    agenda.setMedico(rs.getString("medico"));
                    agenda.setData(rs.getString("data"));
                    agenda.setHorario(rs.getString("horario"));
                    agenda.setUnidade(rs.getString("unidade"));
                    agenda.setEspecialidade(rs.getString("especialidade"));
                    agenda.setStatus(rs.getString("status"));
                    result.add(agenda);
                }          
                rs.close();
                stm.close();  
                return result;
            }
        }
        catch(Exception ex){
            System.out.println("HISTORICO.READ - erro ao recuperar");
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

