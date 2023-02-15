package tn.agena3000.cloud.kademproject.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEtudiant;
    private String prenomE;
    private String nomE;
    private Option option;
    @OneToMany(mappedBy = "etudiant")
    List<Contrat> contrat;
    @ManyToOne
    Departement departement;
    @ManyToMany
    List<Equipe> equipes;
    @OneToOne
    DetailEquipe detailEquipe;


}