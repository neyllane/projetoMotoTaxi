/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.motoTaxi.negocio.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author kelly silva
 */
@Table(name = "Moto")
@Entity
public class Moto implements Serializable {

    @Id
    @Column(length = 50)
    private String Placa;
    @Column(length = 50)
    private String Marca;
    @Column(length = 50)
    private String Modelo;

    
    public Moto() {
    }

    public Moto(String Placa, String Marca, String Modelo) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Placa = Placa;
    }

    /**
     * @return the Placa
     */
    public String getPlaca() {
        return Placa;
    }

    /**
     * @param Placa the Placa to set
     */
    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the Modelo
     */
    public String getModelo() {
        return Modelo;
    }

    /**
     * @param Modelo the Modelo to set
     */
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

}
