package com.example.PPO_Dicembre_Parser;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import java.util.Vector;
import javax.net.ssl.HttpsURLConnection;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.example.PPO_Dicembre_Exception.Exception_numero_citta;

import com.example.PPO_Dicembre_model.body_Response;

/**
 * @author Antonio Zaccardi
 * @author Francesco Cerrone
 *
 */

public class Api_Parser {
	
	 
	body_Response bo= new body_Response();

	

	private Vector<JSONObject> v;
	private Vector<JSONObject> av;
	
	public Api_Parser()
	{
		v=new Vector<JSONObject>();
	}
	
	public Api_Parser(body_Response bo)
	{
		v=new Vector<JSONObject>();
		av=new Vector<JSONObject>();
		this.bo.setLocation(bo.getLocation());
		this.bo.setEmployment_type(bo.getEmployment_type());
		this.bo.setRemote(bo.isRemote());
		this.bo.setRole(bo.getRole());
		this.bo.setKeywords(bo.getKeywords());
		this.bo.setLocation2(bo.getLocation2());
		this.bo.setLocation3(bo.getLocation3());
		this.bo.setNumero_citta(bo.getNumero_citta());
		
	}


	
	
	/**
	 * 
	 * @return stampa un vettore jsonobject
	 */
	public Vector<JSONObject> lista()
	{
		return v;
			
	}
	

	/**
	 * effettua la chiamata api in base al numero di citta ed effettua il parser
	 * @throws Exception_numero_citta
	 */
	public void Parser_tre_citta() throws Exception_numero_citta
	{
		JSONParser parser = new JSONParser();
		int k=0;
		
		
		 try {
			  
			 
			
			Modifica_Url po = new Modifica_Url(bo);
			Vector<URL> Vurl= new Vector<URL>();
			Vurl=po.piu_cit();
			
			if (bo.getNumero_citta()==0)
				throw new Exception_numero_citta();
			
			for(int i=0; (i<bo.getNumero_citta()) ; i++) {
				
				URL url=Vurl.get(i);
				
				HttpsURLConnection open=(HttpsURLConnection) url.openConnection();
				open.addRequestProperty("Authorization","Token ba7fcc957ddce78afc39a2c3b1572e44e9ede3d4");
				open.setRequestProperty("Conten-Type", "application/json");
				open.setRequestProperty("Accept", "application/json");
				open.setDoOutput(true);
				BufferedReader in =new BufferedReader(new InputStreamReader(open.getInputStream()));
				
				String Inputline;
				
				while((Inputline= in.readLine())  !=null) {
					
					JSONObject prova= (JSONObject) parser.parse(Inputline) ;
					
					JSONArray a=(JSONArray) prova.get("results");
					for ( Object o:a)
					{
						
						JSONObject domain= (JSONObject)o;
						v.add((JSONObject) domain.clone());
					
						av.addElement((JSONObject) v.get(k));
						k++;
					
					
					}
					
				
				
					}
				
				v.removeAllElements();
				k=0;
				
				in.close();	}
			
		 
				
		 }
			 
			  
		 
		 
		 catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		 
	}
	
	public Vector<JSONObject> stampa_tre_citta_filter()
	{
		return av;
	}
	
	
	
	/**
	 * 
	 * @return effettua la chiamata api in base al numero di citta, effettua il parser e mi restituisce un jsonarray nel campo result.
	 */
	
	public Vector< JSONArray> Parser_Array_tre_citta()
	{
		
		JSONParser parser = new JSONParser();
		
		
		JSONArray tr= new JSONArray();
		Vector<JSONArray> u = new  Vector<JSONArray>();
		
		
		
		 try {
			  
			
			
			Modifica_Url po = new Modifica_Url(bo);
			Vector<URL> Vurl= new Vector<URL>();
			
			Vurl=po.piu_cit();
			
			for(int i=0; i<bo.getNumero_citta(); i++) {
				URL url=Vurl.get(i);
				
				HttpsURLConnection open=(HttpsURLConnection) url.openConnection();
				open.addRequestProperty("Authorization","Token ba7fcc957ddce78afc39a2c3b1572e44e9ede3d4");
				
				open.setRequestProperty("Conten-Type", "application/json");
				open.setRequestProperty("Accept", "application/json");
				open.setDoOutput(true);
				BufferedReader in =new BufferedReader(new InputStreamReader(open.getInputStream()));
				
				String Inputline;
				
				
				while((Inputline= in.readLine())  !=null) {
					
					JSONObject prova= (JSONObject) parser.parse(Inputline) ;
					
					
					 JSONArray lo=(JSONArray) prova.get("results");
					
					 tr=(JSONArray) lo.clone();
				
			
				
					}
				
				
				
				
				u.add(tr);
				
				
				in.close();	}
			
			
		 
			return u; 	
		 }
			 
			  
		 
		 
		 catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
	return null;
	}
		
	
	}
	
	
	

	
	
	
	


