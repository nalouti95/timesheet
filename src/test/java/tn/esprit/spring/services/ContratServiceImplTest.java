package tn.esprit.spring.services;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.entities.Contrat;

 class ContratServiceImplTest {
	
	

	
	@Autowired
	IContratService contratservice ;
	
	@Autowired
	
	ContratServiceImpl imp = new ContratServiceImpl();
	


	//Contrat ctra1 = new Contrat("ccp",2251786,100);
	
	public static List<Contrat> listecontrat = new ArrayList<>();

	
	
	@Test
	 void testajouterMonContrat() throws ParseException {
		
		Contrat c = new Contrat();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d = dateFormat.parse("2020-09-30");
		
		c.setDateDebut(d);
		c.setSalaire(102);
		c.setTelephone(123123);
		c.setTypeContrat("ccp");
		
		//assertEquals(0, contratserviceimpl.ajouterMonContrat(c));
	//assertNotEquals(1,contratservice.ajouterMonContrat(listecontrat, c));
	assertEquals(1,imp.ajouterMonContrat(listecontrat, c));

	}
	
	@Test
	  void testgetAllContrats() {
		
				assertEquals(1,imp.getAllContrats(listecontrat));
		

	 }
	
	@Test
	 void testmettreAjourSalaire() throws ParseException {
		
	Contrat c = new Contrat();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d = dateFormat.parse("2020-09-30");
		
		c.setDateDebut(d);
		c.setSalaire(102);
		c.setTelephone(123123);
		c.setTypeContrat("ccp");

	//	assertEquals(1,imp.mettreAjourSalaire(c, listecontrat));

		
	}
	
	@Test
	 void testdeleteContrat() {
		
	
		assertEquals(1,imp.deleteContrat(listecontrat));
	}
	
	
	

	
}
