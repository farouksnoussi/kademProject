package tn.agena3000.cloud.kademproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.agena3000.cloud.kademproject.entities.Etudiant;
import tn.agena3000.cloud.kademproject.services.IEtudiant;

import java.util.List;
@RestController
@RequestMapping("/etudiant")
@RequiredArgsConstructor
public class EtudiantController {
    private final IEtudiant etudiantService;

    @RequestMapping("/")
    public List<Etudiant> getAllEtudiants()
    {
        return etudiantService.getAll() ;
    }

    @PostMapping("/add")
    public void ajouterEtudiant(@RequestBody Etudiant etudiant)
    {
        etudiantService.ajouterEtudiant(etudiant);
    }
    @RequestMapping("/{id}")
    public Etudiant findEtudiantByID(@PathVariable ("id") int id)
    {
        return etudiantService.getByID(id);
    }
    @DeleteMapping({"/{id}"})
    public void deleteEtudiant(@PathVariable("id") int id)
    {
        etudiantService.deleteEtudiant(id);
    }
    @PutMapping({"/{id}"})
    public void updateEtudiant(@RequestBody Etudiant etudiant)
    {
        etudiantService.updateEtudiant(etudiant);
    }
}
