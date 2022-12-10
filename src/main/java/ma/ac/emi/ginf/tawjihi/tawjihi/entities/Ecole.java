package ma.ac.emi.ginf.tawjihi.tawjihi.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import ma.ac.emi.ginf.tawjihi.tawjihi.enumerations.Niveau;

@Entity
public class Ecole {

    @Id
    private int idEc;

    private String nom;
    private String ville;
    private int duree;  //Duree totale d'etude
    private Niveau nivDebut;
    private Niveau nivFin;
    private String description;

}
