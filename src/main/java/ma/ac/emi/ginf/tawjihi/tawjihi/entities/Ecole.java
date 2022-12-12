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
    @Nonnull
    private String nom;
    @Nonnull
    private Ville ville;
    @Nonnull
    private int duree;
    @Nonnull
    private Niveau nivDebut;
    @Nonnull
    private Niveau nivFin;
    private String description;

}
