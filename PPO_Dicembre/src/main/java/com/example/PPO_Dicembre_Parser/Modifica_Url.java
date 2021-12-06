package com.example.PPO_Dicembre_Parser;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.Vector;




import com.example.PPO_Dicembre_model.body_Response;

/**
 * @author Antonio Zaccardi
 * @author Francesco Cerrone
 *
 */

public class Modifica_Url {
	
body_Response body = new body_Response();

 URL url;
 Vector<URL> Vurl=new Vector<URL>();
 
 


//public Modifica_Url()
//{
	
//}
public Modifica_Url(body_Response body)
{
	this.body.setLocation(body.getLocation());
	this.body.setEmployment_type(body.getEmployment_type());
	this.body.setRemote(body.isRemote());
	this.body.setRole(body.getRole());
	this.body.setKeywords(body.getKeywords());
	this.body.setLocation2(body.getLocation2());
	this.body.setLocation3(body.getLocation3());
	this.body.setNumero_citta(body.getNumero_citta());
}

/**
 * 
 * @return crea un vettore di url per 3 location diverse 
 */
	
	public Vector<URL> piu_cit()
	{
		try {
			URL url;
			//Vector<URL> Vurl= new Vector<URL>();
			 url = new URL ("https://findwork.dev/api/jobs/"+"?search="+body.getKeywords()+"&source="+"&location="+body.getLocation()+"&employment_type="+body.getEmployment_type()+"&remote="+body.isRemote()+"&role="+body.getRole());
			Vurl.add(url);
			url = new URL("https://findwork.dev/api/jobs/"+"?search="+body.getKeywords()+"&source="+"&location="+body.getLocation2()+"&employment_type="+body.getEmployment_type()+"&remote="+body.isRemote()+"&role="+body.getRole());
			Vurl.add(url);
			url= new URL("https://findwork.dev/api/jobs/"+"?search="+body.getKeywords()+"&source="+"&location="+body.getLocation3()+"&employment_type="+body.getEmployment_type()+"&remote="+body.isRemote()+"&role="+body.getRole());
			Vurl.add(url);
			return Vurl;
		} 
		
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public Vector<URL> filter_static()
	{
		try {
			URL url;
			//Vector<URL> Vurl= new Vector<URL>();
			 url = new URL ("https://findwork.dev/api/jobs/"+"?search="+body.getKeywords()+"&source="+"&location="+body.getLocation()+"&employment_type="+body.getEmployment_type()+"&remote="+body.isRemote()+"&role="+body.getRole());
			Vurl.add(url);
			url = new URL("https://findwork.dev/api/jobs/"+"?search="+body.getKeywords()+"&source="+"&location="+body.getLocation2()+"&employment_type="+body.getEmployment_type()+"&remote="+body.isRemote()+"&role="+body.getRole());
			Vurl.add(url);
			url= new URL("https://findwork.dev/api/jobs/"+"?search="+body.getKeywords()+"&source="+"&location="+body.getLocation3()+"&employment_type="+body.getEmployment_type()+"&remote="+body.isRemote()+"&role="+body.getRole());
			Vurl.add(url);
			return Vurl;
		} 
		
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	
}
	
}

