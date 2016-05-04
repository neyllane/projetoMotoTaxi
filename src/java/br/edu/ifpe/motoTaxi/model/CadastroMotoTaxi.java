/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.motoTaxi.model;

import br.edu.ifpe.projetoMotoTaxi.model.Moto;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author kelly silva
 */
@Entity(name = "CadastroMotoTaxi")
public class CadastroMotoTaxi implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    @Column(name = "cpf", length = 15, unique = true, nullable = false)
    private String cpf;
    @Column(length = 15)
    private int numResgistro;
    @Column(length = 10)
    private String rg;
    @Column(length = 50)
    private String endereco;
    @Column(length = 16)
    private int NumCelular;
    @Column(length = 50)
    private String email;
    @Column(length = 50)
    private String ponto_praca;
    @Column(length = 50)
    private Moto MotoDoMotoTaxi;

    public CadastroMotoTaxi(String nome, String cpf, String rg, int rumRegistro,
            String endereco, int NumCelular, String email,
            String ponto_praca, Moto MotoDoMotoTaxi) {
        this.nome = nome;
        this.rg = rg;
        this.endereco = endereco;
        this.NumCelular = NumCelular;
        this.email = email;
        this.ponto_praca = ponto_praca;
        this.MotoDoMotoTaxi = MotoDoMotoTaxi;
        this.numResgistro = numResgistro;
        this.cpf = cpf;
    }

    public CadastroMotoTaxi() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumCelular() {
        return NumCelular;
    }

    public void setNumCelular(int numCelular) {
        NumCelular = numCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPonto_praca() {
        return ponto_praca;
    }

    public void setPonto_praca(String ponto_praca) {
        this.ponto_praca = ponto_praca;
    }

    public Moto getMotoDoMotoTaxi() {
        return MotoDoMotoTaxi;
    }

    public void setMotoDoMotoTaxi(Moto MotoDoMotoTaxi) {
        this.MotoDoMotoTaxi = MotoDoMotoTaxi;
    }

    /**
     * @return the NumResgistro
     */
    public int getNumResgistro() {
        return numResgistro;
    }

    /**
     * @param NumResgistro the NumResgistro to set
     */
    public void setNumResgistro(int NumResgistro) {
        this.numResgistro = NumResgistro;
    }
}
