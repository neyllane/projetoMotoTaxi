/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.controladores;

import br.edu.ifpe.motoTaxi.negocio.model.MotoTaxi;
import br.edu.ifpe.repositorio.implementacoes.RepositorioControladorCadastroMotoTaxiImplDB;
import br.edu.ifpe.repositorio.interfaces.RepositorioGenerico;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author kelly silva
 */
@ManagedBean(name = "ControladorMotoTaxi")
@ViewScoped
public class ControladorMotoTaxi {

    private RepositorioGenerico<MotoTaxi, Integer> repositorioCadastroMotoTaxi = null;
    private MotoTaxi selectedCadastroMotoTaxi;

    public ControladorMotoTaxi() {
       
        this.repositorioCadastroMotoTaxi = new RepositorioControladorCadastroMotoTaxiImplDB();
        this.selectedCadastroMotoTaxi = new MotoTaxi();
    }

    public String inserir(MotoTaxi cadastroMotoTaxi) {

        this.repositorioCadastroMotoTaxi.inserir(cadastroMotoTaxi);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Parabéns,MotoTaxi foi Cadastrado com sucesso"));

        return "index.xhtml";
    }

    public String alterar(MotoTaxi cadastroMotoTaxi) {
        try {
            this.repositorioCadastroMotoTaxi.alterar(cadastroMotoTaxi);

            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage("O Moto Taxi " + cadastroMotoTaxi.getNome()+ " foi "
                            + "Alterado com sucesso!"));

            return "ApresentarMotoTaxi.xhtml";

        } catch (Exception ex) {
            Logger.getLogger(ControladorMotoTaxi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public MotoTaxi recuperarCadastroMotoTaxi(int cpf) {
        return this.repositorioCadastroMotoTaxi.recuperar(cpf);
    }

    public void deletar(MotoTaxi cadastroMotoTaxi) {
       
        this.repositorioCadastroMotoTaxi.deletar(cadastroMotoTaxi);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                "O Moto taxi " + cadastroMotoTaxi.getNome()+ " foi excluído com sucesso!!!"));

    }

    public List<MotoTaxi> recuperarTodosMotoTaxi() {
        return this.repositorioCadastroMotoTaxi.recuperarTodos();
    }

    public MotoTaxi getSelectedCadastroMotoTaxi() {
        return selectedCadastroMotoTaxi;
    }

    public void setSelectedCadastroMotoTaxi(MotoTaxi selectedcCadastroMotoTaxi) {
        this.selectedCadastroMotoTaxi = selectedcCadastroMotoTaxi;
    }
}
