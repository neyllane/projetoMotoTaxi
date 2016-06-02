/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.repositorio.implementacoes;


import br.edu.ifpe.controladores.ControladorMotoTaxi;
import br.edu.ifpe.motoTaxi.negocio.model.CadastroMotoTaxi;
import br.edu.ifpe.repositorio.interfaces.RepositorioGenerico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1860915
 */
public  class RepositorioselectedCadastroMotoTaxirImplMemo implements RepositorioGenerico<CadastroMotoTaxi, Integer> {

    private List<CadastroMotoTaxi> listaControladorMotoTaxi = new ArrayList<>();

    @Override
    public void inserir(CadastroMotoTaxi t) {
        this.listaControladorMotoTaxi.add(t);
    }

    @Override
    public void alterar(CadastroMotoTaxi t) throws Exception{
        CadastroMotoTaxi m = null;
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
    public CadastroMotoTaxi recuperar(Integer chave) {
        CadastroMotoTaxi m = null;
        for (int i = 0; i < this.listaControladorMotoTaxi.size(); i++) {
            m = this.listaControladorMotoTaxi.get(i);
            if (m.getNumResgistro()== chave) {
                return m;
            }
        }
        return null;
    }

    @Override
    public void deletar(CadastroMotoTaxi t) {
        this.listaControladorMotoTaxi.remove(t);
    }

    @Override
    public List<CadastroMotoTaxi> recuperarTodos() {
        return this.listaControladorMotoTaxi;
    }

    @Override
    public void inserir(ControladorMotoTaxi controladorMotoTaxi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
