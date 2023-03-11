package tn.agena3000.cloud.kademproject.services;

import tn.agena3000.cloud.kademproject.entities.Etudiant;

import java.util.List;

public interface IEtudiant {
    void ajouterEtudiant(Etudiant e);
    void updateEtudiant(Etudiant e);
    List<Etudiant> getAll();
    Etudiant getByID(Integer id);
    void deleteEtudiant(Integer id);
    void assugnEtudiantToDepartement(Integer etudiantId,Integer departemenId);
    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe);
    //hedhi avec java
    //public List<Etudiant> getEtudiantsByDepartement (Integer idDepartement);
    Etudiant getEtudiantsByDepartement(Integer idDepartement);
}
