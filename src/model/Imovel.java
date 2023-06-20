/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author SAMSUNG
 */
public class Imovel {

    private String status, tipo_imovel, descricao, endereco,fotos;
    private int proprietario_idproprietario, n_vagas_garagem, qtd_sala_jantar, qtd_salas, qtd_suites, qtd_quartos, andar,id_imovel;
    private float area, valor, valor_imobiliaria, valor_con, largura, comprimento;
    private boolean armario, portaria, aclive_declive, disponivel;
    
    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the tipo_imovel
     */
    public String getTipo_imovel() {
        return tipo_imovel;
    }

    /**
     * @param tipo_imovel the tipo_imovel to set
     */
    public void setTipo_imovel(String tipo_imovel) {
        this.tipo_imovel = tipo_imovel;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the fotos
     */
    public String getFotos() {
        return fotos;
    }

    /**
     * @param fotos the fotos to set
     */
    public void setFotos(String fotos) {
        this.fotos = fotos;
    }

    /**
     * @return the proprietario_idproprietario
     */
    public int getProprietario_idproprietario() {
        return proprietario_idproprietario;
    }

    /**
     * @param proprietario_idproprietario the proprietario_idproprietario to set
     */
    public void setProprietario_idproprietario(int proprietario_idproprietario) {
        this.proprietario_idproprietario = proprietario_idproprietario;
    }

    /**
     * @return the n_vagas_garagem
     */
    public int getN_vagas_garagem() {
        return n_vagas_garagem;
    }

    /**
     * @param n_vagas_garagem the n_vagas_garagem to set
     */
    public void setN_vagas_garagem(int n_vagas_garagem) {
        this.n_vagas_garagem = n_vagas_garagem;
    }

    /**
     * @return the qtd_sala_jantar
     */
    public int getQtd_sala_jantar() {
        return qtd_sala_jantar;
    }

    /**
     * @param qtd_sala_jantar the qtd_sala_jantar to set
     */
    public void setQtd_sala_jantar(int qtd_sala_jantar) {
        this.qtd_sala_jantar = qtd_sala_jantar;
    }

    /**
     * @return the qtd_salas
     */
    public int getQtd_salas() {
        return qtd_salas;
    }

    /**
     * @param qtd_salas the qtd_salas to set
     */
    public void setQtd_salas(int qtd_salas) {
        this.qtd_salas = qtd_salas;
    }

    /**
     * @return the qtd_suites
     */
    public int getQtd_suites() {
        return qtd_suites;
    }

    /**
     * @param qtd_suites the qtd_suites to set
     */
    public void setQtd_suites(int qtd_suites) {
        this.qtd_suites = qtd_suites;
    }

    /**
     * @return the qtd_quartos
     */
    public int getQtd_quartos() {
        return qtd_quartos;
    }

    /**
     * @param qtd_quartos the qtd_quartos to set
     */
    public void setQtd_quartos(int qtd_quartos) {
        this.qtd_quartos = qtd_quartos;
    }

    /**
     * @return the andar
     */
    public int getAndar() {
        return andar;
    }

    /**
     * @param andar the andar to set
     */
    public void setAndar(int andar) {
        this.andar = andar;
    }

    /**
     * @return the id_imovel
     */
    public int getId_imovel() {
        return id_imovel;
    }

    /**
     * @param id_imovel the id_imovel to set
     */
    public void setId_imovel(int id_imovel) {
        this.id_imovel = id_imovel;
    }

    /**
     * @return the area
     */
    public float getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(float area) {
        this.area = area;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * @return the valor_imobiliaria
     */
    public float getValor_imobiliaria() {
        return valor_imobiliaria;
    }

    /**
     * @param valor_imobiliaria the valor_imobiliaria to set
     */
    public void setValor_imobiliaria(float valor_imobiliaria) {
        this.valor_imobiliaria = valor_imobiliaria;
    }

    /**
     * @return the valor_con
     */
    public float getValor_con() {
        return valor_con;
    }

    /**
     * @param valor_con the valor_con to set
     */
    public void setValor_con(float valor_con) {
        this.valor_con = valor_con;
    }

    /**
     * @return the largura
     */
    public float getLargura() {
        return largura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(float largura) {
        this.largura = largura;
    }

    /**
     * @return the comprimento
     */
    public float getComprimento() {
        return comprimento;
    }

    /**
     * @param comprimento the comprimento to set
     */
    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    /**
     * @return the armario
     */
    public boolean isArmario() {
        return armario;
    }

    /**
     * @param armario the armario to set
     */
    public void setArmario(boolean armario) {
        this.armario = armario;
    }

    /**
     * @return the portaria
     */
    public boolean isPortaria() {
        return portaria;
    }

    /**
     * @param portaria the portaria to set
     */
    public void setPortaria(boolean portaria) {
        this.portaria = portaria;
    }

    /**
     * @return the aclive_declive
     */
    public boolean isAclive_declive() {
        return aclive_declive;
    }

    /**
     * @param aclive_declive the aclive_declive to set
     */
    public void setAclive_declive(boolean aclive_declive) {
        this.aclive_declive = aclive_declive;
    }

    /**
     * @return the disponivel
     */
    public boolean isDisponivel() {
        return disponivel;
    }

    /**
     * @param disponivel the disponivel to set
     */
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
}
