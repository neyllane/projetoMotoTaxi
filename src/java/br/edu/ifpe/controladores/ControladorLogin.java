package br.edu.ifpe.controladores;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import br.edu.ifpe.projetoMotoTaxi.model.Usuario;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author kelly silva
 */
@ManagedBean(name="controleLogin")
@RequestScoped
public class ControladorLogin {
    
    private Usuario usuarioLogado = null;
    private ControladorUsuarioBean controleUsuario = null;

    public ControladorLogin() {
        
        HttpSession session = ((HttpSession) FacesContext.getCurrentInstance().getExternalContext()
                .getSession(true));
        
        controleUsuario=(ControladorUsuarioBean)session.getAttribute("controleUsuario");
        
        if(controleUsuario == null){
            controleUsuario = new ControladorUsuarioBean();
            session.setAttribute("controleUsuario", controleUsuario);
        }
    }
  
    public String realizarLogin(String login, String senha){
        logarUsuario(login, senha);
        
        if(usuarioLogado == null){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Atenção!", "Usuario Não Cadastrado!"));
            return "/index.xhtml";
        }else if(usuarioLogado != null){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Bem Vindo! "+usuarioLogado.getNome()));
            return "ApresentarUsuario.xhtml";
        }
        
        return null;
    }
    
    public void logarUsuario(String login, String senha){
     Usuario u = controleUsuario.recuperar(login, senha);
      if(u != null){
          FacesContext fc = FacesContext.getCurrentInstance();
            HttpSession session = (HttpSession) fc.getExternalContext().getSession(false);
            session.setAttribute("usuario", u);
        usuarioLogado = u;
      }else{
          usuarioLogado=null;
      }
    }
    
  

    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
  
    public void sair(){
        
               this.usuarioLogado=null;
        ((HttpSession)(FacesContext.getCurrentInstance().getExternalContext().getSession(true))).removeAttribute("usuario");
        
        
        
    }
  
  
}
