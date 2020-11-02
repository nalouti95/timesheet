package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Contrat;


public interface IContratService {
	
	
	public  int getAllContrats(List<Contrat> listecontrat);
	
	public int ajouterMonContrat(List<Contrat> listecontrat,Contrat ctra1 );

	
	public int deleteContrat(List<Contrat> listecontrat) ;

	public int mettreAjourSalaire(Contrat ctra1,List<Contrat> listecontrat);
	
}
