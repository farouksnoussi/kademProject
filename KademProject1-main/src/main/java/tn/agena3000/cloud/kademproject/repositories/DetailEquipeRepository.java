package tn.agena3000.cloud.kademproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.agena3000.cloud.kademproject.entities.DetailEquipe;

@Repository
public interface DetailEquipeRepository extends JpaRepository<DetailEquipe,Integer>{

}
