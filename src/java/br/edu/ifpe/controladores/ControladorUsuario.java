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
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author kelly silva
 */
@ManagedBean(name = "ControladorUsuario")
@RequestScoped
public class ControladorUsuario {

    private RepositorioGenerico<Usuario, Integer> repositorioUsuario = null;
    private Usuario selectedUsuario;

    public ControladorUsuario() {
        this.repositorioUsuario = new RepositorioControladorUsuarioImplDB();
        this.selectedUsuario = new Usuario();
        //chama o repositorio do usuario
        // seleciona o usuario
    }

    public String inserir(Usuario usuario) {

        this.repositorioUsuario.inserir(usuario);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Parabéns,Usuario Cadastrado com sucesso"));

        return "index.xhtml";
        // chama o repositorio do usuario 
        //mostra a mensagem que o usuario foi cadastrado com sucesso
        //retorna para a tela do index onde está a tela do menu
    }

    public String alterar(Usuario usuario) {
        try {
            this.repositorioUsuario.alterar(usuario);

            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage("O Usuario " + usuario.getNome() + " foi "
                            + "Alterado com sucesso!"));

            return "ApresentarUsuario.xhtml";
            //no alterar ele utiliza uma execeção com o try e catch onde ele chama o repositorio do usuario
            // mostra a menssagem que usuario foi alterardo com sucesso
            // returna para a tela de ApresentarUsuario.xhtml onde estão todos os dados do usuário

        } catch (Exception ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
            //caso isso não aconteça ele trata a exceção
        }
        return null;
    }

    public Usuario recuperarCadastroUsuario(int codigo) {
        return this.repositorioUsuario.recuperar(codigo);
        //retornar o repositorio do usuario e recupera atrávez do codigo
    }

    public void deletar(Usuario usuario) {
        this.repositorioUsuario.deletar(usuario);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                "O Usuario " + usuario.getNome() + " foi excluído com sucesso!!!"));
// chama o repositorio do usuario
// mostra a mensagem que foi excluida(no caso ele apenas exclui da tela ApresentarUsuario)
    }

    public List<Usuario> recuperarTodosUsuarios() {
        return this.repositorioUsuario.recuperarTodos();
        //retornar apenas o repositorio do usuario e recupera todos os usuarios
    }

    public Usuario getSelectedUsuario() {
        return selectedUsuario;
        //seleciona o usuario(utilizando o get e set)
        //retorna o usuario ja selecionado
    }

    public void setSelectedUsuario(Usuario selectedUsuario) {
        this.selectedUsuario = selectedUsuario;
    }

}
