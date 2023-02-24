package tn.agena3000.cloud.kademproject.services;

import tn.agena3000.cloud.kademproject.entities.DetailEquipe;

import java.util.List;

public interface IDetailEquipe {
    void ajouterDetailEquipe(DetailEquipe e);
    void updateDetailEquipe(DetailEquipe e);
    List<DetailEquipe> getAll();
    DetailEquipe getByID(Integer id);
    void deleteDetailEquipe(Integer id);
}
