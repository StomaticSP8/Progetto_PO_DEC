package com.example.PPO_Dicembre_Filter;

import java.util.Vector;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.example.PPO_Dicembre_Exception.Exception_numero_citta;
import com.example.PPO_Dicembre_Parser.Api_Parser;
import com.example.PPO_Dicembre_model.body_Response;
/**
 * @author Antonio Zaccardi
 * @author Francesco Cerrone
 *
 */


public class Filter_Role_piu_cit {
	
	
	
	
	
	Vector<JSONObject> filtrato= new Vector<JSONObject>();
	private body_Response body = new body_Response();
	
	
	
	public Filter_Role_piu_cit(body_Response body)
	{
		this.body.setEmployment_type(body.getEmployment_type());
		this.body.setKeywords(body.getKeywords());
		this.body.setLocation(body.getLocation());
		this.body.setLocation2(body.getLocation2());
		this.body.setLocation3(body.getLocation3());
		this.body.setRemote(body.isRemote());
		this.body.setRole(body.getRole());
		this.body.setNumero_citta(body.getNumero_citta());
	}
	
	
	
	/**
	 * 
	 * @return effettua il filtro del ruolo per una o più città e restituisce un vettore di jsonobject con gli elementi filtrati,
	 *se il ruolo non è stato inserito dall' utente effettua il filtro su altri parametri 
	 * @throws Exception_numero_citta   
	 */
	public Vector<JSONObject> filtra_role_3() throws Exception_numero_citta
	{
		
		String t=body.getRole();
		 
		
		
		
		if((t!="null")&&(t!=""))
		{
			Vector <JSONObject> vg= new Vector<JSONObject>();
			Api_Parser hb = new Api_Parser(body);
			Vector<JSONArray> a=hb.Parser_Array_tre_citta();
			//System.out.println(a);+
			for  (int i=0; i<body.getNumero_citta();i++)
			{
				JSONArray y=a.get(i);
				
				for (Object o:y)
				{
					JSONObject fil=(JSONObject) o;
					String rol= (String) fil.get("role");
					
					if (rol.contains(t))
					{
						vg.add((JSONObject) o);
						
					}
					
				}
				
				
					
			}
			return vg;
		}
			
			else {
				Api_Parser lo= new Api_Parser(body);
				lo.Parser_tre_citta();
				System.out.println(lo.stampa_tre_citta_filter());
				 return lo.stampa_tre_citta_filter();
				
			}
			
			
				
			
			
		
		
		
		
			
		
		
	}

}
