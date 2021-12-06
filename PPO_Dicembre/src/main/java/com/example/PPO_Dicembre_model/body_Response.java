package com.example.PPO_Dicembre_model;

/**
 * @author Antonio Zaccardi
 * @author Francesco Cerrone
 *
 */

import com.example.PPO_Dicembre_Exception.input_exception;

/**
 * 
 * setta tutti i parametri che l'utente inserirà nel body
 *
 */
public class body_Response {
	
	private String location="";
	private String remote="";
	private String employment_type="";
	private String role="";
	private String keywords="";
	private String location2="";
	private String location3="";
	private int numero_citta=0;
	private String data="";
	
	/**
	 * costruttore classe body response
	 */
	public body_Response()
	{
		this.location=location;
		this.employment_type=employment_type;
		this.remote=remote;
		this.role=role;
		this.keywords=keywords;
		this.location2=location2;
		this.location3=location3;
		this.numero_citta=numero_citta;
		this.data=data;
		
	}
	
	

	/**
	 * 
	 * @return data cercata dall'utente
	 */

	public String getData() {
		return data;
	}





/**
 * 
 * @param data cercata dall'utente
 */
	public void setData(String data) {
		this.data = data;
	}





/**
 * 
 * @return restituisce il numero di città chieste dall' utente
 */
	public int getNumero_citta() {
		return numero_citta;
	}
/**
 * 
 * @param numero_citta setta il numero di città chieste dall'utente
 */
	public void setNumero_citta(int numero_citta) {
		this.numero_citta = numero_citta;
	}
/**
 * 
 * @return la location numero 3
 */
	public String getLocation3() {
		return location3;
	}
/**
 * 
 * @param location3 setta la lacotaion numero 3
 */
	public void setLocation3(String location3) {
		this.location3 = location3;
	}

	public void  body_Response2()
	{
		if (this.location==null)
		this.location="";
	else if(this.employment_type==null)
		this.employment_type="";
	else if(this.remote==null)
		this.remote="";
	else if(this.role==null)
		this.role="";
	else if(this.keywords==null)
		this.keywords="";
	else if(this.location2==null)
		this.location2="";
	else if(this.location3==null)
		this.location3="";
			
	}
	/**
	 * 
	 * @return controlla se il body inserito dall'utente sia nullo se lo è lancia l'eccezzione
	 * @throws input_exception
	 */
	public boolean body_check() throws input_exception
	{
		if ((this.location=="")&&(this.location2=="")&&(this.location3=="")&&(this.keywords=="")&&(this.employment_type=="")&&(this.numero_citta==0)&&(this.remote=="")&&(this.role==""))  
		return true;
		else return false;
					
	}
	
	
	
	
	
	
	
	
	/**
	 * 
	 * @return le parole chiave dei linguaggi
	 */
	public String getKeywords() {
		return keywords;
	}
	/**
	 * 
	 * @param keywords la parola chiave per cercare il linguaggio
	 */
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	/**
	 * 
	 * @return location
	 */
	public String getLocation() {
		return location;
	}
/**
 * 
 * @param location
 */
	public void setLocation(String location) {
		this.location = location;
	}
/**
 * 
 * @return restituisce se è un lavoro remoto o no
 */
	public String isRemote() {
		return remote;
	}
/**
 * 
 * @param remote
 */
	public void setRemote(String remote) {
		this.remote = remote;
	}
/**
 * 
 * @return tipo di lavoro
 */
	public String getEmployment_type() {
		return employment_type;
	}
/**
 * 
 * @param employment_type
 */
	public void setEmployment_type(String employment_type) {
		this.employment_type = employment_type;
	}
/**
 * 
 * @return il ruolo 
 */
	public String getRole() {
		return role;
	}
/**
 * 
 * @param role
 */
	public void setRole(String role) {
		this.role = role;
	}
	/**
	 * 
	 * @return la laocation 2
	 */
	public String getLocation2() {
		return location2;
	}
	/**
	 * 
	 * @param location2
	 */
	public void setLocation2(String location2) {
		this.location2 = location2;
	}
	
	

}
