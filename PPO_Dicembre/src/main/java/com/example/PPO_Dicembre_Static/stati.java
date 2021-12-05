package com.example.PPO_Dicembre_Static;

import java.util.Vector;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.example.PPO_Dicembre_Parser.Api_Parser;
import com.example.PPO_Dicembre_model.body_Response;



public class  stati extends parametri_statistica
{
	private  double j=0;
	private  double k=0;
	private  int i=0;
private int t;
private int d;
	
	
	
	
	
	public parametri_statistica percentuale_remote(Vector <JSONObject> par)
	{
		for (i=0; i<par.size(); i++)
		{
			Object o= par.get(i);
			String cerca=o.toString();
			if (cerca.contains("\"remote\":true"))
			{
				
				j++;
				
			}
			else {
				k++;
				
				
			}
			
		}
		double percentuale_remoto_p=(j/i)*100;
		double percentuale_remoto_n=(k/i)*100;
		
		parametri_statistica kopo= new parametri_statistica();
		kopo.setLavoro_in_remoto(percentuale_remoto_p);
		kopo.setLavoro_non_in_remoto(percentuale_remoto_n);
		kopo.setQuantita_lavori_in_remoto(j);
		kopo.setQuantita_lavori_non_in_remoto(k);
		return  kopo;
		
	}
	
	
	
	public Vector<String> altri_linguaggi_f(Vector<JSONObject> vg, Vector<String> bh)
	{
		Vector<JSONObject> fv = vg;
		Vector<String> sa= new Vector<String>();
		Vector<String> lin= new Vector<String>();
		JSONArray vb= new JSONArray();
		for (int i=0; i<fv.size(); i++)
		{
			vb.add(fv.get(i));
		}
		for (int k=0; k<vb.size(); k++)
		{
			Object o=vb.get(k);
			JSONObject g= (JSONObject) o;
			JSONArray key= (JSONArray) g.get("keywords");
			for(int p=0; p<key.size();p++)
			{
				sa.add((String) key.get(p));
			}
			
				System.out.println(sa);
			
			
			for ( int z=0; z<sa.size(); z++)
			{
				for( int f=0; f<bh.size(); f++)
				{
					//System.out.println(cf);
					if(sa.get(z).contains(bh.get(f)))
					{
						lin.add(bh.get(f));
						bh.remove(f);
					}
						
					
				}
					
			}
			
			
		
		t=0;
		d=0;
			
		}
		return lin;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
