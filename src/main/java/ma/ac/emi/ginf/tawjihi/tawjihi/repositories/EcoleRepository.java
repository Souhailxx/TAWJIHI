package ma.ac.emi.ginf.tawjihi.tawjihi.repositories;

import jakarta.transaction.Transactional;
import ma.ac.emi.ginf.tawjihi.tawjihi.entities.Ecole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EcoleRepository extends JpaRepository<Ecole,Integer> {

    Ecole findEcoleByNom(String nom);

    void deleteEcoleByNom(String nom);
}
