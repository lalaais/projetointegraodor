package controller;

import java.sql.DriverManager; // Driver para abrir Conexão
import java.sql.SQLException; // Tratamento de Erros SQL
import java.sql.Connection; // Armazena a Conexão Aberta
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConectarDao {

    public Connection mycon = null;
    public String sql = null;
    public PreparedStatement ps;

    public ConectarDao() {
        String strcon = "jdbc:mysql://localhost:3306";//cria a string de conexão ao servidor xaamp 
        try {

            mycon = DriverManager.getConnection(strcon, "root", "");
            this.criarBanco();

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Conexão com Mysql não realizada!\n" + err.getMessage());
        }
    }

    public void criarBanco() {

        try {

            sql = " create database if not exists autopeca";
            ps = mycon.prepareStatement(sql);
            ps.execute();

            sql = " use autopeca";
            ps = mycon.prepareStatement(sql);
            ps.execute();

            sql = "CREATE TABLE IF NOT EXISTS NIVEL ("
                    + "ID_NIVEL         int primary key,"
                    + "DESNIVEL         varchar(300))";
            ps = mycon.prepareStatement(sql);
            ps.execute();

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar a tabela nível!\n" + err.getMessage());
        }

        sql = "CREATE TABLE IF NOT EXISTS USUARIO ("
                + "CPF         varchar(14) primary key,"
                + "NOME           varchar(300),"
                + "SENHA          varchar(300),"
                + "EMAIL          varchar(300),"
                + "ID_NIVEL  int not null )";

        try {
            ps = mycon.prepareStatement(sql);
            ps.execute();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar a tabela Usuário!\n" + err.getMessage());
        }

        sql = "CREATE TABLE IF NOT EXISTS FORNECEDOR ("
                + "ID_FORNECEDOR      int primary key auto_increment,"
                + "NOME               varchar(300),"
                + "NUMERO             varchar(14),"
                + "CATEGORIA           varchar(300))";

        try {
            ps = mycon.prepareStatement(sql);
            ps.execute();
            ps.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar a tabela Fornecedor!\n" + err.getMessage());
        }

        sql = "CREATE TABLE IF NOT EXISTS PRODUTO ("
                + "NOME            varchar(300) primary key ,"
                + "DESCRICAO       varchar(300),"
                + "CATEGORIA       varchar(300),"
                + "PRECO           varchar(300))";

        try {
            ps = mycon.prepareStatement(sql);
            ps.execute();

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar a tabela Produto!\n" + err.getMessage());
        }

        sql = "CREATE TABLE IF NOT EXISTS ORCAMENTO ("
                + "ID_ORCAMENTO      int primary key auto_increment,"
                + "DATA              date,"
                + "TOTAL             double(15,2))";

        try {
            ps = mycon.prepareStatement(sql);
            ps.execute();

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar a tabela Orçamento!\n" + err.getMessage());
        }

     
        try {
               sql = "CREATE TABLE IF NOT EXISTS ITEM ("
                + "ID_ITEM           int primary key auto_increment,"
                + "DATA              date,"
                + "TOTAL             double(15,2))";

            ps = mycon.prepareStatement(sql);
            ps.execute();

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar a tabela Item!\n" + err.getMessage());
        }
    }

}
