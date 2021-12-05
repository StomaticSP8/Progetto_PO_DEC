package com.example.PPO_Dicembre_controller;
/**
 * @author Antonio Zaccardi
 * @author Francesco Cerrone
 *
 */

import java.text.ParseException;
import java.util.*;

import javax.xml.crypto.Data;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.PPO_Dicembre_Exception.Exception_numero_citta;
import com.example.PPO_Dicembre_Exception.input_exception;
import com.example.PPO_Dicembre_Filter.Filter_Role_piu_cit;
import com.example.PPO_Dicembre_Filter.Filter_date;
import com.example.PPO_Dicembre_Parser.Api_Parser;
import com.example.PPO_Dicembre_Static.parametri_statistica;
import com.example.PPO_Dicembre_Static.stati;
import com.example.PPO_Dicembre_model.Citta_consigliate;
import com.example.PPO_Dicembre_model.body_Response;
import com.example.PPO_Dicembre_model.citta;




/**
@return questa rotta suggerisce all'utente le 5 città americane 
abbiamo definito una classe città poi abbiamo generato 5 città americane messe all'interno di un vettore
e successivamente vengono  stampate.

*/

@RestController

public class PersonController {
@GetMapping("/Sug")
public Vector<citta>  citta_consigliate() {
		Citta_consigliate b= new Citta_consigliate();
		b.Citta_consigliate();
		b.inserire_le_citta();
		return b.stampa_citta();
	
	
	
}
/**
 * 
 * @param filter_3
 * @return questa rotta applica i filtri che abbiamo creato e restituisce il risultato del filtro in formato json
 * @throws input_exception
 * @throws Exception_numero_citta
 * @throws ParseException
 */

@PostMapping ("/Filter")
public Vector<JSONObject> Filter_final (@RequestBody  body_Response filter_3) throws input_exception, Exception_numero_citta, ParseException
{
if ( filter_3.body_check())
	throw new  input_exception();
   else
   {
	  // filter_3.body_Response2();
		Filter_date vg= new Filter_date(filter_3);
		return vg.filter_date_tre_cit();
   }
}
/**
 * 
 * @param sta
 * @return /Static effettua le statistiche, possono anche essere filtrate e restituisce un oggetto parametri_statistica in json 
 * @throws Exception_numero_citta
 * @throws ParseException
 */

@PostMapping ("/Static")
public parametri_statistica statica (@RequestBody body_Response sta) throws Exception_numero_citta, ParseException
{
	sta.body_Response2();
	Filter_date fd=new Filter_date(sta);
	
	stati p= new stati();
	parametri_statistica lop= new parametri_statistica();
	Vector<String> vdfs=lop.carico_linguaggio();
	 lop=  (p.percentuale_remote(fd.filter_date_tre_cit()));
	lop.setAltri_lavori(p.altri_linguaggi_f(fd.filter_date_tre_cit(), vdfs));
	return lop;
	
	
}









	
	
	
}	
	
	
	
	



		
	



