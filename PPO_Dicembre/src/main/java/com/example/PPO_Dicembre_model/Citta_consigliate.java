package com.example.PPO_Dicembre_model;

/**
 * @author Antonio Zaccardi
 * @author Francesco Cerrone
 *
 */

import java.util.Vector;

public class Citta_consigliate {
	private Vector<citta> v;
	
	
	
	public void  Citta_consigliate()
	
	{
		
		v=new Vector<citta>();
	}
	
	
	/**
	 *  questo metodo carica le 5 citta all'interno di un vettore di tipo citta
	 */
	
	public void inserire_le_citta() {
		citta c1= new citta("Los Angeles","California");
		citta c2=new citta("Chicago","Illinois");
		citta c3=new citta("New York","New York");
		citta c4=new citta("Houston","Texas");
		citta c5=new citta("Filadelfia","Pennsylvania");
		v.add(c1);
		v.add(c2);
		v.add(c3);
		v.add(c4);
		v.add(c5);

	}
	/**
	 * 
	 * @return restituisce la stampa del vettore di tipo citta
	 */
	public Vector<citta> stampa_citta()
	{
		return v;
			
	}
	 

	
	
		
}




