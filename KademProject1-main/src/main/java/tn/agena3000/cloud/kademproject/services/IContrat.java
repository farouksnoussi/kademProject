package tn.agena3000.cloud.kademproject.services;

import org.springframework.stereotype.Service;
import tn.agena3000.cloud.kademproject.entities.Contrat;

import java.util.List;
@Service
public interface IContrat {
    void ajouterContrat(Contrat c);
    void updateContrat(Contrat c);
    List<Contrat> getAll();
    Contrat getByID(Integer id);
    void deleteContrat(Integer id);
    Contrat affectContratToEtudiant (Contrat ce, String nom , String prenomE);
}
