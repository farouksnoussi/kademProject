package tn.agena3000.cloud.kademproject.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class DetailEquipe {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer idDetailEquipe;
    Integer salle;
    private String thematique;
    @OneToOne
    Etudiant etudiant;
}