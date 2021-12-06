package com.example.PPO_Dicembre;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.PPO_Dicembre_Exception.Exception_numero_citta;
import com.example.PPO_Dicembre_Exception.input_exception;
import com.example.PPO_Dicembre_model.body_Response;
import com.example.PPO_Dicembre_model.citta;

class testclass {
	

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
		
		
		}
	
	@Test
	@DisplayName("Corretta generazione dell'eccezione Exception_numero_citta.")
	void test() throws input_exception {
		body_Response a=new body_Response();
		
		 boolean b=a.body_check();
		 if(b==false) {
			  throw new input_exception();
			  
			 
		 }
		
		
		
	}

	
		
		}
		


