package tn.agena3000.cloud.kademproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.agena3000.cloud.kademproject.entities.Contrat;
import tn.agena3000.cloud.kademproject.entities.Etudiant;
import tn.agena3000.cloud.kademproject.repositories.ContratRepository;
import tn.agena3000.cloud.kademproject.repositories.EtudiantRepository;

import java.util.List;

@Service
public class ContratService implements IContrat {
    @Autowired
    private final ContratRepository contratRepository;
    @Autowired
    private EtudiantRepository etudiantRepository;
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

    @Override
    public Contrat affectContratToEtudiant(Contrat ce, String nom, String prenomE) {
        Contrat contrat = contratRepository.findById(ce.getIdContrat()).orElse(null);
        Etudiant etudiant= etudiantRepository.findByNomEAndPrenomE(nom,prenomE);
        Assert.notNull(contrat, "universite must not be null.") ;
        Assert.notNull(etudiant, "universite must not be null.") ;
        if (etudiant.getContrat().size()>=5){
            return null;
        }
        etudiant.getContrat().add(contrat);
        etudiantRepository.save(etudiant);
        return contrat;

    }
}
