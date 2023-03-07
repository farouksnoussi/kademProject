package tn.agena3000.cloud.kademproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Contrat {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer idContrat ;
    private Date dateDebutContrat;
    private Date dateFinContrat ;
    private Specialite specialite;
    private Boolean archive;
    private Integer montantContrat;
    @ManyToOne
    @JsonIgnore
    Etudiant etudiant;


}
