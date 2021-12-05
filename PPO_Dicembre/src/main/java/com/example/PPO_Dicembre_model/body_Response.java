package com.example.PPO_Dicembre_model;

/**
 * @author Antonio Zaccardi
 * @author Francesco Cerrone
 *
 */

import com.example.PPO_Dicembre_Exception.input_exception;


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
	
	

	

	public String getData() {
		return data;
	}






	public void setData(String data) {
		this.data = data;
	}






	public int getNumero_citta() {
		return numero_citta;
	}

	public void setNumero_citta(int numero_citta) {
		this.numero_citta = numero_citta;
	}

	public String getLocation3() {
		return location3;
	}

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
	
	
	
	
	
	
	
	
	
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String isRemote() {
		return remote;
	}

	public void setRemote(String remote) {
		this.remote = remote;
	}

	public String getEmployment_type() {
		return employment_type;
	}

	public void setEmployment_type(String employment_type) {
		this.employment_type = employment_type;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	public String getLocation2() {
		return location2;
	}
	public void setLocation2(String location2) {
		this.location2 = location2;
	}
	
	

}
