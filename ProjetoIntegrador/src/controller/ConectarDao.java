package controller;

import java.sql.DriverManager; // Driver para abrir Conexão
import java.sql.SQLException; // Tratamento de Erros SQL
import java.sql.Connection; // Armazena a Conexão Aberta
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConectarDao {
    public  Connection mycon = null;
    public String       sql = null;
    public PreparedStatement ps; 
    
    
    public ConectarDao () {
       String strcon = "jdbc:mysql://localhost:3306/autopeca";//cria a string de conexão ao servidor xaamp 
       try {

           mycon = DriverManager.getConnection(strcon, "root", "");
           this.criarBanco();
            
       } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Conexão com Mysql não realizada!\n" + err.getMessage());
       }
    }
    
    public void criarBanco() {
            sql = "CREATE TABLE IF NOT EXISTS USUARIO ("
                  + "ID_USUARIO       int primary key auto_increment,"
                  + "USUARIO          varchar(300),"
                  + "SENHA            varchar(300),"
                  + "FUNCAO           varchar(300))";

            try {
                PreparedStatement ps = mycon.prepareStatement(sql);
                ps.execute();
                ps.close();
            } catch (SQLException err) {
                JOptionPane.showMessageDialog(null, "Erro ao criar a tabela Usuário!\n" + err.getMessage());
            }

        sql = "CREATE TABLE IF NOT EXISTS PRODUTO ("
            +"ID_PRODUTO      int primary key auto_increment," 
            +"CATEGORIA       varchar(300)," 
            +"PRODUTO         varchar(300)," 
            +"PRECO           decimal(15,2)," 
            +"QTD             int,"
            +"DESCRICAO       varchar(300))";

        try {
                PreparedStatement ps = mycon.prepareStatement(sql);
                ps.execute();
                ps.close();
            } catch (SQLException err) {
                JOptionPane.showMessageDialog(null, "Erro ao criar a tabela Produto!\n" + err.getMessage());
            }

        sql = "CREATE TABLE IF NOT EXISTS FORNECEDOR ("
            +"ID_USUARIO      int primary key auto_increment,"
            +"USUARIO         varchar(300),"
            +"SENHA           varchar(300),"
            +"FUNCAO          varchar(300))";

        try {
                PreparedStatement ps = mycon.prepareStatement(sql);
                ps.execute();
                ps.close();
            } catch (SQLException err) {
                JOptionPane.showMessageDialog(null, "Erro ao criar a tabela Fornecedor!\n" + err.getMessage());
            }
    }
    
    
    
    
    
    
}



