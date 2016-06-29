/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.controladores;

import br.edu.ifpe.motoTaxi.negocio.model.MotoTaxi;
import br.edu.ifpe.repositorio.implementacoes.RepositorioControladorMotoTaxiImplDB;
import br.edu.ifpe.repositorio.interfaces.RepositorioGenerico;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author kelly silva
 */
@ManagedBean(name = "ControladorMotoTaxi")
@RequestScoped
public class ControladorMotoTaxi {

    private RepositorioGenerico<MotoTaxi, Integer> repositorioMotoTaxi = null;
    private MotoTaxi selectedMotoTaxi;

    public ControladorMotoTaxi() {
       
        this.repositorioMotoTaxi = new RepositorioControladorMotoTaxiImplDB();
        this.selectedMotoTaxi = new MotoTaxi();
    }

    public String inserir(MotoTaxi motoTaxi) {

        this.repositorioMotoTaxi.inserir(motoTaxi);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Parabéns,MotoTaxi foi Cadastrado com sucesso"));

        return "index.xhtml";
    }

    public String alterar(MotoTaxi motoTaxi) {
        try {
            this.repositorioMotoTaxi.alterar(motoTaxi);

            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage("O Moto Taxi " + motoTaxi.getNome()+ " foi "
                            + "Alterado com sucesso!"));

            return "ApresentarMotoTaxi.xhtml";

        } catch (Exception ex) {
            Logger.getLogger(ControladorMotoTaxi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public MotoTaxi recuperarMotoTaxi(int cpf) {
        return this.repositorioMotoTaxi.recuperar(cpf);
    }

    public void deletar(MotoTaxi motoTaxi) {
       
        this.repositorioMotoTaxi.deletar(motoTaxi);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                "O Moto taxi " + motoTaxi.getNome()+ " foi excluído com sucesso!!!"));

    }

    public List<MotoTaxi> recuperarTodosMotoTaxi() {
        return this.repositorioMotoTaxi.recuperarTodos();
    }

    public MotoTaxi getSelectedMotoTaxi() {
        return selectedMotoTaxi;
    }

    public void setSelectedMotoTaxi(MotoTaxi selectedMotoTaxi) {
        this.selectedMotoTaxi = selectedMotoTaxi;
    }
}
