package tn.agena3000.cloud.kademproject;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Etudiant {
    @Id
    private int idEtudiant;
    private String prenomE;
    private String nomE;
    private Option option;

}
