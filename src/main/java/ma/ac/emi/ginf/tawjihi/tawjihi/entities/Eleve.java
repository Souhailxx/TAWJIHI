package ma.ac.emi.ginf.tawjihi.tawjihi.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import ma.ac.emi.ginf.tawjihi.tawjihi.enumerations.Niveau;


@Data
@Entity
public class Eleve {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idE;

    private String nom;
    private String prenom;
    private String email;
    private int age;
    private Niveau niveau;

}
