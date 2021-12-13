package org.spring.web;

import org.spring.modele.Voiture;
import org.spring.modele.VoitureRepo;
import org.spring.service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins="http://localhost:3000")
public class VoitureController {
   @Autowired
   private VoitureRepo voitureRepo;
   @Autowired
   private VoitureService voitureServ;
   @RequestMapping("/voitures")
   public Iterable<Voiture> getVoitures(){
      return voitureRepo.findAll();
   }
   
   @RequestMapping(method= RequestMethod.POST, value="/voitures")
   public  void ajouterV(@RequestBody Voiture v) {
      
	   voitureServ.ajouterV(v);
	   
   }



   @RequestMapping(method=RequestMethod.PUT, value="/voitures/{id}")
   public  void modifierV(@RequestBody Voiture v,@PathVariable Long id) {
      
       voitureServ.modifierV(v,id);
   }



   @RequestMapping(method=RequestMethod.DELETE, value="/voitures/{id}")
   public void supprimerV(@PathVariable Long id) {
	   voitureServ.supprimerV(id);
   }
}