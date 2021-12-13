package org.spring.service;

import org.spring.modele.Voiture;
import org.spring.modele.VoitureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class VoitureService {

	 @Autowired
	 VoitureRepo voitureRepo;
	 
	 public void ajouterV(Voiture v) {
		 voitureRepo.save(v);
	    }



	    public void modifierV(Voiture v,Long id) {
	    	Voiture vv= voitureRepo.findById(id).orElse(null);
	    	if(vv!=null) {
	    		vv.setAnnee(v.getAnnee());
	    		vv.setCouleur(v.getCouleur());
	    		vv.setImmatricule(v.getImmatricule());
	    		vv.setMarque(v.getMarque());
	    		vv.setModele(v.getModele());
	    		vv.setPrix(v.getPrix());
	    		voitureRepo.save(vv);
	    	}
	    
	    }




	    public void supprimerV(Long id) {
	    	voitureRepo.deleteById(id);
	    }
}
