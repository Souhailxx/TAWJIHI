package ma.ac.emi.ginf.tawjihi.tawjihi.repositories;

import ma.ac.emi.ginf.tawjihi.tawjihi.entities.Test;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TestRepository extends JpaRepository<Test, UUID> {

    Test findTestByEleve_IdE(int idE);

    void deleteTestByEleve_IdE(int idE);

}
