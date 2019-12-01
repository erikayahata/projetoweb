/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import model.Endereco;


/**
 * Projeto da disciplina Programacao WEB 
 *     UFABC - 3o quadrimestre 2019
 *     Desenvolvido por Erika Yahata
 *     Professor Francisco Isidro
 *
 * @author eyahata
 */
public class UsuarioDAO implements GenericDAO {
    
    private DataSource dataSource;
     private int Stat;
    public UsuarioDAO(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public void create(Object o){
        try{
            if (o instanceof Usuario){
                Usuario usuario = (Usuario)o;
                String SQL = "INSERT INTO usuario VALUES (null, ?, ?, ?, null, ?,?)";
                PreparedStatement stm = dataSource.getConnection().prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
                stm.setString(1, usuario.getEmail());
                stm.setString(2, usuario.getNome());
                stm.setString(3, usuario.getSobrenome());
                stm.setInt(4, usuario.getCpf());
                stm.setString(5, usuario.getSenha());
                int res = stm.executeUpdate();
                if (res !=0){
                    ResultSet rs = stm.getGeneratedKeys();
                    if (rs.next()){
                        usuario.setId(rs.getInt(1));
                        for (Endereco e : usuario.getEnderecos()) {
                            //System.out.println("entrei no insert endereco");
                            e.setUsuario(usuario);
                            SQL = "INSERT INTO endereco values (null, ?,?,?,?,?,?,?,?,?)";
                            stm = dataSource.getConnection().prepareStatement(SQL);
                            stm.setString(1,e.getTipoLogradouro());
                            stm.setString(2,e.getLogradouro());
                            stm.setString(3,e.getNumero());
                            stm.setString(4,e.getComplemento());
                            stm.setString(5,e.getBairro());
                            stm.setString(6,e.getCidade());
                            stm.setString(7,e.getEstado());
                            stm.setString(8,e.getCep());
                            stm.setInt(9, e.getUsuario().getId());
                            stm.executeUpdate();
                        }
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
            System.out.println("Erro ao inserir usuario: "+ex.getMessage());
        }
    }
    
            
    public List<Object> read(Object o){
        try{
            if (o instanceof Usuario){
                Usuario incompleto = (Usuario)o;
                String SQL = "SELECT idusuario, nome FROM usuario WHERE email = ? AND senha = ?";
                PreparedStatement stm = dataSource.getConnection().prepareStatement(SQL);
                stm.setString(1,incompleto.getEmail());
                stm.setString(2, incompleto.getSenha());
                ResultSet rs = stm.executeQuery();
                ArrayList<Object> result = new ArrayList<Object>();
                if (rs.next()){
                    Usuario usuario = new Usuario();
                    usuario.setId(rs.getInt("idusuario"));
                    usuario.setNome(rs.getString("nome"));
                    result.add(usuario);
                }
                stm.close();
                rs.close();
                return result;
            }
            else{
                throw new RuntimeException("Invalid Object");
            }
            
        }
        catch(SQLException ex){
            System.out.println("Erro ao recuperar usuario "+ex.getMessage());
        }
        return null;
    }
    
    
    public void update(Object o){
        
    }
    
    public void delete(Object o){
        
    }
}
