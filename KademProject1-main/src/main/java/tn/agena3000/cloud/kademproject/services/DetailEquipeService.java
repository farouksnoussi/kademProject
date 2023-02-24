package tn.agena3000.cloud.kademproject.services;

import org.springframework.stereotype.Service;
import tn.agena3000.cloud.kademproject.entities.DetailEquipe;
import tn.agena3000.cloud.kademproject.repositories.DetailEquipeRepository;

import java.util.List;

@Service
public class DetailEquipeService implements IDetailEquipe {
    private final DetailEquipeRepository detailEquipeRepository;
    public DetailEquipeService(DetailEquipeRepository detailEquipeRepository) {
        this.detailEquipeRepository = detailEquipeRepository;
    }

    @Override
    public void ajouterDetailEquipe(DetailEquipe e) {
        detailEquipeRepository.save(e);
    }

    @Override
    public void updateDetailEquipe(DetailEquipe e) {
        detailEquipeRepository.save(e);
    }

    @Override
    public List<DetailEquipe> getAll() {
        return detailEquipeRepository.findAll();
    }

    @Override
    public DetailEquipe getByID(Integer id) {
        return detailEquipeRepository.getById(id);
    }

    @Override
    public void deleteDetailEquipe(Integer id) {
        detailEquipeRepository.deleteById(id);
    }
}
