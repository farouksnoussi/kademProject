package tn.agena3000.cloud.kademproject.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Universite {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer iduniv ;
    private String nomUniv;
    @OneToMany
    List<Departement> departements;
}