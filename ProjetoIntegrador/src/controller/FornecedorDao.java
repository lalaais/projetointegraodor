/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.fornecedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import javax.swing.JOptionPane;
public class FornecedorDao extends ConectarDao{
    private PreparedStatement ps;
    public FornecedorDao() {
        super();
    }

public void incluir(fornecedor obj) { 
        sql = "INSERT INTO FORNECEDOR VALUE ( ?, ?, ?, ?)";
        try {
            ps = mycon.prepareStatement(sql);
            ps.setInt(1, obj.getIdFornecedor());
            ps.setString(2, obj.getNome());
            ps.setString(3,obj.getNumero());
            ps.setString(4,obj.getCategoria());
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null,"Fornecedor Incluído com Sucesso!");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao incluir fornecedor!" + err.getMessage());
        }
    }
}

