package ma.ac.emi.ginf.tawjihi.tawjihi.repositories;

import ma.ac.emi.ginf.tawjihi.tawjihi.entities.Eleve;
import ma.ac.emi.ginf.tawjihi.tawjihi.entities.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EleveRepository extends JpaRepository<Eleve, Integer> {

    Eleve getEleveByIdE(int idE);

}
