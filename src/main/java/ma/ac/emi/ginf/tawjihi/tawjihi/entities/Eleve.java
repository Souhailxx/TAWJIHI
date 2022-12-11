package ma.ac.emi.ginf.tawjihi.tawjihi.entities;


import jakarta.persistence.*;
import lombok.*;
import ma.ac.emi.ginf.tawjihi.tawjihi.enumerations.Niveau;


@Data
@Entity
public class Eleve {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idE;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private String prenom;
    @Column(nullable = false,unique = true,length = 50)
    private String email;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false)
    private Niveau niveau;

}
