/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.motoTaxi.negocio.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author kelly silva
 */
@Table(name = "CadastroMotoTaxi")
@Entity
public class CadastroMotoTaxi {

    @Id
    @GeneratedValue
    private int codigo;
    @Column(name = "cpf", length = 15, unique = true, nullable = false)
    private String cpf;
    @Column(length = 15)
    private String nome;
    @Column(length = 50)
    private int numResgistro;
    @Column(length = 10)
    private String rg;
    @Column(length = 50)
    private String endereco;
    @Column(length = 16)
    private int NumCelular;
    @Column(length = 8)
    private String email;
    @Column(length = 50)
    private String ponto_praca;
    @ManyToOne
    private Moto MotoDoMotoTaxi;

    public CadastroMotoTaxi(String nome, String cpf, String rg, int numResgistro,
            String endereco, int NumCelular, String email,
            String ponto_praca, Moto MotoDoMotoTaxi, int codigo) {
        this.nome = nome;
        this.rg = rg;
        this.endereco = endereco;
        this.NumCelular = NumCelular;
        this.email = email;
        this.ponto_praca = ponto_praca;
        this.MotoDoMotoTaxi = MotoDoMotoTaxi;
        this.numResgistro = numResgistro;
        this.cpf = cpf;
        this.codigo = codigo;
    }

    @Deprecated
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

    public void setNumResgistro(int NumResgistro) {
        this.numResgistro = NumResgistro;
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
