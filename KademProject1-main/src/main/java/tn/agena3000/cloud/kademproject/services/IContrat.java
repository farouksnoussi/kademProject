package tn.agena3000.cloud.kademproject.services;

import tn.agena3000.cloud.kademproject.entities.Contrat;

import java.util.List;

public interface IContrat {
    void ajouterContrat(Contrat c);
    void updateContrat(Contrat c);
    List<Contrat> getAll();
    Contrat getByID(Integer id);
    void deleteContrat(Integer id);
}
