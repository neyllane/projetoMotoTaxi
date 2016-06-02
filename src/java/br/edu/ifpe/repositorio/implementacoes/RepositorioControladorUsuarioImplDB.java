/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.repositorio.implementacoes;

import br.edu.ifpe.edu.cadastro.dao.DaoManagerHiber;
import br.edu.ifpe.controladores.ControladorMotoTaxi;
import br.edu.ifpe.motoTaxi.negocio.model.Usuario;
import br.edu.ifpe.projetoMotoTaxi.util.HibernateUtil;
import br.edu.ifpe.repositorio.interfaces.RepositorioGenerico;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author 1860915
 */
public class RepositorioControladorUsuarioImplDB implements RepositorioGenerico<Usuario, Integer> {

    @Override
    public void inserir(Usuario t) {
        DaoManagerHiber.getInstance().persist(t);
    }

    @Override
    public void alterar(Usuario t) throws Exception {
        DaoManagerHiber.getInstance().update(t);
    }

    @Override
    public Usuario recuperar(Integer chave) {
        try {
            return (Usuario) DaoManagerHiber.getInstance().recover("from Usuario where id = " + chave).get(0);
        } catch (IndexOutOfBoundsException ex) {
            return null;
        }
    }

    @Override
    public void deletar(Usuario t) {
       // Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        //ss.beginTransaction();
        //ss.delete(t);
        //ss.beginTransaction().commit();
        DaoManagerHiber.getInstance().delete(t);
    }

    @Override
    public List<Usuario> recuperarTodos() {
       // Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
       // ss.beginTransaction();
        //List lista = ss.createQuery("From CadastroUsuario").list();
        //ss.beginTransaction().commit();
        return DaoManagerHiber.getInstance().recover("from Usuario");
    }

    @Override
    public void inserir(ControladorMotoTaxi controladorMotoTaxi) {
       
    }

}
