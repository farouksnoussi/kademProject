package tn.agena3000.cloud.kademproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.agena3000.cloud.kademproject.entities.Universite;
import tn.agena3000.cloud.kademproject.services.IUniversite;

import java.util.List;

@RestController
@RequestMapping("/universite")
@RequiredArgsConstructor
public class UniversiteController {
    private final IUniversite universiteService;

    @RequestMapping("/")
    public List<Universite> getAllUniversites()
    {
        return universiteService.getAll() ;
    }

    @PostMapping("/add")
    public void ajouterUniversite(@RequestBody Universite universite)
    {
        universiteService.ajouterUniversite(universite);
    }
    @RequestMapping("/{id}")
    public Universite findUniversiteByID(@PathVariable ("id") int id)
    {
        return universiteService.getByID(id);
    }
    @DeleteMapping({"/{id}"})
    public void deleteUniversite(@PathVariable("id") int id)
    {
        universiteService.deleteUniversite(id);
    }
    @PutMapping({"/{id}"})
    public void updateUniversite(@RequestBody Universite universite)
    {
        universiteService.updateUniversite(universite);
    }
}
