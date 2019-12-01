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
public class UserConsultaAgendadaDAO implements GenericDAO{
    
    DataSource dataSource;
    
    public UserConsultaAgendadaDAO(DataSource dataSource){
        this.dataSource = dataSource;
    }
    
    public void create(Object o){
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }
    public List<Object> read(Object o){
        try{
            if (o instanceof UserAgenda){
                // System.out.println("entrei select consulta " );
                UserAgenda incompleto = (UserAgenda)o;
                String sql = "select ua.idagenda idagenda, date_format(a.data,\"%d/%m/%Y\") data, a.horario horario, m.nome medico, e.especialidade, u.nome unidade\n" +
                                " from agendamarcacao a, medico m, especialidade e, unidadeatendimento u, useragenda ua\n" +
                                " where ua.idusuario = ?\n" +
                                " and a.idagenda = ua.idagenda\n" +
                                " and m.idmedico = a.idmedico\n" +
                                " and e.idespecialidade = a.idespecialidade\n" +
                                " and u.idunidadeatendimento = a.idunidadeatendimento\n" +
                                " and ua.status = \"agendada\"\n"+
                                " order by data,horario";
                PreparedStatement stm = dataSource.getConnection().prepareStatement(sql);
                stm.setInt(1,incompleto.getIduser());
                ResultSet rs = stm.executeQuery();
                
                ArrayList<Object> result = new ArrayList<Object>();
                while (rs.next()){
                    AgendaMarcacao consulta = new AgendaMarcacao();
                    consulta.setIdagenda(rs.getInt("idagenda"));
                    consulta.setData(rs.getString("data"));
                    consulta.setData(rs.getString("data"));
                    consulta.setHorario(rs.getString("horario"));
                    consulta.setMedico(rs.getString("medico"));
                    consulta.setEspecialidade(rs.getString("especialidade"));
                    consulta.setUnidade(rs.getString("unidade"));

                    result.add(consulta);
                }          
                rs.close();
                stm.close();  
                return result;
            }
        }
        catch(Exception ex){
            System.out.println("USERAGENDA.READ - erro ao recuperar");
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
