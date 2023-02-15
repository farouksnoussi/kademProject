package tn.agena3000.cloud.kademproject.services;

import tn.agena3000.cloud.kademproject.entities.Etudiant;

import java.util.List;

public interface IEtudiant {
    void ajouterEtudiant(Etudiant e);
    void updateEtudiant(Etudiant e);
    List<Etudiant> getAll();
    Etudiant getByID(Integer id);
    void deleteEtudiant(Integer id);
}