package tn.agena3000.cloud.kademproject.services;

import org.springframework.stereotype.Service;
import tn.agena3000.cloud.kademproject.entities.Contrat;
import tn.agena3000.cloud.kademproject.repositories.ContratRepository;

import java.util.List;

@Service
public class ContratService implements IContrat {
    private final ContratRepository contratRepository;
    public ContratService(ContratRepository contratRepository) {
        this.contratRepository = contratRepository;
    }

    @Override
    public void ajouterContrat(Contrat c) {
        contratRepository.save(c);
    }

    @Override
    public void updateContrat(Contrat c) {
        contratRepository.save(c);
    }

    @Override
    public List<Contrat> getAll() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat getByID(Integer id) {
        return contratRepository.getById(id);
    }

    @Override
    public void deleteContrat(Integer id) {
        contratRepository.deleteById(id);
    }
}
