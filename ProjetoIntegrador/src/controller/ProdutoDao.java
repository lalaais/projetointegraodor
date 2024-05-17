package controller;
//teste
import model.produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ProdutoDao extends ConectarDao {
    private PreparedStatement ps;
    public ProdutoDao(){
        super();
    }
    
    public void cadastrar(produto obj){
        sql = "INSERT INTO PRODUTO VALUE ( ?, ?, ?, ?)";
        try {
            ps = mycon.prepareStatement (sql);
            ps.setString(1, obj.getNome());
            ps.setString(2,obj.getDescricao());
            ps.setString(3, obj.getCategoria());
            ps.setString(4,obj.getPreco());
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Registro Incluído com Sucesso!");            
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null , "Erro ao incluir produto!" + err.getMessage());
        }
    }
    
    public ResultSet buscartodos() {
        sql = "SELECT * FROM PRODUTO ORDER BY nome ";
        try {
            ps = mycon.prepareStatement (sql);
            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar usuário!" + 
            err.getMessage());
            return null;
        }
    }
    
    public void excluir (String produto ) {
        sql = "DELETE FROM PRODUTO WHERE nome = '" + produto + "'";
        try {
            ps = mycon.prepareStatement (sql);
            ps.execute();
            ps.close(); 
            JOptionPane.showMessageDialog (null,"Registro Excluido com Sucesso!");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog (null, "Erro ao Excluir produto!" +
            err.getMessage());
        }
    }
}
