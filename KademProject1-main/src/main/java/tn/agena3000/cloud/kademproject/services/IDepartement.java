package tn.agena3000.cloud.kademproject.services;

import tn.agena3000.cloud.kademproject.entities.Departement;

import java.util.List;

public interface IDepartement {
    Departement ajouterDepartement(Departement e);
    void updateDepartement(Departement e);
    List<Departement> getAll();
    Departement getByID(Integer id);
    void deleteDepartement(Integer id);
}
