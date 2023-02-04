package tn.agena3000.cloud.kademproject;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Universite {
    @Id
    private Integer iduniv ;
    private String nomUniv;
}
