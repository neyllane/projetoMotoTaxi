/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.web.builders;

import br.edu.ifpe.motoTaxi.model.Moto;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


/**
 *
 * @author 1860915
 */

@ManagedBean(name = "bFornecedor")
@RequestScoped
public class BuilderCadastroMotoTaxi {
    
 private int id;
    private String nome;
    private String cpf;
    private int numResgistro;
    private String rg;
    private String endereco;
    private int NumCelular;
    private String email;
    private String ponto_praca;
    private Moto MotoDoMotoTaxi;

    
    @Deprecated
    public BuilderCadastroMotoTaxi(int id,
            String nome, 
            String cpf, 
            int numRegistro, 
            String rg, 
            String endereco, 
            int NumCelular ,
            String email,
            String ponto_praca, Moto MotoDoMotoTaxi){
        
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the numResgistro
     */
    public int getNumResgistro() {
        return numResgistro;
    }

    /**
     * @param numResgistro the numResgistro to set
     */
    public void setNumResgistro(int numResgistro) {
        this.numResgistro = numResgistro;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
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
     * @return the NumCelular
     */
    public int getNumCelular() {
        return NumCelular;
    }

    /**
     * @param NumCelular the NumCelular to set
     */
    public void setNumCelular(int NumCelular) {
        this.NumCelular = NumCelular;
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

    /**
     * @return the ponto_praca
     */
    public String getPonto_praca() {
        return ponto_praca;
    }

    /**
     * @param ponto_praca the ponto_praca to set
     */
    public void setPonto_praca(String ponto_praca) {
        this.ponto_praca = ponto_praca;
    }

    /**
     * @return the MotoDoMotoTaxi
     */
    public Moto getMotoDoMotoTaxi() {
        return MotoDoMotoTaxi;
    }

    /**
     * @param MotoDoMotoTaxi the MotoDoMotoTaxi to set
     */
    public void setMotoDoMotoTaxi(Moto MotoDoMotoTaxi) {
        this.MotoDoMotoTaxi = MotoDoMotoTaxi;
    }

   
    
   
    
}
