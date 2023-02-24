package tn.agena3000.cloud.kademproject.services;

import org.springframework.stereotype.Service;
import tn.agena3000.cloud.kademproject.entities.Departement;
import tn.agena3000.cloud.kademproject.repositories.DepartementRepository;

import java.util.List;

@Service
public class DepartementService implements IDepartement {
    private final DepartementRepository departementRepository;
    public DepartementService(DepartementRepository departementRepository) {
        this.departementRepository = departementRepository;
    }

    @Override
    public Departement ajouterDepartement(Departement d) {
        return departementRepository.save(d);
    }

    @Override
    public void updateDepartement(Departement d) {
        departementRepository.save(d);
    }

    @Override
    public List<Departement> getAll() {
        return departementRepository.findAll();
    }

    @Override
    public Departement getByID(Integer id) {
        return departementRepository.getById(id);
    }

    @Override
    public void deleteDepartement(Integer id) {
        departementRepository.deleteById(id);
    }
}
