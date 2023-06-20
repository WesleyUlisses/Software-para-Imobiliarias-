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
public class Funcionario extends Pessoa{

    
    private String cargo, login, senha;
    private Date dataAdimissao;
    private float salarioBase, salarioFin, porcenComicao;
    
    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the dataAdimissao
     */
    public Date getDataAdimissao() {
        return dataAdimissao;
    }

    /**
     * @param dataAdimissao the dataAdimissao to set
     */
    public void setDataAdimissao(Date dataAdimissao) {
        this.dataAdimissao = dataAdimissao;
    }

    /**
     * @return the salarioBase
     */
    public float getSalarioBase() {
        return salarioBase;
    }

    /**
     * @param salarioBase the salarioBase to set
     */
    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * @return the salarioFin
     */
    public float getSalarioFin() {
        return salarioFin;
    }

    /**
     * @param salarioFin the salarioFin to set
     */
    public void setSalarioFin(float salarioFin) {
        this.salarioFin = salarioFin;
    }

    /**
     * @return the porcenComicao
     */
    public float getPorcenComicao() {
        return porcenComicao;
    }

    /**
     * @param porcenComicao the porcenComicao to set
     */
    public void setPorcenComicao(float porcenComicao) {
        this.porcenComicao = porcenComicao;
    }
    
    
}
