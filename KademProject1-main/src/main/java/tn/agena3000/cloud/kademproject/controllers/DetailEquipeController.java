package tn.agena3000.cloud.kademproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.agena3000.cloud.kademproject.entities.DetailEquipe;
import tn.agena3000.cloud.kademproject.services.IDetailEquipe;

import java.util.List;

@RestController
@RequestMapping("/detailEquipe")
@RequiredArgsConstructor
public class DetailEquipeController {
    private final IDetailEquipe detailEquipeService;

    @RequestMapping("/")
    public List<DetailEquipe> getAllDetailEquipes()
    {
        return detailEquipeService.getAll() ;
    }

    @PostMapping("/add")
    public void ajouterDetailEquipe(@RequestBody DetailEquipe detailEquipe)
    {
        detailEquipeService.ajouterDetailEquipe(detailEquipe);
    }
    @RequestMapping("/{id}")
    public DetailEquipe findDetailEquipeByID(@PathVariable ("id") int id)
    {
        return detailEquipeService.getByID(id);
    }
    @DeleteMapping({"/{id}"})
    public void deleteDetailEquipe(@PathVariable("id") int id)
    {
        detailEquipeService.deleteDetailEquipe(id);
    }
    @PutMapping({"/{id}"})
    public void updateDetailEquipe(@RequestBody DetailEquipe detailEquipe)
    {
        detailEquipeService.updateDetailEquipe(detailEquipe);
    }
}
