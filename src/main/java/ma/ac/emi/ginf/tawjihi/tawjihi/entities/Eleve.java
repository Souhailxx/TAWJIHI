package ma.ac.emi.ginf.tawjihi.tawjihi.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import ma.ac.emi.ginf.tawjihi.tawjihi.enumerations.Niveau;

@Entity
public class Eleve {

    @Id
    private int idE;

    private String nom;
    private String prenom;
    private String email;
    private int age;
    private Niveau niveau;

}
