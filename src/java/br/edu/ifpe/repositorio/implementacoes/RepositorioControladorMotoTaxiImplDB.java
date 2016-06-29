/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.repositorio.implementacoes;

import br.edu.ifpe.edu.cadastro.dao.DaoManagerHiber;
import br.edu.ifpe.motoTaxi.negocio.model.MotoTaxi;
import br.edu.ifpe.repositorio.interfaces.RepositorioGenerico;
import java.util.List;

/**
 *
 * @author kelly silva
 */
public class RepositorioControladorMotoTaxiImplDB implements RepositorioGenerico<MotoTaxi, Integer>{

    public RepositorioControladorMotoTaxiImplDB() {
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
            return (MotoTaxi) DaoManagerHiber.getInstance().recover("from MotoTaxi where id = " + chave).get(0);
        } catch (IndexOutOfBoundsException ex) {
            return null;
            
            // chama a tabela mototaxi
        }
    }

    @Override
    public void deletar(MotoTaxi t) {
      
        DaoManagerHiber.getInstance().delete(t);
    }

    @Override
    public List<MotoTaxi> recuperarTodos() {
     
        return DaoManagerHiber.getInstance().recover("from MotoTaxi");
        
      //chama o dao  recuperar a tabela mototaxi
    }

    //public void inserir(ControladorMotoTaxi controladorMotoTaxi) {
        
    //}
}


