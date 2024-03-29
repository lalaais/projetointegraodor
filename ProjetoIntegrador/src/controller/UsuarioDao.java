package controller;
import java.sql.SQLException;
import java.sql.PreparedStatement; // Dentro da conexão permite executar comandos SQL
import javax.swing.JOptionPane;
public class UsuarioDao extends ConectarDao { String sql;
PreparedStatement ps; // objeto para executar o sql
public UsuarioDao() { super(); }
public void criarBanco() {
try { sql = "create table TB_USUARIO("
    +"ID_USUARIO      int primary key auto_increment,"
    +"USUARIO         varchar(300),"
    +"SENHA           varchar(300),"
    +"FUNCAO          varchar(300))";
ps = con.prepareStatement(sql); // prepara o objeto que irá executar o comando SQL
ps.execute(); // Executa o comando SQL

sql="create table TB_PRODUTO(" 
    +"ID_PRODUTO      int primary key auto_increment," 
    +"CATEGORIA       varchar(300)," 
    +"PRODUTO         varchar(300)," 
    +"PRECO           decimal(15,2)," 
    +"QTD             int,"
    +"DESCRICAO       varchar(300)),";
ps = con.prepareStatement(sql); // prepara o objeto que irá executar o comando SQL
ps.execute(); // Executa o comando SQL

sql = "create table TB_FORNECEDOR("
    +"ID_FORNECEDOR   int primary key auto_increment,"
    +"NOME            varchar(300),"
    +"NUMERO          varchar(300)),";
ps = con.prepareStatement(sql); // prepara o objeto que irá executar o comando SQL
ps.execute(); // Executa o comando SQL

ps.close(); // Fecha o objeto
con.close(); // Fecha 
JOptionPane.showMessageDialog(null, "Banco criado com sucesso...");
} catch (SQLException err) {
JOptionPane.showMessageDialog(null, "Erro ao criar banco de dados " + err.getMessage() );
}}}