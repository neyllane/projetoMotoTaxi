/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.moto;

import br.edu.ifpe.motoTaxi.negocio.model.CadastroMotoTaxi;
import br.edu.ifpe.motoTaxi.util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author kelly silva
 */
public class Teste {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();

        List<CadastroMotoTaxi> lista = (List<CadastroMotoTaxi>) session.createQuery("From CadastroMotoTaxi").list();
        for (CadastroMotoTaxi cadastroMotoTaxi : lista) {
            JOptionPane.showMessageDialog(null, cadastroMotoTaxi.getNome());
            JOptionPane.showMessageDialog(null, cadastroMotoTaxi.getCpf());
            JOptionPane.showMessageDialog(null, cadastroMotoTaxi.getEmail());
            JOptionPane.showMessageDialog(null, cadastroMotoTaxi.getEndereco());
            JOptionPane.showMessageDialog(null, cadastroMotoTaxi.getNumCelular());
            JOptionPane.showMessageDialog(null, cadastroMotoTaxi.getNumResgistro());
            JOptionPane.showMessageDialog(null, cadastroMotoTaxi.getRg());
            JOptionPane.showMessageDialog(null, cadastroMotoTaxi.getPonto_praca());

        }
        t.commit();

    }

}
