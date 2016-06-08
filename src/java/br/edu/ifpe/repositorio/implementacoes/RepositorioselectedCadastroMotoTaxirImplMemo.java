/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.repositorio.implementacoes;


import br.edu.ifpe.controladores.ControladorMotoTaxi;
import br.edu.ifpe.motoTaxi.negocio.model.MotoTaxi;
import br.edu.ifpe.repositorio.interfaces.RepositorioGenerico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1860915
 */
public  class RepositorioselectedCadastroMotoTaxirImplMemo implements RepositorioGenerico<MotoTaxi, Integer> {

    private List<MotoTaxi> listaControladorMotoTaxi = new ArrayList<>();

    @Override
    public void inserir(MotoTaxi t) {
        this.listaControladorMotoTaxi.add(t);
    }

    @Override
    public void alterar(MotoTaxi t) throws Exception{
        MotoTaxi m = null;
        for (int i = 0; i < this.listaControladorMotoTaxi.size(); i++) {
            m = this.listaControladorMotoTaxi.get(i);
            if (m.getCpf().equals(t.getCpf())) {
                m.setNome(t.getNome());
                m.setEmail(t.getEmail());
                m.setEndereco(t.getEndereco());
                m.setNumCelular(t.getNumCelular());
                m.setNumResgistro(t.getNumResgistro());
                m.setPonto_praca(t.getPonto_praca());
                m.setRg(t.getRg());
             

                return;
            }
        }
    }

    @Override
    public MotoTaxi recuperar(Integer chave) {
        MotoTaxi m = null;
        for (int i = 0; i < this.listaControladorMotoTaxi.size(); i++) {
            m = this.listaControladorMotoTaxi.get(i);
            if (m.getNumResgistro()== chave) {
                return m;
            }
        }
        return null;
    }

    @Override
    public void deletar(MotoTaxi t) {
        this.listaControladorMotoTaxi.remove(t);
    }

    @Override
    public List<MotoTaxi> recuperarTodos() {
        return this.listaControladorMotoTaxi;
    }

    @Override
    public void inserir(ControladorMotoTaxi controladorMotoTaxi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
