
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.motoTaxi.negocio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author kelly silva
 */
@Table(name = "Usuario")
@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private int codigo;
    private long cpf;
    @Column(length = 50)
    private String login;
    @Column(length = 50)
    private String senha;
    private String nome;
    private String email;

    public Usuario(String login, String senha, String nome, String email, int cpf, int codigo) {
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
        this.codigo = codigo;

    }

    @Deprecated
    public Usuario() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the cpf
     */
    public long getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
