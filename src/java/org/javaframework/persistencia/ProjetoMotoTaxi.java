package org.javaframework.persistencia;



import javax.annotation.Generated;
import javax.persistence.Id;



@Entitypublic
public class ProjetoMotoTaxi { 

	@Id
	//@GeneratedValue(strategy = SEQUENCE, value = { "" })    
	
	 Integer id;     
	 String nome;    


	public ProjetoMotoTaxi(Integer id, String nome) { 
		this.id = id;         
		this.nome = nome;     
	} 
	public ProjetoMotoTaxi(){
	}
	public Integer getId() {
		return id;    
	}     
	public String getNome() {  
		return nome;     }    
	public void setId(Integer id) {       
		this.id = id;     }    
	public void setNome(String nome) { 
		this.nome = nome;     } 
}