package tn.agena3000.cloud.kademproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.agena3000.cloud.kademproject.entities.Etudiant;
public interface EtudiantRepository extends JpaRepository<Etudiant,Integer>{
    // fonction keyword , fama des fonction mahomch mawjoudin fil spring donc ta3ml fonction keyword (findByNomEAndPrenomE) ki dakhlelha fonction les paramétre fil fonction lezmek taba3 tartib eli ktebt bih esm fonction
    Etudiant findByNomEAndPrenomE(String nom, String prenom);

    //hedhi teb3a java o keyword
    //Etudiant findEtudiantByDepartement(Departement departement);

    //hedhy eli bl id_depart
    @Query("select e from Etudiant e where e.departement.iddepart = ?1")
    Etudiant findEtudiantByDepartementIddepart(int id_depart);
}
