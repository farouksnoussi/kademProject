package tn.agena3000.cloud.kademproject.services;

import tn.agena3000.cloud.kademproject.entities.Equipe;
import tn.agena3000.cloud.kademproject.entities.Etudiant;

import java.util.List;

public interface IEquipe {
    void ajouterEquipe(Equipe e);
    void updateEquipe(Equipe e);
    List<Equipe> getAll();
    Equipe getByID(Integer id);
    void deleteEquipe(Integer id);
}
