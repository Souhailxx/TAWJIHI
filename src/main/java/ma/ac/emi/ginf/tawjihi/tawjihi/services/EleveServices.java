package ma.ac.emi.ginf.tawjihi.tawjihi.services;

import jakarta.transaction.Transactional;
import lombok.Data;
import ma.ac.emi.ginf.tawjihi.tawjihi.entities.Eleve;
import ma.ac.emi.ginf.tawjihi.tawjihi.repositories.EleveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class EleveServices {

    private final EleveRepository er;


    @Autowired
    public EleveServices(EleveRepository er) {
        this.er = er;
    }

    public List<Eleve> findallEleve(){
        return er.findAll();
    }

    public Eleve addEleve(Eleve e){
        return er.save(e);
    }

    @Transactional
    public void deleteEleve(int idE){
        er.deleteById(idE);
    }

//Dqdqsdqsdq

}
