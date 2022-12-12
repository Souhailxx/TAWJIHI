package ma.ac.emi.ginf.tawjihi.tawjihi.services;


import jakarta.transaction.Transactional;
import lombok.Data;
import ma.ac.emi.ginf.tawjihi.tawjihi.entities.Eleve;
import ma.ac.emi.ginf.tawjihi.tawjihi.entities.Test;
import ma.ac.emi.ginf.tawjihi.tawjihi.exception.EleveNotFoundException;
import ma.ac.emi.ginf.tawjihi.tawjihi.repositories.EleveRepository;
import ma.ac.emi.ginf.tawjihi.tawjihi.repositories.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
public class TestServices {

    private final TestRepository tr;
    private final EleveRepository er;

    @Autowired
    public TestServices( TestRepository tr, EleveRepository er){
        this.tr = tr;
        this.er = er;
    }

    public Test findTest(int idE){
        return tr.findTestByEleve_IdE(idE);
    }

    public Test addTest(Test test, int idE){
        Eleve eleve = er.findById(idE)
                .orElseThrow(() -> new EleveNotFoundException("Eleve by id " + idE + " was not found"));
        eleve.setTest(test);
        test.setEleve(eleve);
        return tr.save(test);
    }

    @Transactional
    public void deleteTest(int idE){
        tr.deleteTestByEleve_IdE(idE);
    }
    
}


