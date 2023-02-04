package tn.agena3000.cloud.kademproject;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity

public class Equipe {
    @Id
    private Integer idEquipe;
    private String nomEquipe;
    private Niveau niveau;
}
