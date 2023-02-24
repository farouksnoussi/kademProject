package tn.agena3000.cloud.kademproject.services;

import org.springframework.stereotype.Service;
import tn.agena3000.cloud.kademproject.entities.Universite;
import tn.agena3000.cloud.kademproject.repositories.UniversiteRepository;

import java.util.List;

@Service
public class UniversiteService implements IUniversite {
    private final UniversiteRepository universiteRepository;
    public UniversiteService(UniversiteRepository universiteRepository) {
        this.universiteRepository = universiteRepository;
    }

    @Override
    public void ajouterUniversite(Universite u) {
        universiteRepository.save(u);
    }

    @Override
    public void updateUniversite(Universite u) {
        universiteRepository.save(u);
    }

    @Override
    public List<Universite> getAll() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite getByID(Integer id) {
        return universiteRepository.getById(id);
    }

    @Override
    public void deleteUniversite(Integer id) {
        universiteRepository.deleteById(id);
    }
}
