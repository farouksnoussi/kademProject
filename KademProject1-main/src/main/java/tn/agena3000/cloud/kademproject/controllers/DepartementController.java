package tn.agena3000.cloud.kademproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.agena3000.cloud.kademproject.entities.Departement;
import tn.agena3000.cloud.kademproject.services.IDepartement;

import java.util.List;

@RestController
@RequestMapping("/departement")
@RequiredArgsConstructor
public class DepartementController {
    private final IDepartement departementService;

    @RequestMapping("/")
    public List<Departement> getAllDepartements()
    {
        return departementService.getAll() ;
    }

    @PostMapping("/addDepartement")
    public Departement ajouterDepartement(@RequestBody Departement departement)
    {
       return departementService.ajouterDepartement(departement);
    }
    @RequestMapping("/{id}")
    public Departement findDepartementByID(@PathVariable ("id") int id)
    {
        return departementService.getByID(id);
    }
    @DeleteMapping({"/{id}"})
    public void deleteDepartement(@PathVariable("id") int id)
    {
        departementService.deleteDepartement(id);
    }
    @PutMapping({"/{id}"})
    public void updateDepartement(@RequestBody Departement departement)
    {
        departementService.updateDepartement(departement);
    }
}
