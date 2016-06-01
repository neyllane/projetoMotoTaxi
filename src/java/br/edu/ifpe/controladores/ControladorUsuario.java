/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.controladores;

import br.edu.ifpe.motoTaxi.negocio.model.Usuario;
import br.edu.ifpe.repositorio.implementacoes.RepositorioControladorUsuarioImplDB;
import br.edu.ifpe.repositorio.interfaces.RepositorioGenerico;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author kelly silva
 */
@ManagedBean(name = "ControladorUsuario")
@SessionScoped
public class ControladorUsuario {

    private RepositorioGenerico<Usuario, Integer> repositorioUsuario = null;
    private Usuario selectedUsuario;

    public ControladorUsuario() {
        this.repositorioUsuario = new RepositorioControladorUsuarioImplDB();
        this.selectedUsuario = new Usuario();
    }

    public String inserir(Usuario usuario) {

        this.repositorioUsuario.inserir(usuario);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Parabéns,Usuario Cadastrado com sucesso"));

        return "index.xhtml";
    }

    public String alterar(Usuario usuario) {
        try {
            this.repositorioUsuario.alterar(usuario);

            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage("O Usuario " + usuario.getNome() + " foi "
                            + "Alterado com sucesso!"));

            return "ApresentarUsuario.xhtml";

        } catch (Exception ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Usuario recuperarCadastroUsuario(int id) {
        return this.repositorioUsuario.recuperar(id);
    }

    public void deletar(Usuario usuario) {
        this.repositorioUsuario.deletar(usuario);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                "O Usuario " + usuario.getNome() + " foi excluído com sucesso!!!"));

    }

    public List<Usuario> recuperarTodosUsuarios() {
        return this.repositorioUsuario.recuperarTodos();
    }

    public Usuario getSelectedUsuario() {
        return selectedUsuario;
    }

    public void setSelectedUsuario(Usuario selectedUsuario) {
        this.selectedUsuario = selectedUsuario;
    }

}
