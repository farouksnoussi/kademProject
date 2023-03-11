package tn.agena3000.cloud.kademproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.agena3000.cloud.kademproject.entities.Contrat;
import tn.agena3000.cloud.kademproject.entities.Departement;
import tn.agena3000.cloud.kademproject.entities.Equipe;
import tn.agena3000.cloud.kademproject.entities.Etudiant;
import tn.agena3000.cloud.kademproject.repositories.ContratRepository;
import tn.agena3000.cloud.kademproject.repositories.DepartementRepository;
import tn.agena3000.cloud.kademproject.repositories.EquipeRepository;
import tn.agena3000.cloud.kademproject.repositories.EtudiantRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EtudiantService implements IEtudiant {
    @Autowired
    private final EtudiantRepository etudiantRepository;
    private DepartementRepository departementRepository;
    private final ContratRepository contratRepository;
    private final EquipeRepository equipeRepository;

    @Override
    public void ajouterEtudiant(Etudiant e) {
        etudiantRepository.save(e);
    }

    @Override
    public void updateEtudiant(Etudiant e) {
        etudiantRepository.save(e);
    }

    @Override
    public List<Etudiant> getAll() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant getByID(Integer id) {
        return etudiantRepository.getById(id);
    }

    @Override
    public void deleteEtudiant(Integer id) {
        etudiantRepository.deleteById(id);
    }

    @Override
    //bech t7ot kol etudiant fi departement mte3ou par id
    public void assugnEtudiantToDepartement(Integer etudiantId, Integer departementId) {
        //récupération des objets
        // Etudiant etudiant = this.getById(etudiantId);
        Etudiant etudiant = etudiantRepository.findById(etudiantId).orElse(null);
        Departement departement = departementRepository.findById(departementId).orElse(null);

        //vérification des objets
        if ((etudiant != null) && (departement != null)) {
            //traitement
            etudiant.setDepartement(departement);
            //departement.getEtu().add(etudiant);
            //saving
            etudiantRepository.save(etudiant);
        }

    }

    @Override
    @Transactional
    //
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe) {

        Contrat contrat = contratRepository.findById(idContrat).orElse(null);
        Equipe equipe = equipeRepository.findById(idEquipe).orElse(null);
        //assert: si contrat null maykemlch l'exécution o ykharejlk eli contrat mayelzemch ykoun null
        Assert.notNull(contrat, "contrat must not be null.");
        Assert.notNull(equipe, "equipe must not be null.");
        //ki yabda andi objet jdid me houch jei mil bd na3emlou 3 line
        List<Equipe> equipes = new ArrayList<>();
        equipes.add(equipe);
        e.setEquipes(equipes);
        // KHATER ANDICH LIST
        //saveAnd flash!!
        etudiantRepository.saveAndFlush(e);
        contrat.setEtudiant(e);
        //contratRepository.save(contrat);
        return e;
    }

    //Hedhi feha fazet keyword o b java

    //@Override
    //public List <Etudiant> getEtudiantsByDepartement( Integer idDepartement){
        //Etudiant etudiant = etudiantRepository.findById(idDepartement).orElse(null);
        //on recupére le département by id mte3ou
        //Departement departement = departementRepository.getById(idDepartement);
        //keyword
        //return etudiantRepository.findEtudiantByDepartement(departement);
        //bl java
        //Departement departement= departementRepository.findById(idDepartement).orElse(null);
        //return departement.getEtudiants();
    //}

    //hedhi avec l variable id_depart eli mawjouda fil entity dapartement
    @Override
    public Etudiant getEtudiantsByDepartement( Integer idDepartement){
       //Etudiant etudiant = etudiantRepository.findById(e.getIdEtudiant()).orElse(null);
        // on recupére le département by id mte3ou
       //Departement departement = departementRepository.getById(idDepartement);
        return etudiantRepository.findEtudiantByDepartement_Id_depart(idDepartement);
    }
}