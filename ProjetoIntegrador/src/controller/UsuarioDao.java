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
    
     public ResultSet buscartodos() {
    sql = "SELECT * FROM USUARIO ORDER BY USUARIO " ;
    try {
    ps = mycon.prepareStatement (sql);
    return ps.executeQuery();
    } catch (SQLException err) {
    JOptionPane.showMessageDialog (null, "Erro ao Buscar usuário!" +
    err.getMessage());
    return null;
    }
    }
     
     
    public void excluir ( String usuario ) {
    // configura o comando sql de exclusão delete por cpf
    sql = "DELETE FROM USUARIOS WHERE USUARIO = '" + usuario + "'";
    try { // envia o comando sql para dentro da conexão através de
    
    ps = mycon.prepareStatement (sql);
    // executa o comando delete dentro do mysql
    ps.execute();
    ps.close(); // fecha o objeto usado para executar o comando sql
    JOptionPane.showMessageDialog (null,"Registro Excluido com Sucesso!");
    } catch (SQLException err) {
    JOptionPane.showMessageDialog (null, "Erro ao Excluir usuário!" +
    err.getMessage());
    }}

}




