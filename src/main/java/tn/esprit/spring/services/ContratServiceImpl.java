package tn.esprit.spring.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Contrat;

import tn.esprit.spring.repository.ContratRepository;
import tn.esprit.spring.repository.EmployeRepository;

@Service
public class ContratServiceImpl implements IContratService {


	@Autowired
	ContratRepository contratRepository;

	@Autowired
	EmployeRepository employeRepository;


	///instanciation de logger

	private static final Logger l = LogManager.getLogger(ContratServiceImpl.class) ;

	
	List<Contrat> listecontrat = new ArrayList<>();
	
	
	
	Contrat ctra1 = new Contrat("ccp",2251786,100);

	Contrat ctra2 = new Contrat("cp",2251786,160);
	Contrat ctra3 = new Contrat("pp",1786,180);
	
	
	
	//ajout contrat

	public int ajouterMonContrat(List<Contrat> listecontrat,Contrat ctra1 ) {
		
		l.debug(" ajout contrats is running now  ");
		
		try {
			l.info(" in ajout  ....  ");
			
			listecontrat.add(ctra1);
			
			
			
		l.info(" out off add contrat  .....");
		return 1;
		
		} catch (Exception e) {
			l.error("Erreur dans ajouterMonContrat() : " + e);
			return 0 ;
			} 
	}
	//display 
		public int getAllContrats(List<Contrat> listecontrat) {
			
			Iterator<Contrat> itr = listecontrat.iterator();
		
			
			l.debug(" get all contrats is running now  ");
			try {
				l.info(" get all  ....  ");
				while(itr.hasNext())
				{
					l.debug(itr.next().toString());
				
				}
				l.info(" get all done ....  ");
				      
				return(1);	
		
			
		} catch (Exception e) {
			l.error("Erreur dans getAllContrats() : " + e); // after throwing 
			return 0;
		} 
		}


	//supprimer premier contrat 
	public int deleteContrat(List<Contrat> listecontrat) {
		
	
		    
		
		l.debug(" delete contrats is running now  ");
		
		try {
			l.info(" in delete contrats ....  ");
			
			listecontrat.remove(0);
		
		l.info(" out delete  contrats  .....");
		
		return 1;
		
		} catch (Exception e) {
			l.error("Erreur dans deleteAllContratJPQL()  : " + e);
			return 0 ;
			} 
	}



	public int mettreAjourSalaire(Contrat ctra1,List<Contrat> listecontrat) {
		
		l.debug(" maj de  contrats is running now  ");
		try {
			l.info(" in mettreAjoursalaire .....  ");
		ctra1.setSalaire(10);
		
		listecontrat.set(1,ctra1);
		
		
		l.info(" out mettreAjoursalaireDone .....");
		return 1;
		} catch (Exception e) {
			l.error("Erreur dans mettreAjoursalaire  : " + e);
			return 0 ;
			} 
	}











}
