package tn.esprit.spring.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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


	//display 
	public List<Contrat> getAllContrats() {
		
		List<Contrat> mcontrat = new ArrayList<>();
		
		l.debug(" get all contrats is running now  ");
		try {
		return (List<Contrat>) contratRepository.findAll();
		
	} catch (Exception e) {
		l.error("Erreur dans getAllContrats() : " + e); // after throwing 
		return mcontrat;
	} 
	}

	//ajout contrat

	public int ajouterMonContrat(Contrat contrat) {
		
		l.debug(" ajout contrats is running now  ");
		
		try {
			l.info(" in ajout  ....  ");
		contratRepository.save(contrat);
		l.info(" out off add contrat  .....");
		return 1;
		
		} catch (Exception e) {
			l.error("Erreur dans ajouterMonContrat() : " + e);
			return 0 ;
			} 
	}

	//supprimer tt contrat 
	public int deleteAllContratJPQL() {
		
		l.debug(" delete all contrats is running now  ");
		
		try {
			l.info(" in delete all contrats ....  ");
			
		employeRepository.deleteAllContratJPQL();
		
		l.info(" out delete all contrats  .....");
		
		return 1;
		
		} catch (Exception e) {
			l.error("Erreur dans deleteAllContratJPQL()  : " + e);
			return 0 ;
			} 
	}

	//delete contrat by id 

	public int deleteContratById(int reference) {
		l.debug(" delete one contrats is running now  ");
		try {
			l.info(" in deleteContratById .....  ");

		Contrat contratManagedEntity = contratRepository.findById(reference).get();
		contratRepository.delete(contratManagedEntity);
		l.info(" out deleteContratById contrats  .....");

		return 1;
		} catch (Exception e) {
			l.error("Erreur dans deleteContratById  : " + e);
			return 0 ;
			} 

	}

	//maj de salaire d'un contrat preci

	public int mettreAjoursalaireByreference(float salaire, int reference) {
		
		l.debug(" maj de  contrats is running now  ");
		try {
			l.info(" in mettreAjoursalaireByreference .....  ");
		Contrat contrat = contratRepository.findById(reference).get();
		contrat.setSalaire(salaire);
		contratRepository.save(contrat);
		l.info(" out mettreAjoursalaireByreference  .....");
		return 1;
		} catch (Exception e) {
			l.error("Erreur dans mettreAjoursalaireByreference  : " + e);
			return 0 ;
			} 
	}








}
