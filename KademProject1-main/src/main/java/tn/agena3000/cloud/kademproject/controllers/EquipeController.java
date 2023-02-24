package tn.agena3000.cloud.kademproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.agena3000.cloud.kademproject.entities.Equipe;
import tn.agena3000.cloud.kademproject.services.IEquipe;

import java.util.List;

@RestController
@RequestMapping("/equipe")
@RequiredArgsConstructor
public class EquipeController {
    private final IEquipe equipeService;

    @RequestMapping("/")
    public List<Equipe> getAllEquipes()
    {
        return equipeService.getAll() ;
    }

    @PostMapping("/add")
    public void ajouterEquipe(@RequestBody Equipe equipe)
    {
        equipeService.ajouterEquipe(equipe);
    }
    @RequestMapping("/{id}")
    public Equipe findEquipeByID(@PathVariable ("id") int id)
    {
        return equipeService.getByID(id);
    }
    @DeleteMapping({"/{id}"})
    public void deleteEquipe(@PathVariable("id") int id)
    {
        equipeService.deleteEquipe(id);
    }
    @PutMapping({"/{id}"})
    public void updateEquipe(@RequestBody Equipe equipe)
    {
        equipeService.updateEquipe(equipe);
    }
}
