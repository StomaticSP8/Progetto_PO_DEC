package com.example.PPO_Dicembre_Static;

import java.util.Vector;
/**
 * @author Antonio Zaccardi
 * @author Francesco Cerrone
 *
 */
public class parametri_statistica {

	
	private double lavoro_in_remoto;
	private double quantita_lavori_in_remoto;
	private double lavoro_non_in_remoto;
	private double quantita_lavori_non_in_remoto;
	private Vector<String> altri_linguaggi= new Vector<String>();
	private Vector <String> top_5= new Vector<String>();
	
	
	/**
	 * 
	 * @return restutuisce un vettore di stringhe costituito dai 16 linguaggi di programmazione più utilizzati oltre java
	 */
	
	
	public Vector <String >carico_linguaggio()
	{
		Vector<String> bg = new Vector<String>();
		bg.add("python");
		bg.add("php");
		bg.add("javascript");
		bg.add("kotlin");
		bg.add("html");
		bg.add("c++");
		bg.add("rust");
		bg.add("typescript");
		bg.add("css");
		bg.add("swift");
		bg.add("Perl");
		bg.add("Scala");
		bg.add("scheme");
		bg.add("sql");
		bg.add("ruby");
		bg.add("elixir");
		
		return bg;
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	








	public double getQuantita_lavori_non_in_remoto() {
		return quantita_lavori_non_in_remoto;
	}

	public void setQuantita_lavori_non_in_remoto(double quantita_lavori_non_in_remoto) {
		this.quantita_lavori_non_in_remoto = quantita_lavori_non_in_remoto;
	}

	public double getQuantita_lavori_in_remoto() {
		return quantita_lavori_in_remoto;
	}

	public void setQuantita_lavori_in_remoto(double quantita_lavori_in_remoto) {
		this.quantita_lavori_in_remoto = quantita_lavori_in_remoto;
	}

	








	public double getLavoro_in_remoto() {
		return lavoro_in_remoto;
	}

	public void setLavoro_in_remoto(double lavoro_in_remoto) {
		this.lavoro_in_remoto = lavoro_in_remoto;
	}

	public double getLavoro_non_in_remoto() {
		return lavoro_non_in_remoto;
	}

	public void setLavoro_non_in_remoto(double lavoro_non_in_remoto) {
		this.lavoro_non_in_remoto = lavoro_non_in_remoto;
	}

	public Vector<String> getAltri_lavori() {
		return altri_linguaggi;
	}
	public void setAltri_lavori(Vector<String> altri_lavori) {
		this.altri_linguaggi = altri_lavori;
	}
	public Vector<String> getTop_5() {
		return top_5;
	}
	public void setTop_5(Vector<String> top_5) {
		this.top_5 = top_5;
	}
	
}