
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kelly silva
 */
public class MotoTaxiControlador {
     public String inserir(Fornecedor fornecedor){
        
        try{
            Long.parseLong(MotoTaxi.getCadastroMotoTaxi());
        }catch(NumberFormatException ne){
            FacesContext.getCurrentInstance().addMessage("Cadastro:inCPF", new FacesMessage(FacesMessage.SEVERITY_WARN, "Atenção", "Digite apenas números do CPF!"));
            return null;
        }
  
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Parabéns, Moto Taxi foi  Cadastrado com sucesso"));
        
        return "index.xhtml";
    }

    private static class Fornecedor {

        public Fornecedor() {
        }

      
        private String getCadastroMotoTaxi() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
