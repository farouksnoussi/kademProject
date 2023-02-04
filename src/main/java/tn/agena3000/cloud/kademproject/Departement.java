package tn.agena3000.cloud.kademproject;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity

public class Departement {
    @Id
    private Integer idDepart;
    private String nomDepart;
}
