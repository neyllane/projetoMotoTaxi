/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.repositorio.implementacoes;

import br.edu.ifpe.controladores.ControladorMotoTaxi;
import br.edu.ifpe.motoTaxi.negocio.model.Usuario;

import br.edu.ifpe.repositorio.interfaces.RepositorioGenerico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kelly silva
 */
public class RepositorioselectedUsuarioImplMemo implements RepositorioGenerico<Usuario, Integer> {

    private List<Usuario> listaControladorUsuario = new ArrayList<>();

    @Override
    public void inserir(Usuario t) {
        this.listaControladorUsuario.add(t);
    }

    @Override
    public void alterar(Usuario t) throws Exception {
        Usuario u = null;
        for (int i = 0; i < this.listaControladorUsuario.size(); i++) {
            u = this.listaControladorUsuario.get(i);
            if (u.getCpf() == t.getCpf()) {
                u.setNome(t.getNome());
                u.setEmail(t.getEmail());
                u.setCodigo(t.getCodigo());
                u.setLogin(t.getLogin());
                u.setSenha(t.getSenha());

                return;
            }
        }
    }

    @Override
    public Usuario recuperar(Integer chave) {
        Usuario u = null;
        for (int i = 0; i < this.listaControladorUsuario.size(); i++) {
            u = this.listaControladorUsuario.get(i);
            if (u.getCodigo() == chave) {
                return u;
            }
        }
        return null;
    }

    public void deletar(Usuario t) {
        this.listaControladorUsuario.remove(t);
    }

    /**
     *
     * @return
     */
    public List<Usuario> recuperarTodos() {
        return this.listaControladorUsuario;
    }

    
    public void inserir(ControladorMotoTaxi controladorMotoTaxi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
