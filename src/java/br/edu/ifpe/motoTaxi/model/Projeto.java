/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.motoTaxi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import static org.hibernate.criterion.Projections.id;

/**
 *
 * @author kelly silva
 */
@Entity(name = "Projeto")
public class Projeto {

    @Id
    @GeneratedValue
    @Column(length = 50)
    private double valor;
    @Column(length = 50)
    private String Hora;

    public Projeto(String nome, String cpf, String rg, String endereco,
            int NumCelular, String email, String ponto_praca, double valor, String Hora) {

    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the Hora
     */
    public String getHora() {
        return Hora;
    }

    /**
     * @param Hora the Hora to set
     */
    public void setHora(String Hora) {
        this.Hora = Hora;
    }

}
