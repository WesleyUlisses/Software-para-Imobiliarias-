/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author SAMSUNG
 */
public class Conection {
    public static Connection getConexao() {
    Connection conn = null;
        try {
            //Estabelece conexao
            String url = "jdbc:mysql://localhost:3306/banco_bd_final_v2";
            String usuario = "root";
            String senha ="2002";
            conn =  DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException erro) {
            //Erro conexao
            
            JOptionPane.showMessageDialog(null, "Erro ao conectar " + erro.getMessage());
            System.out.println("Erro ao conectar " + erro.getMessage());

        }
        return conn;
  }
  
  //Método que fecha sua conexão//
    public static boolean closeConexao() {
        try {
            getConexao().close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}
