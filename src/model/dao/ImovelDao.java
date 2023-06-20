/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Imovel;
import conection.Conection;
import javax.swing.JOptionPane;

/**
 *
 * @author SAMSUNG
 */
public class ImovelDao {
    
    private Connection conexao;

    public ImovelDao() {
        this.conexao = new Conection().getConexao();
    }
    
    public void Cadastrar(Imovel place) {
        try {
            // Comando SQL de inserção
            String sql = "INSERT INTO imovel (status, tipo_imovel, descricao, endereco, fotos, proprietario_idproprietario, n_vagas_garagem, qtd_sala_jantar, qtd_salas, qtd_suites, qtd_quartos, andar, area, valor, valor_imobiliaria, valor_con, largura, comprimento, armario, portaria, aclive_declive, disponivel) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            // Preparar o comando SQL
            PreparedStatement statement = conexao.prepareStatement(sql); 

            // Definir os valores dos parâmetros
            statement.setString(1, place.getStatus());
            statement.setString(2, place.getTipo_imovel());
            statement.setString(3, place.getDescricao());
            statement.setString(4, place.getEndereco());
            statement.setString(5, place.getFotos());
            statement.setInt(6, place.getProprietario_idproprietario());
            statement.setInt(7, place.getN_vagas_garagem());
            statement.setInt(8, place.getQtd_sala_jantar());
            statement.setInt(9, place.getQtd_salas());
            statement.setInt(10, place.getQtd_suites());
            statement.setInt(11, place.getQtd_quartos());
            statement.setInt(12, place.getAndar());
            statement.setFloat(13, place.getArea());
            statement.setFloat(14, place.getValor());
            statement.setFloat(15, place.getValor_imobiliaria());
            statement.setFloat(16, place.getValor_con());
            statement.setFloat(17, place.getLargura());
            statement.setFloat(18, place.getComprimento());
            statement.setBoolean(19, place.isArmario());
            statement.setBoolean(20, place.isPortaria());
            statement.setBoolean(21, place.isAclive_declive());
            statement.setBoolean(22, place.isDisponivel());

            // Executar o comando de inserção
            statement.executeUpdate();

            // Fechar a conexão e o statement
            statement.close();
            conexao.close();

            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso no banco de dados.");
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null,"Erro ao inserir os dados no banco de dados: " + e.getMessage());
             System.out.println("Erro ao inserir os dados no banco de dados: " + e.getMessage());
        }
    }
    public List<Imovel> ConsultarPorBairro(String bairro) {

        try {
            String sql = "SELECT * FROM imovel WHERE endereco LIKE '%"+bairro+"%'";
            PreparedStatement ps = conexao.prepareStatement(sql);  //obejeto Stament         
            ResultSet rs = ps.executeQuery();                  //Executa sql

            List<Imovel> listaImoveis = new ArrayList<Imovel>();  // Criar lista a retornar

            while (rs.next()) {

                Imovel place = new Imovel();                 //Cria novo produto 
                
                place.setEndereco(rs.getString("endereco"));
                place.setId_imovel(rs.getInt("idimovel"));
                place.setStatus(rs.getString("status"));
                place.setArea(rs.getFloat("area"));
                place.setTipo_imovel(rs.getString("tipo_imovel"));
                place.setDescricao(rs.getString("descricao"));
                place.setValor(rs.getFloat("valor"));
                place.setValor_imobiliaria(rs.getFloat("valor_imobiliaria"));
                place.setAndar(rs.getInt("andar"));
                place.setQtd_quartos(rs.getInt("qtd_quartos"));
                place.setValor_con(rs.getFloat("valor_con"));
                place.setQtd_suites(rs.getInt("qtd_suites"));
                place.setQtd_salas(rs.getInt("qtd_salas"));
                place.setQtd_sala_jantar(rs.getInt("qtd_sala_jantar"));
                place.setN_vagas_garagem(rs.getInt("n_vagas_garagem"));
                place.setPortaria(rs.getBoolean("portaria"));
                place.setArmario(rs.getBoolean("armario"));
                place.setLargura(rs.getFloat("largura"));
                place.setComprimento(rs.getFloat("comprimento"));
                place.setAclive_declive(rs.getBoolean("aclive_declive"));
                place.setFotos(rs.getString("fotos"));
                place.setDisponivel(rs.getBoolean("disponivel"));
                place.setProprietario_idproprietario(rs.getInt("proprietario_idproprietario"));

                listaImoveis.add(place);                          // add Usuario na lista 
            }

            return listaImoveis;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public String buscarProprietario(int id){
        
        try {
            String sql = "SELECT * FROM proprietario WHERE idproprietario LIKE '"+id+"'";
            PreparedStatement ps = conexao.prepareStatement(sql);  //obejeto Stament         
            ResultSet rs = ps.executeQuery();                  //Executa sql

            String nome;  // Criar lista a retornar

            while (rs.next()) {

                nome = rs.getString("nome");                 //Cria novo produto 
                
                   
                return nome;              // add Usuario na lista 
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        
        return null;
    }
}
