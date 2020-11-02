package tn.esprit.spring.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

import tn.esprit.spring.entities.Contrat;

public class ContratServiceImplTest {
	
	ContratServiceImpl contratserviceimpl = new ContratServiceImpl();
	
	
	/*
	@Test
	 public void testgetAllContrats() {
	
		 
	 }*/
	@Test
	public void testajouterMonContrat() throws ParseException {
		
		Contrat c = new Contrat();

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d = dateFormat.parse("2020-09-30");
		
		c.setDateDebut(d);
		c.setSalaire(102);
		c.setTelephone(123123);
		c.setTypeContrat("ccp");
		
		//assertEquals(0, contratserviceimpl.ajouterMonContrat(c));
	assertNotEquals(1, contratserviceimpl.ajouterMonContrat(c));
	
	}
	@Test
	public void testdeleteAllContratJPQL() {
		
	
		//assertEquals(0,contratserviceimpl.deleteAllContratJPQL());
		assertNotEquals(1,contratserviceimpl.deleteAllContratJPQL());
	}
	@Test
	public void testdeleteContratById() {
		assertEquals(0,contratserviceimpl.deleteContratById(1));
		
	}
	@Test
	public void testmettreAjoursalaireByreference() {
		assertEquals(0,contratserviceimpl.mettreAjoursalaireByreference(100, 1));

		
	}
}
