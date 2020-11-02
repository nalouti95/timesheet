package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Contrat;


public interface IContratService {
	
	
	public List<Contrat> getAllContrats();
	
	public int ajouterMonContrat(Contrat contrat);

	public int deleteAllContratJPQL();
	
	public int deleteContratById(int reference) ;

	public int mettreAjoursalaireByreference(float salaire, int reference);
	
}
