package tn.agena3000.cloud.kademproject;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Entity

public class Contrat {
    @Id
    private Integer idContrat ;
    private Date dateDebutContrat;
    private Date dateFinContrat ;
    private Specialite specialite;
    private Boolean archive;
    private Integer montantContrat;
}
