package com.example.PPO_Dicembre_Filter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.example.PPO_Dicembre_Exception.Exception_numero_citta;
import com.example.PPO_Dicembre_model.body_Response;
/**
 * @author Antonio Zaccardi
 * @author Francesco Cerrone
 *
 */


/**
 * 
 *  costruttore della classe filter date che mi setta la body response inserita dall'utente. 
 *
 */

public class Filter_date {
	body_Response bod= new body_Response();
	/**
	 * 
	 * @param body setta bod uguale alla bodyresponse body inserita dall'utente
	 */
	public Filter_date(body_Response body)
	{
		this.bod.setEmployment_type(body.getEmployment_type());
		this.bod.setKeywords(body.getKeywords());
		this.bod.setLocation(body.getLocation());
		this.bod.setLocation2(body.getLocation2());
		this.bod.setLocation3(body.getLocation3());
		this.bod.setRemote(body.isRemote());
		this.bod.setRole(body.getRole());
		this.bod.setNumero_citta(body.getNumero_citta());
		this.bod.setData(body.getData());
	}
	
	
	/**
	 * 
	 * @return questo metodo effettua il filtro della data per una o più città, la data se è stata inserita dall'utente e restituisce il risultato filtrato,
	 * altrimenti effttua il filtro di altri parametri.
	 * @throws Exception_numero_citta
	 * @throws ParseException
	 */
	
	public Vector<JSONObject> filter_date_tre_cit() throws Exception_numero_citta, ParseException
	{
		Vector<JSONObject> dv = new Vector<JSONObject>();
		Vector<JSONObject> gh= new Vector<JSONObject>();
		JSONArray ko= new JSONArray();
		Filter_Role_piu_cit fv = new Filter_Role_piu_cit( bod);
		dv =fv.filtra_role_3();
		
		if (bod.getData()=="") {
			gh=dv;
		}
			
		else {
			Date date1= new  SimpleDateFormat( "yyyy-MM-dd" ).parse(bod.getData());
			for (int k=0; k<dv.size(); k++)
				ko.add(dv.get(k));
			for (int i=0; i<ko.size(); i++)
			{
				//System.out.println(ko.get(i));
				Object o= ko.get(i);
				JSONObject k= (JSONObject) o;
				String f=(String) k.get("date_posted");
				
						
				Date date2= new SimpleDateFormat("yyyy-MM-dd").parse(f);
				//System.out.println(date2);
				//System.out.println(date1);
				//System.out.println(date1.after(date2));
				if (date1.after(date2))
				gh.add(k);
				
			}
		}
		return gh;
		
		
		
	}
	

}
