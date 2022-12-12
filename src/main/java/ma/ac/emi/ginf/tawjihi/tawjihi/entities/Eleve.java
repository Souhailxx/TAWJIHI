package ma.ac.emi.ginf.tawjihi.tawjihi.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import ma.ac.emi.ginf.tawjihi.tawjihi.enumerations.Niveau;

import java.io.Serializable;


@Data
@Entity(name = "Eleves")
public class Eleve implements Serializable {

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

    @JsonIgnore
    @OneToOne(mappedBy = "eleve",
            cascade = CascadeType.ALL)
    private Test test;

    public void setTest(Test test) {
        this.test = test;
    }

    public Test getTest() {
        return test;
    }
}
