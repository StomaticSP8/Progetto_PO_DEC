package com.example.PPO_Dicembre_model;
/**
 * @author Antonio Zaccardi
 * @author Francesco Cerrone
 *
 */

public class citta {

	private String nome;
	private String stato;
	
	/**
	 * 
	 * @param nome indica il nome della città
	 * @param stato indica lo stato della città
	 */
	public citta(String nome, String stato)
	{
		this.nome=nome;
		this.stato=stato;
	
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

	
	

}
