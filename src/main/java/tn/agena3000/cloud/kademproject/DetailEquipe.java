package tn.agena3000.cloud.kademproject;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity

public class DetailEquipe {
    @Id
    private Integer idDetailEquipe;
     Integer salle;
     private String thematique;
}
