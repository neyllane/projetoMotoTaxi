/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.moto;

import br.edu.ifpe.projetoMotoTaxi.model.CadastroMotoTaxi;
import br.edu.ifpe.projetoMotoTaxi.util.HibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author kelly silva
 */
public class Teste {
    public static void main(String[]args){
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction t = session.beginTransaction();
    CadastroMotoTaxi cadastro = new CadastroMotoTaxi();

    cadastro.setNome(JOptionPane.showInputDialog("Digite seu Nome:"));
    cadastro.setCpf(JOptionPane.showInputDialog("Digite seu CPF:"));
    cadastro.setNumResgistro(Integer.parseInt(JOptionPane.showInputDialog("Digite seu Número de Registro:")));
    cadastro.setEmail(JOptionPane.showInputDialog("Digite seu Email:"));
    cadastro.setNumCelular(Integer.parseInt(JOptionPane.showInputDialog("Digite seu Número do Celular:")));
    cadastro.setPonto_praca(JOptionPane.showInputDialog("Digite seu Ponto/Praça:"));
    
    
    
    session.save(cadastro);
    
    t.commit();
    
    
    
    
    
    }

    
}
