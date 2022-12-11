package ma.ac.emi.ginf.tawjihi.tawjihi.services;


import jakarta.transaction.Transactional;
import lombok.Data;
import ma.ac.emi.ginf.tawjihi.tawjihi.entities.Ecole;
import ma.ac.emi.ginf.tawjihi.tawjihi.entities.Eleve;
import ma.ac.emi.ginf.tawjihi.tawjihi.repositories.EcoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class EcoleServices {

    private final EcoleRepository err;

    @Autowired
    public EcoleServices(EcoleRepository err){
        this.err=err;
    }

    public List<Ecole> findallEcole(){
        return err.findAll();
    }

    public Ecole findEcolebyNom(String nom){
        return err.findEcoleByNom(nom);
    }

    public Ecole addEcole(Ecole e){
        return err.save(e);
    }

    @Transactional
    public void deleteEcole(int idEc){
        err.deleteById(idEc);
    }

    @Transactional
    public void deleteEcolebyNom(String nom){
        err.deleteEcoleByNom(nom);
    }
}
