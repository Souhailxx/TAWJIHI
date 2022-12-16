package ma.ac.emi.ginf.tawjihi.tawjihi.entities;


import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.*;
import ma.ac.emi.ginf.tawjihi.tawjihi.enumerations.Niveau;
import ma.ac.emi.ginf.tawjihi.tawjihi.enumerations.Ville;
import org.hibernate.annotations.Columns;

import java.io.Serializable;
import java.util.UUID;

@Data
@Entity(name = "Ecoles")
public class Ecole implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idEc;

    @Column(nullable = false) private String nom;
    @Column(nullable = false) private Ville ville;
    @Column(nullable = false) private int duree;

    @Enumerated
    @Column(name = "Niveau de Debut", nullable = false)
    private Niveau nivDebut;

    @Enumerated
    @Column(name = "Niveau de Fin", nullable = false)
    private Niveau nivFin;

    private String description;

    @Transient private int noteA;
    @Transient private int noteB;
    @Transient private int noteC;

}
