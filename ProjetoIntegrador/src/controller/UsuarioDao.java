package controller;

import model.usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class UsuarioDao extends ConectarDao {
    private PreparedStatement ps;
    public UsuarioDao() {
        super();
    }
    
    public void incluir(usuario obj) { 
        sql = "INSERT INTO USUARIO (?,?,?)";
        try {
            ps = mycon.prepareStatement(sql);
            ps.setString(1,obj.getUsuario());
            ps.setString(2,obj.getSenha());
            ps.setString(3,obj.getFuncao());
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null,"Registro Incluído com Sucesso!");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao incluir usuário!" + err.getMessage());
        }
    }
    
    public ResultSet validarLogin (String login, String senha)   { 
        sql = "SELECT * FROM USUARIO WHERE ucase(usuario) = ucase('"+login+"') "
              + "and senha = ucase('"+ senha +"')";
   
        try {
            ps = mycon.prepareStatement(sql);
            return ps.executeQuery();
            
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar usuário!" + err.getMessage());
            return null; 
        }
    }

}




