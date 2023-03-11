package tn.agena3000.cloud.kademproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.agena3000.cloud.kademproject.entities.Contrat;
import tn.agena3000.cloud.kademproject.entities.Departement;
import tn.agena3000.cloud.kademproject.services.IContrat;
import tn.agena3000.cloud.kademproject.services.IDepartement;
import tn.agena3000.cloud.kademproject.services.IEtudiant;

import java.util.List;

@RestController
@RequestMapping("/contrat")
@RequiredArgsConstructor
public class ContratController {
    private final IContrat contratService;
    private final IEtudiant etudiantServise;

    @RequestMapping("/")
    public List<Contrat> getAllContrats()
    {
        return contratService.getAll() ;
    }

    @PostMapping("/add")
    public void ajouterContrat(@RequestBody Contrat contrat)
    {
        contratService.ajouterContrat(contrat);
    }
    @RequestMapping("/{id}")
    public Contrat findContratByID(@PathVariable ("id") int id)
    {
        return contratService.getByID(id);
    }
    @DeleteMapping({"/{id}"})
    public void deleteContrat(@PathVariable("id") int id)
    {
        contratService.deleteContrat(id);
    }
    @PutMapping({"/{id}"})
    public void updateContrat(@RequestBody Contrat contrat)
    {
        contratService.updateContrat(contrat);
    }
    @GetMapping("/{get}")
    public void etudiant(@PathVariable int idDepartement) {etudiantServise.getEtudiantsByDepartement(idDepartement);}

}
