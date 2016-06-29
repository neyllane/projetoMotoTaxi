/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.moto;

import br.edu.ifpe.motoTaxi.negocio.model.MotoTaxi;
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

        List<MotoTaxi> lista = (List<MotoTaxi>) session.createQuery("From MotoTaxi").list();
        for (MotoTaxi MotoTaxi : lista) {
            JOptionPane.showMessageDialog(null, MotoTaxi.getNome());
            JOptionPane.showMessageDialog(null, MotoTaxi.getCpf());
            JOptionPane.showMessageDialog(null, MotoTaxi.getEmail());
            JOptionPane.showMessageDialog(null, MotoTaxi.getEndereco());
            JOptionPane.showMessageDialog(null, MotoTaxi.getNumCelular());
            JOptionPane.showMessageDialog(null, MotoTaxi.getNumResgistro());
            JOptionPane.showMessageDialog(null, MotoTaxi.getRg());
            JOptionPane.showMessageDialog(null, MotoTaxi.getPonto_praca());

        }
        t.commit();

    }

}
