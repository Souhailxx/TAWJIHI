package ma.ac.emi.ginf.tawjihi.tawjihi.entities;


import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.*;
import ma.ac.emi.ginf.tawjihi.tawjihi.enumerations.Niveau;
import ma.ac.emi.ginf.tawjihi.tawjihi.enumerations.Ville;
import org.hibernate.annotations.Columns;

import java.util.UUID;

@Data
@Entity
public class Ecole {

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
