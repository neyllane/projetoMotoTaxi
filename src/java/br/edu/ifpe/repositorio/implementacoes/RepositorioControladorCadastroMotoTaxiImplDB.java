/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.repositorio.implementacoes;

import br.edu.ifpe.edu.cadastro.dao.DaoManagerHiber;
import br.edu.ifpe.controladores.ControladorMotoTaxi;
import br.edu.ifpe.motoTaxi.negocio.model.MotoTaxi;
import br.edu.ifpe.repositorio.interfaces.RepositorioGenerico;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author kelly silva
 */
public class RepositorioControladorCadastroMotoTaxiImplDB implements RepositorioGenerico<MotoTaxi, Integer>{

    public RepositorioControladorCadastroMotoTaxiImplDB() {
        }
    
      @Override
    public void inserir(MotoTaxi t) {
        DaoManagerHiber.getInstance().persist(t);
    }

    @Override
    public void alterar(MotoTaxi t) throws Exception {
        DaoManagerHiber.getInstance().update(t);
    }

    @Override
    public MotoTaxi recuperar(Integer chave) {
        try {
            return (MotoTaxi) DaoManagerHiber.getInstance().recover("from CadastroMotoTaxi where id = " + chave).get(0);
        } catch (IndexOutOfBoundsException ex) {
            return null;
        }
    }

    @Override
    public void deletar(MotoTaxi t) {
        //Session ss = HibernateUtil.getSessionFactory().getCurrentSession();
        //ss.beginTransaction();
        //ss.delete(t);
        //ss.beginTransaction().commit();
        DaoManagerHiber.getInstance().delete(t);
    }

    @Override
    public List<MotoTaxi> recuperarTodos() {
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


