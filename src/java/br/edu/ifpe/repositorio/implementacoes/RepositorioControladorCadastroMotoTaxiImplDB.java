/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.repositorio.implementacoes;

import br.edu.ifpe.cadastro.dao.DaoManagerHiber;
import br.edu.ifpe.controladores.ControladorMotoTaxi;
import br.edu.ifpe.projetoMotoTaxi.model.CadastroMotoTaxi;
import br.edu.ifpe.projetoMotoTaxi.util.HibernateUtil;
import br.edu.ifpe.repositorio.interfaces.RepositorioGenerico;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author kelly silva
 */
public class RepositorioControladorCadastroMotoTaxiImplDB implements RepositorioGenerico<CadastroMotoTaxi, Integer>{
      @Override
    public void inserir(CadastroMotoTaxi t) {
        DaoManagerHiber.getInstance().persist(t);
    }

    @Override
    public void alterar(CadastroMotoTaxi t) throws Exception {
        DaoManagerHiber.getInstance().update(t);
    }

    @Override
    public CadastroMotoTaxi recuperar(Integer chave) {
        try {
            return (CadastroMotoTaxi) DaoManagerHiber.getInstance().recover("from CadastroMotoTaxi where id = " + chave).get(0);
        } catch (IndexOutOfBoundsException ex) {
            return null;
        }
    }

    @Override
    public void deletar(CadastroMotoTaxi t) {
        //Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        //ss.beginTransaction();
        //ss.delete(t);
        //ss.beginTransaction().commit();
        DaoManagerHiber.getInstance().delete(t);
    }

    @Override
    public List<CadastroMotoTaxi> recuperarTodos() {
         //Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        //ss.beginTransaction();
        //List lista = ss.createQuery("From CadastroMotoTaxi").list();
        //ss.beginTransaction().commit();
        return DaoManagerHiber.getInstance().recover("from CadastroMotoTaxi");
    }

    @Override
    public void inserir(ControladorMotoTaxi controladorMotoTaxi) {
        
    }
}


