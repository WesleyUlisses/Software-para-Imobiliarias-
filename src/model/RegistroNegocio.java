/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author SAMSUNG
 */
public class RegistroNegocio {

    private String fiador, indicacao1, indicacao2, forma_pagar;
    private Date data;
    private int idregistro_negocio, n_contrato, imovel_idimovel, cliente_idcliente, funcionario_idfuncionario;
    private float valor_fin;
    
    /**
     * @return the fiador
     */
    public String getFiador() {
        return fiador;
    }

    /**
     * @param fiador the fiador to set
     */
    public void setFiador(String fiador) {
        this.fiador = fiador;
    }

    /**
     * @return the indicacao1
     */
    public String getIndicacao1() {
        return indicacao1;
    }

    /**
     * @param indicacao1 the indicacao1 to set
     */
    public void setIndicacao1(String indicacao1) {
        this.indicacao1 = indicacao1;
    }

    /**
     * @return the indicacao2
     */
    public String getIndicacao2() {
        return indicacao2;
    }

    /**
     * @param indicacao2 the indicacao2 to set
     */
    public void setIndicacao2(String indicacao2) {
        this.indicacao2 = indicacao2;
    }

    /**
     * @return the forma_pagar
     */
    public String getForma_pagar() {
        return forma_pagar;
    }

    /**
     * @param forma_pagar the forma_pagar to set
     */
    public void setForma_pagar(String forma_pagar) {
        this.forma_pagar = forma_pagar;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the idregistro_negocio
     */
    public int getIdregistro_negocio() {
        return idregistro_negocio;
    }

    /**
     * @param idregistro_negocio the idregistro_negocio to set
     */
    public void setIdregistro_negocio(int idregistro_negocio) {
        this.idregistro_negocio = idregistro_negocio;
    }

    /**
     * @return the n_contrato
     */
    public int getN_contrato() {
        return n_contrato;
    }

    /**
     * @param n_contrato the n_contrato to set
     */
    public void setN_contrato(int n_contrato) {
        this.n_contrato = n_contrato;
    }

    /**
     * @return the imovel_idimovel
     */
    public int getImovel_idimovel() {
        return imovel_idimovel;
    }

    /**
     * @param imovel_idimovel the imovel_idimovel to set
     */
    public void setImovel_idimovel(int imovel_idimovel) {
        this.imovel_idimovel = imovel_idimovel;
    }

    /**
     * @return the cliente_idcliente
     */
    public int getCliente_idcliente() {
        return cliente_idcliente;
    }

    /**
     * @param cliente_idcliente the cliente_idcliente to set
     */
    public void setCliente_idcliente(int cliente_idcliente) {
        this.cliente_idcliente = cliente_idcliente;
    }

    /**
     * @return the funcionario_idfuncionario
     */
    public int getFuncionario_idfuncionario() {
        return funcionario_idfuncionario;
    }

    /**
     * @param funcionario_idfuncionario the funcionario_idfuncionario to set
     */
    public void setFuncionario_idfuncionario(int funcionario_idfuncionario) {
        this.funcionario_idfuncionario = funcionario_idfuncionario;
    }

    /**
     * @return the valor_fin
     */
    public float getValor_fin() {
        return valor_fin;
    }

    /**
     * @param valor_fin the valor_fin to set
     */
    public void setValor_fin(float valor_fin) {
        this.valor_fin = valor_fin;
    }
    
    
}
