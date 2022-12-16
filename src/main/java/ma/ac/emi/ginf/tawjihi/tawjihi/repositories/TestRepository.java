package ma.ac.emi.ginf.tawjihi.tawjihi.repositories;

import ma.ac.emi.ginf.tawjihi.tawjihi.entities.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TestRepository extends JpaRepository<Test, UUID> {

    Test findTestByEleve_IdE(int idE);

    void deleteTestByEleve_IdE(int idE);

}
