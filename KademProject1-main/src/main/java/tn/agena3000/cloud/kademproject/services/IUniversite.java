package tn.agena3000.cloud.kademproject.services;

import tn.agena3000.cloud.kademproject.entities.Universite;

import java.util.List;

public interface IUniversite {
    void ajouterUniversite(Universite e);
    void updateUniversite(Universite e);
    List<Universite> getAll();
    Universite getByID(Integer id);
    void deleteUniversite(Integer id);
}
