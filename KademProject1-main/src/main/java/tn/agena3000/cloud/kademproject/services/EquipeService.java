package tn.agena3000.cloud.kademproject.services;

import org.springframework.stereotype.Service;
import tn.agena3000.cloud.kademproject.entities.Equipe;
import tn.agena3000.cloud.kademproject.repositories.EquipeRepository;

import java.util.List;

@Service
public class EquipeService implements IEquipe {
    private final EquipeRepository equipeRepository;
    public EquipeService(EquipeRepository equipeRepository) {
        this.equipeRepository = equipeRepository;
    }

    @Override
    public void ajouterEquipe(Equipe e) {
        equipeRepository.save(e);
    }

    @Override
    public void updateEquipe(Equipe e) {
        equipeRepository.save(e);
    }

    @Override
    public List<Equipe> getAll() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe getByID(Integer id) {
        return equipeRepository.getById(id);
    }

    @Override
    public void deleteEquipe(Integer id) {
        equipeRepository.deleteById(id);
    }
}
